package com.huitsing.webapp.model.response;

import com.huitsing.webapp.enumerate.Result;

public class OperationResponse {
	private Result result;
	private String reason;
	
	public Result getResult() {
		return result;
	}
	
	public void setResult(Result result) {
		this.result = result;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public static OperationResponse generateFailedResponse(String reason) {
		OperationResponse operationResponse = new OperationResponse();
		operationResponse.setResult(Result.UNSUCCESSFUL);
		operationResponse.setReason(reason);
		return operationResponse;
	}
	
	public static OperationResponse generateSuccessResponse() {
		OperationResponse operationResponse = new OperationResponse();
		operationResponse.setResult(Result.SUCCESSFUL);
		return operationResponse;
	}
	
	public Boolean isFailed() {
		return this.result == Result.UNSUCCESSFUL;
	}
}
