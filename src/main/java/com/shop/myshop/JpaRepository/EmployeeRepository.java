package com.shop.myshop.JpaRepository;
import com.shop.myshop.service.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findByUsername(String username);
}
