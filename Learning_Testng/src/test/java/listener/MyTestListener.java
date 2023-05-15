package listener;




import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test passed...");
		
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test fauiled...");
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test started...");
	}
	
	
	

}
