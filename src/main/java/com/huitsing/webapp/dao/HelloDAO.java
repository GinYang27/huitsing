package com.huitsing.webapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.huitsing.webapp.entity.Hello;

public interface HelloDAO extends CrudRepository<Hello, Long>{
	Hello findById(Integer id);
}
