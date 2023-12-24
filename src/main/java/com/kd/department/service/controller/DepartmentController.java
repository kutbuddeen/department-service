package com.kd.department.service.controller;

import com.kd.department.service.entity.Department;
import com.kd.department.service.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;
    @PostMapping(value = "/save-department", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
        return ResponseEntity.ok(departmentService.saveDepartment(department));
    }
    @GetMapping(value = "/get-all-department", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Department>> getAllDepartment(){
        return ResponseEntity.ok(departmentService.getAllDepartment());
    }
    @GetMapping(value = "/get-department/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Department>> getDepartmentById(@PathVariable Long id){
        return ResponseEntity.ok(departmentService.getDepartmentById(id));
    }

}
