package com.pivotalcloudfoundary.pcf.service;

import com.pivotalcloudfoundary.pcf.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> employeeList(){
        List<Employee> employees= new ArrayList<>();
        Employee emp=new Employee();
        emp.setName("emp1");
        emp.setDesignation("manager1");
        emp.setEmpId("1");
        emp.setSalary(3000);

        Employee emp1=new Employee();
        emp1.setName("emp2");
        emp1.setDesignation("manager");
        emp1.setEmpId("12");
        emp1.setSalary(30000);

        Employee emp2=new Employee();
        emp2.setName("emp9");
        emp2.setDesignation("manager7");
        emp2.setEmpId("16");
        emp2.setSalary(30000);
        employees.add(emp);
        employees.add(emp1);
        employees.add(emp2);
        return employees;

    }
}
