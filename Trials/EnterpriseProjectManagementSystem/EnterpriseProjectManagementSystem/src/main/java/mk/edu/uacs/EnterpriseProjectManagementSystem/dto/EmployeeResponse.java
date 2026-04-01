package mk.edu.uacs.EnterpriseProjectManagementSystem.dto;

import mk.edu.uacs.EnterpriseProjectManagementSystem.enums.EmployeeRole;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private EmployeeRole role;
    private double salary;
    private boolean active;
    private Long departmentId;
}
