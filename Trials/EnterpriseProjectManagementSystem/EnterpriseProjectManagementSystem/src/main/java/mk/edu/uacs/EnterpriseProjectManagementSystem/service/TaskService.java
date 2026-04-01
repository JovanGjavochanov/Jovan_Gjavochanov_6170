package mk.edu.uacs.EnterpriseProjectManagementSystem.service;

import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Employee;
import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Task;
import mk.edu.uacs.EnterpriseProjectManagementSystem.enums.TaskPriority;
import mk.edu.uacs.EnterpriseProjectManagementSystem.enums.TaskStatus;
import mk.edu.uacs.EnterpriseProjectManagementSystem.exception.ResourceNotFoundException;
import mk.edu.uacs.EnterpriseProjectManagementSystem.repository.EmployeeRepository;
import mk.edu.uacs.EnterpriseProjectManagementSystem.repository.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class TaskService {

    private final TaskRepository taskRepository;
    private final EmployeeRepository employeeRepository;

    public TaskService(TaskRepository taskRepository, EmployeeRepository employeeRepository) {
        this.taskRepository = taskRepository;
        this.employeeRepository = employeeRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Task not found with ID: " + id));
    }

    public Task createTask(Task task) {
        if (task.getDueDate() != null && task.getDueDate().isBefore(LocalDate.now())) {
            throw new IllegalStateException("Task due date cannot be in the past");
        }
        return taskRepository.save(task);
    }

    public Task updateTaskStatus(Long id, TaskStatus status) {
        Task task = getTaskById(id);
        task.setStatus(status);
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        Task existing = getTaskById(id);
        taskRepository.delete(existing);
    }

    public Task assignTask(Long taskId, Long employeeId) {
        Task task = getTaskById(taskId);
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with ID: " + employeeId));

        if (!employee.isActive()) {
            throw new IllegalStateException("Cannot assign tasks to inactive employee");
        }

        task.setAssignee(employee);
        return taskRepository.save(task);
    }

    public List<Task> getTasksByPriority(TaskPriority priority) {
        return taskRepository.findByPriority(priority);
    }

    public List<Task> getOverdueTasks() {
        return taskRepository.findByDueDateBefore(LocalDate.now());
    }
}
