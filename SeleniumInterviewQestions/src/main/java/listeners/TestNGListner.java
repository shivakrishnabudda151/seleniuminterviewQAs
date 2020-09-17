package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener{

	public void onTestStart(ITestResult result) {
	System.out.println("*****Test Starts Here****** " +result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("*****Test Successfull****** " +result.getName());
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("*****Test Failure****** " +result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*****Test Skipped ****** " +result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
