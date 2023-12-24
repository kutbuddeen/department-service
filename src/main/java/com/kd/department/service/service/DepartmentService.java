package com.kd.department.service.service;

import com.kd.department.service.entity.Department;
import com.kd.department.service.repo.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }
    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }
    public Optional<Department> getDepartmentById(Long id){
        return Optional.of(departmentRepository.findById(id)).orElseThrow(()-> new RuntimeException("Not Found !"));
    }
}
