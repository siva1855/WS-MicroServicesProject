package com.verizon.digt.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.digt.department.bean.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
