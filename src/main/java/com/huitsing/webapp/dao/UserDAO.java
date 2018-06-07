package com.huitsing.webapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.huitsing.webapp.entity.User;

public interface UserDAO extends CrudRepository<User, Long>{
	User findById(Integer id);
	User findByEmail(String email);

}
