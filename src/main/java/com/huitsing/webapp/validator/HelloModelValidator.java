package com.huitsing.webapp.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.huitsing.webapp.model.HelloModel;

@Component
public class HelloModelValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return HelloModel.class.equals(arg0);
	}

	@Override
	public void validate(Object target, Errors errors) {
		HelloModel helloModel = (HelloModel) target;
		
		if(helloModel == null) {
			errors.reject("Mode is null.");
			return;
		}
		
		if(helloModel.getTitle() == null || helloModel.getTitle().isEmpty()) {
			errors.reject("Title is null.");
			return;
		}
		
		if(helloModel.getContent() == null || helloModel.getContent().isEmpty()) {
			errors.reject("Content is null.");
			return;
		}
		
	}
}
