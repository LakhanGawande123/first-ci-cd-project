package com.unit.test.service;

import java.util.List;
import java.util.Optional;

import com.unit.test.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(long id);
    Employee updateEmployee(Employee employee,long id);
    void deleteEmployee(long id);

}
