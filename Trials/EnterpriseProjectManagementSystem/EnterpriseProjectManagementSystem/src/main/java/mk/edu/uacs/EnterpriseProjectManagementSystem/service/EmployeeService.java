package mk.edu.uacs.EnterpriseProjectManagementSystem.service;

import mk.edu.uacs.EnterpriseProjectManagementSystem.dto.CreateEmployeeRequest;
import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Department;
import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Employee;
import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Project;
import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Task;
import mk.edu.uacs.EnterpriseProjectManagementSystem.exception.ResourceNotFoundException;
import mk.edu.uacs.EnterpriseProjectManagementSystem.repository.DepartmentRepository;
import mk.edu.uacs.EnterpriseProjectManagementSystem.repository.EmployeeRepository;
import mk.edu.uacs.EnterpriseProjectManagementSystem.repository.ProjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;
    private final ProjectRepository projectRepository;

    public EmployeeService(EmployeeRepository employeeRepository,
                           DepartmentRepository departmentRepository,
                           ProjectRepository projectRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
        this.projectRepository = projectRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with ID: " + id));
    }

    public Employee createEmployee(CreateEmployeeRequest request) {
        Department department = departmentRepository.findById(request.getDepartmentId())
                .orElseThrow(() -> new ResourceNotFoundException("Department not found with ID: " + request.getDepartmentId()));

        Employee employee = new Employee();
        employee.setFirstName(request.getFirstName());
        employee.setLastName(request.getLastName());
        employee.setEmail(request.getEmail());
        employee.setRole(request.getRole());
        employee.setSalary(request.getSalary());
        employee.setActive(request.isActive());
        employee.setDepartment(department);

        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee employee) {
        Employee existing = getEmployeeById(id);
        
        existing.setFirstName(employee.getFirstName());
        existing.setLastName(employee.getLastName());
        existing.setEmail(employee.getEmail());
        existing.setRole(employee.getRole());
        existing.setSalary(employee.getSalary());
        existing.setActive(employee.isActive());
        
        if (employee.getDepartment() != null) {
            Department dept = departmentRepository.findById(employee.getDepartment().getId())
                    .orElseThrow(() -> new ResourceNotFoundException("Department not found with ID: " + employee.getDepartment().getId()));
            existing.setDepartment(dept);
        }

        return employeeRepository.save(existing);
    }

    public void deleteEmployee(Long id) {
        Employee existing = getEmployeeById(id);
        employeeRepository.delete(existing);
    }

    public Employee assignEmployeeToProject(Long employeeId, Long projectId) {
        Employee employee = getEmployeeById(employeeId);
        if (!employee.isActive()) {
            throw new IllegalStateException("Inactive employees cannot join projects");
        }

        Project project = projectRepository.findById(projectId)
                .orElseThrow(() -> new ResourceNotFoundException("Project not found with ID: " + projectId));

        if (!employee.getProjects().contains(project)) {
            employee.getProjects().add(project);
            project.getEmployees().add(employee);
            projectRepository.save(project);
        }

        return employeeRepository.save(employee);
    }

    public Employee removeEmployeeFromProject(Long employeeId, Long projectId) {
        Employee employee = getEmployeeById(employeeId);
        Project project = projectRepository.findById(projectId)
                .orElseThrow(() -> new ResourceNotFoundException("Project not found with ID: " + projectId));

        if (employee.getProjects().contains(project)) {
            employee.getProjects().remove(project);
            project.getEmployees().remove(employee);
            projectRepository.save(project);
        }

        return employeeRepository.save(employee);
    }

    public List<Task> getEmployeeTasks(Long employeeId) {
        Employee employee = getEmployeeById(employeeId);
        return employee.getTasks();
    }
}
