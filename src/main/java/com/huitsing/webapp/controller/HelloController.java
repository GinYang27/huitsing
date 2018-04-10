package com.huitsing.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.huitsing.webapp.model.HelloModel;
import com.huitsing.webapp.service.HelloService;


@RestController
@RequestMapping("/demo/")
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
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(hello, HttpStatus.OK);
	}
	
	@RequestMapping(value = "hello", method = RequestMethod.POST)
	public ResponseEntity<Boolean> createHello(@RequestBody HelloModel helloModel) {
		HelloModel hello = null;
		try {
			hello = helloService.getHello();
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
}
