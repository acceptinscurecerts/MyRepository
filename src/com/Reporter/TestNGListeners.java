package com.Reporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNGListeners implements ITestListener {
	
	@Override
	public void onStart(ITestContext arg0) {
		Reporter.log("Test Started");
	}
	
	
	
	@Override
	public void onFinish(ITestContext arg0) {
		Reporter.log("Test Finished");
	}
	
	@Override		
    public void onTestSuccess(ITestResult arg0) {					
    	Reporter.log("Test Successfully passed");

    }
	
	@Override		
    public void onTestFailure(ITestResult arg0) {					
    	Reporter.log("Test Case is failed");

    }
	
	
	
	

}