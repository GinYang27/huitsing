package com.huitsing.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.huitsing.webapp.model.auth.AuthModel;
import com.huitsing.webapp.model.auth.LoginModel;
import com.huitsing.webapp.model.response.OperationResponse;
import com.huitsing.webapp.service.AuthenticationService;
import com.huitsing.webapp.validator.LoginModelValidator;

@RestController
@RequestMapping("/authenticate/")
public class AuthenticateController {
	
	@Autowired
	private AuthenticationService authenticationService;
	
	@Autowired
	private LoginModelValidator loginModelValidator;
	
	@RequestMapping(value = "login", method = RequestMethod.PUT)
	public ResponseEntity<AuthModel> login(@RequestBody LoginModel loginModel, BindingResult result) {
		AuthModel response = null;
		loginModelValidator.validate(loginModel, result);
		if(result.hasErrors()) {
			response = new AuthModel();
			response.setResponse(OperationResponse.generateFailedResponse(result.getAllErrors().toString()));
			return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
		}
		try {
			response = authenticationService.authenticate(loginModel);
		} catch (Exception e) {
			e.printStackTrace();
			response = new AuthModel();
			response.setResponse(OperationResponse.generateFailedResponse(e.getMessage()));
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(response.getResponse().isFailed()) {
			return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
		} else {
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}
}
