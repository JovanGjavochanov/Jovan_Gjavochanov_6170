package mk.edu.uacs.EnterpriseProjectManagementSystem.repository;

import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
