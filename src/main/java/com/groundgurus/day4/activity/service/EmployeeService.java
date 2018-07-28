
package com.groundgurus.day4.activity.service;

import com.groundgurus.day4.activity.entity.Employee;
import com.groundgurus.day4.activity.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    
    
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
