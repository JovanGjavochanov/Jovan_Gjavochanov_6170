package mk.edu.uacs.EnterpriseProjectManagementSystem.controller;

import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Project;
import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Task;
import mk.edu.uacs.EnterpriseProjectManagementSystem.service.ProjectService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public ResponseEntity<List<Project>> getAllProjects() {
        return ResponseEntity.ok(projectService.getAllProjects());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable Long id) {
        return ResponseEntity.ok(projectService.getProjectById(id));
    }

    @PostMapping
    public ResponseEntity<Project> createProject(@Valid @RequestBody Project project) {
        return new ResponseEntity<>(projectService.createProject(project), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Project> updateProject(@PathVariable Long id, @Valid @RequestBody Project project) {
        return ResponseEntity.ok(projectService.updateProject(id, project));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Project>> searchProjects(@RequestParam String keyword) {
        return ResponseEntity.ok(projectService.searchProjects(keyword));
    }

    @PostMapping("/{projectId}/tasks")
    public ResponseEntity<Project> addTaskToProject(@PathVariable Long projectId, @Valid @RequestBody Task task) {
        return ResponseEntity.ok(projectService.addTaskToProject(projectId, task));
    }

    @GetMapping("/{id}/progress")
    public ResponseEntity<Double> getProjectProgress(@PathVariable Long id) {
        return ResponseEntity.ok(projectService.getProjectProgress(id));
    }
}
