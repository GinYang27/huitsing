package com.huitsing.webapp.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.huitsing.webapp.model.auth.LoginModel;

@Component
public class LoginModelValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return LoginModel.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		LoginModel loginModel = (LoginModel) target;

		if (loginModel == null) {
			errors.reject("Mode is null.");
			return;
		}

		if (loginModel.getEmail() == null || loginModel.getEmail().isEmpty()) {
			errors.reject("Email is null.");
			return;
		}

		if (loginModel.getPassword() == null || loginModel.getPassword().isEmpty()) {
			errors.reject("Password is null.");
			return;
		}

	}

}
