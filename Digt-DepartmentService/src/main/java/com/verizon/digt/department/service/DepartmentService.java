package com.verizon.digt.department.service;

import java.util.List;
import java.util.Optional;

import com.verizon.digt.department.bean.Department;

public interface DepartmentService {

	public Integer saveDepartment(Department department);

	public List<Department> getAllDepartments();

	public Optional<Department> getOneDepartment(Integer departmentId);

	public boolean isExist(Integer departmentId);

	public void deleteDepartment(Integer departmentId);
}
