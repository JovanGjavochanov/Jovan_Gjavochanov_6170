package mk.edu.uacs.EnterpriseProjectManagementSystem.controller;

import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Department;
import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Employee;
import mk.edu.uacs.EnterpriseProjectManagementSystem.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartments() {
        return ResponseEntity.ok(departmentService.getAllDepartments());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {
        return ResponseEntity.ok(departmentService.getDepartmentById(id));
    }

    @PostMapping
    public ResponseEntity<Department> createDepartment(@Valid @RequestBody Department department) {
        return new ResponseEntity<>(departmentService.createDepartment(department), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Department> updateDepartment(@PathVariable Long id, @Valid @RequestBody Department department) {
        return ResponseEntity.ok(departmentService.updateDepartment(id, department));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
    }

    @GetMapping("/{id}/employees")
    public ResponseEntity<List<Employee>> getDepartmentEmployees(@PathVariable Long id) {
        return ResponseEntity.ok(departmentService.getDepartmentEmployees(id));
    }

    @GetMapping("/{id}/budget-usage")
    public ResponseEntity<Double> getDepartmentBudgetUsage(@PathVariable Long id) {
        return ResponseEntity.ok(departmentService.getDepartmentBudgetUsage(id));
    }
}
