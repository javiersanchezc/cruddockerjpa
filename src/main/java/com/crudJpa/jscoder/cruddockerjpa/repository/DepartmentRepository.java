package com.crudJpa.jscoder.cruddockerjpa.repository;

import com.crudJpa.jscoder.cruddockerjpa.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

// Interface
public interface DepartmentRepository
        extends JpaRepository<Department, Long> {
}