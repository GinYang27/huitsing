package com.huitsing.webapp.service;

import com.huitsing.webapp.model.HelloModel;
import com.huitsing.webapp.model.response.OperationResponse;

public interface HelloService {
	public HelloModel getHello(Integer helloId) throws Exception;
	public OperationResponse createHello(HelloModel helloModel) throws Exception;
	public OperationResponse updateHello(HelloModel helloModel, Integer helloId) throws Exception;
	public OperationResponse deleteHello(Integer helloId) throws Exception;
}
