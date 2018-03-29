package com.huitsing.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.huitsing.webapp.model.HelloModel;
import com.huitsing.webapp.service.HelloService;


@RestController
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
	
	@RequestMapping(value = "getHello", method = RequestMethod.GET)
	public ResponseEntity<HelloModel> getHello() {
		HelloModel hello = null;
		try {
			hello = helloService.getHello();
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(hello, HttpStatus.OK);
	}
}
