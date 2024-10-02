package com.example.kplearnspring.services;

import com.example.kplearnspring.model.Employee;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/bosch")
public class EmployeeServices {
    Employee employee;

    @GetMapping("/employees")
    public Employee getEmployee(@RequestParam String id){

        return employee;
    }

}
