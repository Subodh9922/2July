package Test;
import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.Screenshot;

public class TestListeners extends BaseTest implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+ "test has started");
	}
	
	public void onTestFailure(ITestResult result) {
		try {
			Screenshot.takesScreenShot(driver, result.getName());
		}
		catch(IOException at) {
			at.printStackTrace();
		}
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+ "test is successful");
	}
	
	public void onTestSkip(ITestResult result) {
		System.out.println(result.getName()+ "test skip");
	}
	
}
