package com.groundgurus.day4.activity.repository;

import com.groundgurus.day4.activity.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
  
    
// @Query(SELECT e FROM Employee e WHERE firstName = :fn)
   // Employee findByVariety(String fn)
    
}
