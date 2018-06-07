package com.huitsing.webapp.service.impl;

import java.sql.Timestamp;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huitsing.webapp.constant.WebsiteConstant;
import com.huitsing.webapp.dao.UserDAO;
import com.huitsing.webapp.entity.User;
import com.huitsing.webapp.model.auth.AuthModel;
import com.huitsing.webapp.model.auth.LoginModel;
import com.huitsing.webapp.model.response.OperationResponse;
import com.huitsing.webapp.service.AuthenticationService;
import com.huitsing.webapp.util.TimestampHelper;

@Service
@Transactional
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public AuthModel authenticate(LoginModel loginModel) throws Exception{
		AuthModel authModel = new AuthModel();
		User user = userDAO.findByEmail(loginModel.getEmail().toLowerCase().trim());
		if(user == null) {
			authModel.setResponse(OperationResponse.generateFailedResponse("Email is incorret."));
			return authModel;
		}
		if(user.getPassword() == null) {
			throw new Exception("This user doesn't have passowrd in database.");
		}
		if(!user.getPassword().equals(loginModel.getPassword())) {
			authModel.setResponse(OperationResponse.generateFailedResponse("Password is incorrect."));
			return authModel;
		}
		
		String token = issueToken(user);
		authModel.setToken(token);
		authModel.setUserId(user.getId());
		authModel.setResponse(OperationResponse.generateSuccessResponse());
		return authModel;
	}
	
	private String issueToken(User user) {
		String token = UUID.randomUUID().toString();
		Timestamp expiredDate = TimestampHelper.getExpirationDate(WebsiteConstant.TOKEN_VALID_DAYS);
		user.setToken(token);
		user.setTokenExpirationDate(expiredDate);
		userDAO.save(user);
		return token;
	}

}
