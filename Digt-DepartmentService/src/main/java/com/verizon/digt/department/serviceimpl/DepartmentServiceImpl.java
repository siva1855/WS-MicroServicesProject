package com.verizon.digt.department.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.digt.department.bean.Department;
import com.verizon.digt.department.repository.DepartmentRepository;
import com.verizon.digt.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Integer saveDepartment(Department department) {
		log.info("Inside saveDepartment of DepartmentServiceImpl");
		return departmentRepository.save(department).getDepartmentId();
	}

	@Override
	public List<Department> getAllDepartments() {
		log.info("Inside getAllDepartments of DepartmentServiceImpl");
		return departmentRepository.findAll();
	}

	@Override
	public Optional<Department> getOneDepartment(Integer departmentId) {
		log.info("Inside getOneDepartment of DepartmentServiceImpl");
		return departmentRepository.findById(departmentId);
	}

	@Override
	public boolean isExist(Integer departmentId) {
		log.info("Inside isExist of DepartmentServiceImpl");
		return departmentRepository.existsById(departmentId);
	}

	@Override
	public void deleteDepartment(Integer departmentId) {
		log.info("Inside deleteDepartment of DepartmentServiceImpl");
		departmentRepository.deleteById(departmentId);
	}

}
