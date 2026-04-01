package mk.edu.uacs.EnterpriseProjectManagementSystem.dto;

import mk.edu.uacs.EnterpriseProjectManagementSystem.enums.EmployeeRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateEmployeeRequest {

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotNull(message = "Role is required")
    private EmployeeRole role;

    @Positive(message = "Salary must be positive")
    private double salary;

    private boolean active;

    @NotNull(message = "Department ID is required")
    private Long departmentId;
}
