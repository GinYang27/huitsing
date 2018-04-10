package com.huitsing.webapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huitsing.webapp.dao.HelloDAO;
import com.huitsing.webapp.entity.Hello;
import com.huitsing.webapp.model.HelloModel;
import com.huitsing.webapp.service.HelloService;

@Service
@Transactional
public class HelloServiceImpl implements HelloService {
	
	@Autowired
	private HelloDAO helloDAO;

	@Override
	public HelloModel getHello() throws Exception {
		HelloModel model = new HelloModel();
		Hello hello = helloDAO.findById(1);
		if(hello == null) {
			throw new Exception("Hello is not valid.");
		}
		model.setTitle(hello.getContent());
		return model;
	}

}
