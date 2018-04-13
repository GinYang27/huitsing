package com.huitsing.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	//Read a Hello entity
	@RequestMapping(value = "hello/{id}", method = RequestMethod.GET)
	public ResponseEntity<HelloModel> getHello(@PathVariable("id") Integer helloId) {
		HelloModel hello = null;
		try {
			hello = helloService.getHello(helloId);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(hello, HttpStatus.OK);
	}
	
	//Create a Hello entity in db
	@RequestMapping(value = "hello", method = RequestMethod.POST)
	public ResponseEntity<Boolean> createHello(@RequestBody HelloModel helloModel) {
		Boolean result = null;
		try {
			result = helloService.createHello(helloModel);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	//Update a Hello entity in db
	@RequestMapping(value = "hello/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> updateHello(@PathVariable("id") Integer helloId, @RequestBody HelloModel helloModel) {
		Boolean result = null;
		try {
			result = helloService.updateHello(helloModel, helloId);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	//Delete a Hello entity in db
	@RequestMapping(value = "hello/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteHello(@PathVariable("id") Integer helloId) {
		Boolean result = null;
		try {
			result = helloService.deleteHello(helloId);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
}
