package com.crudJpa.jscoder.cruddockerjpa.controller;

import com.crudJpa.jscoder.cruddockerjpa.entity.Department;
import com.crudJpa.jscoder.cruddockerjpa.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

 @Autowired
 private DepartmentService departmentService;
    // Save operation
    @PostMapping("/departments")

    public Department saveDepartment(
             @RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }

    // Read operation
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }

    // Update operation
    @PutMapping("/departments/{id}")
    public Department
    updateDepartment(@RequestBody Department department,
                     @PathVariable("id") Long departmentId)
    {
        return departmentService.updateDepartment(
                department, departmentId);
    }

    // Delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId)
    {
        departmentService.deleteDepartmentById(
                departmentId);

        return "Deleted Successfully";
    }


    @GetMapping("departments/{id}")
    public ResponseEntity<?> findDeparrmentById(@PathVariable("id") Long departmentId) {
        return new ResponseEntity (departmentService.findDepartmentById(departmentId), HttpStatus.ACCEPTED);
    }

}
