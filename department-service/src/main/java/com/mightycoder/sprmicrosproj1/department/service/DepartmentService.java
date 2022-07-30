package com.mightycoder.sprmicrosproj1.department.service;

import com.mightycoder.sprmicrosproj1.department.entity.Department;
import com.mightycoder.sprmicrosproj1.department.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentService {

    private final DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById of DepartmentService");
        return departmentRepository
                .findById(departmentId)
                .orElseThrow(() -> new RuntimeException("Department with id - " + departmentId + " is not found"));
    }
}
