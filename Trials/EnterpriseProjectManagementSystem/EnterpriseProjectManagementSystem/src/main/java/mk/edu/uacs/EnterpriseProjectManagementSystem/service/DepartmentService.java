package mk.edu.uacs.EnterpriseProjectManagementSystem.service;

import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Department;
import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Employee;
import mk.edu.uacs.EnterpriseProjectManagementSystem.exception.ResourceNotFoundException;
import mk.edu.uacs.EnterpriseProjectManagementSystem.repository.DepartmentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found with ID: " + id));
    }

    public Department createDepartment(Department department) {
        if (department.getBudget() < 0) {
            throw new IllegalStateException("Department budget cannot be negative");
        }
        return departmentRepository.save(department);
    }

    public Department updateDepartment(Long id, Department department) {
        Department existing = getDepartmentById(id);
        if (department.getBudget() < 0) {
            throw new IllegalStateException("Department budget cannot be negative");
        }
        existing.setName(department.getName());
        existing.setLocation(department.getLocation());
        existing.setBudget(department.getBudget());
        return departmentRepository.save(existing);
    }

    public void deleteDepartment(Long id) {
        Department existing = getDepartmentById(id);
        departmentRepository.delete(existing);
    }

    public List<Employee> getDepartmentEmployees(Long departmentId) {
        Department department = getDepartmentById(departmentId);
        return department.getEmployees();
    }

    public double getDepartmentBudgetUsage(Long departmentId) {
        Department department = getDepartmentById(departmentId);
        if (department.getBudget() <= 0) {
            return 0.0;
        }
        double totalSalaries = department.getEmployees().stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        return (totalSalaries / department.getBudget()) * 100.0;
    }
}
