package com.loxasoft.employeeservice.controller;

import com.loxasoft.employeeservice.dto.ResponseDTO;
import com.loxasoft.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import com.loxasoft.employeeservice.entity.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employes")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmploye(employee);
    }

    @GetMapping("/{id}")
    public ResponseDTO getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeById(id);
    }
}
