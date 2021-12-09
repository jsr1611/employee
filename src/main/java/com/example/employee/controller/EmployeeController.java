package com.example.employee.controller;
/*
 * project:  employee
 * author:   Jumanazar Said
 * created:  09/12/2021 2:38 PM
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService empService;

}
