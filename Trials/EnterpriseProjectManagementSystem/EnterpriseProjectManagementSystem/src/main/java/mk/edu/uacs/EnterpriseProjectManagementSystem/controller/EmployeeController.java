package mk.edu.uacs.EnterpriseProjectManagementSystem.controller;

import mk.edu.uacs.EnterpriseProjectManagementSystem.dto.CreateEmployeeRequest;
import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Employee;
import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Task;
import mk.edu.uacs.EnterpriseProjectManagementSystem.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody CreateEmployeeRequest request) {
        return new ResponseEntity<>(employeeService.createEmployee(request), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @Valid @RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.updateEmployee(id, employee));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @PostMapping("/{employeeId}/projects/{projectId}")
    public ResponseEntity<Employee> assignEmployeeToProject(@PathVariable Long employeeId, @PathVariable Long projectId) {
        return ResponseEntity.ok(employeeService.assignEmployeeToProject(employeeId, projectId));
    }

    @DeleteMapping("/{employeeId}/projects/{projectId}")
    public ResponseEntity<Employee> removeEmployeeFromProject(@PathVariable Long employeeId, @PathVariable Long projectId) {
        return ResponseEntity.ok(employeeService.removeEmployeeFromProject(employeeId, projectId));
    }

    @GetMapping("/{id}/tasks")
    public ResponseEntity<List<Task>> getEmployeeTasks(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeTasks(id));
    }
}
