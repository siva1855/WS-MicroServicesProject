package com.verizon.digt.user.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.digt.user.bean.User;
import com.verizon.digt.user.feignclient.UserFeignClient;
import com.verizon.digt.user.repository.UserRepository;
import com.verizon.digt.user.service.UserService;
import com.verizon.digt.user.template.UserDepartmentResponseTemplate;
import com.verizon.digt.user.vo.DepartmentVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserFeignClient userFeignClient;

	@Override
	public Integer saveUser(User user) {
		log.info("Inside saveUser of UserServiceImpl");
		return userRepository.save(user).getUserId();
	}

	@Override
	public List<User> getAllUsers() {
		log.info("Inside getAllUsers of UserServiceImpl");
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getOneUser(Integer userId) {
		log.info("Inside getOneUser of UserServiceImpl");
		return userRepository.findById(userId);
	}

	@Override
	public boolean isExist(Integer userId) {
		log.info("Inside isExist of UserServiceImpl");
		return userRepository.existsById(userId);
	}

	@Override
	public void deleteUser(Integer userId) {
		log.info("Inside deleteUser of UserServiceImpl");
		userRepository.deleteById(userId);
	}

	@Override
	public UserDepartmentResponseTemplate getUserWithDepartment(Integer userId) {
		log.info("Inside getUserWithDepartment of UserServiceImpl");
		UserDepartmentResponseTemplate userDepartmentResponseTemplate = new UserDepartmentResponseTemplate();
		User user = userRepository.findByUserId(userId);
		DepartmentVO departmentVO = userFeignClient.getUserDept(user.getDepartmentId());
		userDepartmentResponseTemplate.setUser(user);
		userDepartmentResponseTemplate.setDepartmentVO(departmentVO);
		return userDepartmentResponseTemplate;
	}

}
