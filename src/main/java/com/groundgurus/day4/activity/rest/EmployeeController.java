
package com.groundgurus.day4.activity.rest;

import com.groundgurus.day4.activity.entity.Employee;
import com.groundgurus.day4.activity.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
 
    @GetMapping  
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
