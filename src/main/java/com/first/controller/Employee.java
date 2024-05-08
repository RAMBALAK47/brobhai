package com.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class Employee {

    @GetMapping("/address")
    public String getEmployeeAddress(){
        return "Rambalak Kumar, Bihar";
    }
}
