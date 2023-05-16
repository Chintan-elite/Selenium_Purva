package listener;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class NewTestListener implements ITestListener{
		
	public void onTestFailure(ITestResult result) {
		
		
		WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");
		String path = "D://test//"+result.getName()+".png";
		
		
		TakesScreenshot shot = (TakesScreenshot) driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		
		
		try {
			Files.copy(source, dest);
			System.out.println("Screenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
		
}
