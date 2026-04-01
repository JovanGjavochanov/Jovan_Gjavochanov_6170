package mk.edu.uacs.EnterpriseProjectManagementSystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import mk.edu.uacs.EnterpriseProjectManagementSystem.enums.ProjectStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"employees", "tasks"})
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Project name is required")
    private String name;

    private String description;

    private LocalDate startDate;
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private ProjectStatus status;

    private double budget;

    @ManyToMany(mappedBy = "projects", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("projects")
    private List<Employee> employees = new ArrayList<>();

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnoreProperties("project")
    private List<Task> tasks = new ArrayList<>();
}
