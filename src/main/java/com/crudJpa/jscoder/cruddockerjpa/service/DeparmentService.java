package com.crudJpa.jscoder.cruddockerjpa.service;

import com.crudJpa.jscoder.cruddockerjpa.entity.Department;

import java.util.List;

public interface DeparmentService {
    // Save operation
    Department saveDepartment(Department department);

    // Read operation
    List<Department> fetchDepartmentList();

    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);
    // Update operation
    Department
    findDepartmentById(Long departmentId);

    // Delete operation
    void deleteDepartmentById(Long departmentId);
}
