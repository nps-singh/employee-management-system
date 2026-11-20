package com.narendra.employee.repository;

import com.narendra.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);
    List<Employee> findByNameContainingIgnoreCase(String name);
    List<Employee> findByDepartmentIgnoreCase(String department);
}
