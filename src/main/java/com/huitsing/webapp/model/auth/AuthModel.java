package com.huitsing.webapp.model.auth;

import com.huitsing.webapp.model.response.OperationResponse;

public class AuthModel {
	private Integer userId;
	private String token;
	private OperationResponse response;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public OperationResponse getResponse() {
		return response;
	}
	public void setResponse(OperationResponse response) {
		this.response = response;
	}
}
