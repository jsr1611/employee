package com.example.employee.repository;

/*
 * project:  employee
 * author:   Jumanazar Said
 * created:  09/12/2021 2:51 PM
 */


import com.example.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
