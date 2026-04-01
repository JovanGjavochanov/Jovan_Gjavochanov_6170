package mk.edu.uacs.EnterpriseProjectManagementSystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import mk.edu.uacs.EnterpriseProjectManagementSystem.enums.EmployeeRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"department", "projects", "tasks"})
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @Enumerated(EnumType.STRING)
    private EmployeeRole role;

    @Positive(message = "Salary must be positive")
    private double salary;

    private boolean active;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    @JsonIgnoreProperties("employees")
    private Department department;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "employee_project",
        joinColumns = @JoinColumn(name = "employee_id"),
        inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    @JsonIgnoreProperties("employees")
    private List<Project> projects = new ArrayList<>();

    @OneToMany(mappedBy = "assignee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnoreProperties("assignee")
    private List<Task> tasks = new ArrayList<>();
}
