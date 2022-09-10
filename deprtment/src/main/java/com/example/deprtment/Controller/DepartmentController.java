package com.example.deprtment.Controller;

import com.example.deprtment.Entity.Department;
import com.example.deprtment.Service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/{id}")
    public Department findByDepartmentId(@PathVariable("id") Long departmentId){
        log.info("inside findByDepartmentId() method of DepartmentController");
        return departmentService.findByDepartmentId(departmentId);
    }

    @PostMapping("/")
    public void saveDepartment(Department department){
        log.info("inside saveDepartment() method of DepartmentController");
        departmentService.saveDepartment(department);
    }
}
