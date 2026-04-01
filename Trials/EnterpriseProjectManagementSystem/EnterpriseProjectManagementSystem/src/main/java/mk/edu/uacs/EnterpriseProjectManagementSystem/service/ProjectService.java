package mk.edu.uacs.EnterpriseProjectManagementSystem.service;

import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Project;
import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Task;
import mk.edu.uacs.EnterpriseProjectManagementSystem.enums.TaskStatus;
import mk.edu.uacs.EnterpriseProjectManagementSystem.exception.ResourceNotFoundException;
import mk.edu.uacs.EnterpriseProjectManagementSystem.repository.ProjectRepository;
import mk.edu.uacs.EnterpriseProjectManagementSystem.repository.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProjectService {

    private final ProjectRepository projectRepository;
    private final TaskRepository taskRepository;

    public ProjectService(ProjectRepository projectRepository, TaskRepository taskRepository) {
        this.projectRepository = projectRepository;
        this.taskRepository = taskRepository;
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project getProjectById(Long id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Project not found with ID: " + id));
    }

    public Project createProject(Project project) {
        validateProjectDates(project);
        return projectRepository.save(project);
    }

    public Project updateProject(Long id, Project project) {
        Project existing = getProjectById(id);
        validateProjectDates(project);

        existing.setName(project.getName());
        existing.setDescription(project.getDescription());
        existing.setStartDate(project.getStartDate());
        existing.setEndDate(project.getEndDate());
        existing.setStatus(project.getStatus());
        existing.setBudget(project.getBudget());

        return projectRepository.save(existing);
    }

    public void deleteProject(Long id) {
        Project existing = getProjectById(id);
        projectRepository.delete(existing);
    }

    public List<Project> searchProjects(String keyword) {
        return projectRepository.findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(keyword, keyword);
    }

    public Project addTaskToProject(Long projectId, Task task) {
        Project project = getProjectById(projectId);
        task.setProject(project);
        taskRepository.save(task);
        // Refresh project to contain the new task in the list
        project.getTasks().add(task);
        return projectRepository.save(project);
    }

    public double getProjectProgress(Long projectId) {
        Project project = getProjectById(projectId);
        List<Task> tasks = project.getTasks();
        if (tasks.isEmpty()) {
            return 0.0;
        }
        long doneCount = tasks.stream()
                .filter(t -> t.getStatus() == TaskStatus.DONE)
                .count();
        return ((double) doneCount / tasks.size()) * 100.0;
    }

    private void validateProjectDates(Project project) {
        if (project.getStartDate() != null && project.getEndDate() != null) {
            if (project.getEndDate().isBefore(project.getStartDate())) {
                throw new IllegalStateException("Project end date cannot be before start date");
            }
        }
    }
}
