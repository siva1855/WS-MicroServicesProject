package com.verizon.digt.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.digt.user.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUserId(Integer userId);
}
