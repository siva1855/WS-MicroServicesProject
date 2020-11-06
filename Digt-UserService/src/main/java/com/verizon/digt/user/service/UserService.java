package com.verizon.digt.user.service;

import java.util.List;
import java.util.Optional;

import com.verizon.digt.user.bean.User;
import com.verizon.digt.user.template.UserDepartmentResponseTemplate;

public interface UserService {

	public Integer saveUser(User user);

	public List<User> getAllUsers();

	public Optional<User> getOneUser(Integer userId);

	public boolean isExist(Integer userId);

	public void deleteUser(Integer userId);

	public UserDepartmentResponseTemplate getUserWithDepartment(Integer userId); 
	
}
