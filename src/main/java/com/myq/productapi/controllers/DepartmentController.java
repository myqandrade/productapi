package com.myq.productapi.controllers;

import com.myq.productapi.entities.Department;
import com.myq.productapi.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> findAll(){
        return departmentRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public void create(@RequestBody Department department){
        departmentRepository.save(department);
    }
}
