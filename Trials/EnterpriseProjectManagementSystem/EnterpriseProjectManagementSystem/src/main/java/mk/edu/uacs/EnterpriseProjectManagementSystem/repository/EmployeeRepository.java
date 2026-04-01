package mk.edu.uacs.EnterpriseProjectManagementSystem.repository;

import mk.edu.uacs.EnterpriseProjectManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
