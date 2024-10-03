package sauce;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentListenerdemo implements ITestListener {
	
	
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }

    
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
    }

    
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }

  
    public void onFinish(ITestContext context) {
        System.out.println("All tests finished: " + context.getName());
    }

   
    public void onStart(ITestContext context) {
        System.out.println("Test suite started: " + context.getName());
    }

}
