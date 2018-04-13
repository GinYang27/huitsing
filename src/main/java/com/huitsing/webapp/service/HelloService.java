package com.huitsing.webapp.service;

import com.huitsing.webapp.model.HelloModel;

public interface HelloService {
	public HelloModel getHello(Integer helloId) throws Exception;
	public Boolean createHello(HelloModel helloModel) throws Exception;
	public Boolean updateHello(HelloModel helloModel, Integer helloId) throws Exception;
	public Boolean deleteHello(Integer helloId) throws Exception;
}
