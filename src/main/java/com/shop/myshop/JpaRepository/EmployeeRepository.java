package com.shop.myshop.JpaRepository;
import com.shop.myshop.Application.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findByUsername(String username);
}
