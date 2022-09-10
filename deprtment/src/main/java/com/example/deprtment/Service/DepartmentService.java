package com.example.deprtment.Service;

import com.example.deprtment.Entity.Department;
import com.example.deprtment.Repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public Department findByDepartmentId(Long departmentId) {
        log.info("inside findByDepartmentId() method of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }

    public void saveDepartment(Department department) {
        log.info("inside saveDepartment() method of DepartmentService");
        departmentRepository.save(department);
    }
}
