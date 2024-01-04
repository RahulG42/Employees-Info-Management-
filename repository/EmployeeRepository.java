package com.demo.EmployeeCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.EmployeeCrud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	
}
