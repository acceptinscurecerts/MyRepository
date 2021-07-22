package com.DemoTests;

import com.qmetry.qaf.automation.step.WsStep;
import com.sun.jersey.api.client.ClientResponse;

public class APITest {
	
	ClientResponse cr;
	
	public void createReq() {
		cr = WsStep.userRequests("/api/characters/1");
	}
	
}
