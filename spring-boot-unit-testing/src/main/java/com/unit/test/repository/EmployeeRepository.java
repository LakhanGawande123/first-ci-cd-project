package com.unit.test.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unit.test.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);

}
