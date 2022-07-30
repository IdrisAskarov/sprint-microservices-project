package com.mightycoder.sprmicrosproj1.department.repository;

import com.mightycoder.sprmicrosproj1.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
