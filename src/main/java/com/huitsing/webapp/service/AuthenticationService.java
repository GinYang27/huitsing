package com.huitsing.webapp.service;

import com.huitsing.webapp.model.auth.AuthModel;
import com.huitsing.webapp.model.auth.LoginModel;

public interface AuthenticationService {
	public AuthModel authenticate(LoginModel model) throws Exception;
}
