package com.pivotalcloudfoundary.pcf.controller;


import com.pivotalcloudfoundary.pcf.model.Employee;
import com.pivotalcloudfoundary.pcf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pivitol-cloud-foundry")
public class TestController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/demo")
    public String demoAPI() {
        String aa = "Welcome to deployment in PIVITOL CLOUD FOUNDRY";
        return aa;
    }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = employeeService.employeeList();
        return employeeList;
    }
}
