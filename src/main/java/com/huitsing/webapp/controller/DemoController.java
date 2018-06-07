package com.huitsing.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.huitsing.webapp.model.HelloModel;
import com.huitsing.webapp.model.response.OperationResponse;
import com.huitsing.webapp.service.HelloService;
import com.huitsing.webapp.validator.HelloModelValidator;


@RestController
@RequestMapping("/demo/")
public class DemoController {
	
	@Autowired
	private HelloService helloService;
	
	@Autowired
	private HelloModelValidator helloModelValidator;	
	
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
	public ResponseEntity<OperationResponse> createHello(@RequestBody HelloModel helloModel, BindingResult result) {
		helloModelValidator.validate(helloModel, result);
		if(result.hasErrors()) {
			return new ResponseEntity<>(OperationResponse.generateFailedResponse(result.getAllErrors().toString()), HttpStatus.BAD_REQUEST);
		}
		
		OperationResponse response = null;
		try {
			response = helloService.createHello(helloModel);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(OperationResponse.generateFailedResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	//Update a Hello entity in db
	@RequestMapping(value = "hello/{id}", method = RequestMethod.PUT)
	public ResponseEntity<OperationResponse> updateHello(@PathVariable("id") Integer helloId, @RequestBody HelloModel helloModel, BindingResult result) {
		helloModelValidator.validate(helloModel, result);
		if(result.hasErrors()) {
			return new ResponseEntity<>(OperationResponse.generateFailedResponse(result.getAllErrors().toString()), HttpStatus.BAD_REQUEST);
		}
		OperationResponse response = null;
		try {
			response = helloService.updateHello(helloModel, helloId);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(OperationResponse.generateFailedResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	//Delete a Hello entity in db
	@RequestMapping(value = "hello/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<OperationResponse> deleteHello(@PathVariable("id") Integer helloId) {
		OperationResponse response = null;
		try {
			response = helloService.deleteHello(helloId);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(OperationResponse.generateFailedResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	//This is just a demo for regex
	@RequestMapping(value = "regex/{input}", method = RequestMethod.GET)
	public ResponseEntity<String> deleteHello(@PathVariable("input") String input) {
		String response = null;
		try {
			//1.replace every char except A-Z, a-z, 0-9 with space. 
			//2.replace all spaces into one space 
			//3.split by space(including multiple spaces)
			response = input.toLowerCase().replaceAll("[^A-Za-z0-9]"," ").replaceAll("\\s\\s+", " ").split("\\s+").toString();
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
}
