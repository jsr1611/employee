package service;

/*
 * project:  employee
 * author:   Jumanazar Said
 * created:  09/12/2021 2:53 PM
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
}
