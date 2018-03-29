package com.huitsing.webapp.service.impl;

import org.springframework.stereotype.Service;

import com.huitsing.webapp.model.HelloModel;
import com.huitsing.webapp.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public HelloModel getHello() {
		HelloModel model = new HelloModel();
		model.setTitle("This is a demo");
		return model;
	}

}
