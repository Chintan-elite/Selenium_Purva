package listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import util.DriverConnection;

public class NewTest {
	
		@Test
		public void test(ITestContext i)
		{
			WebDriver driver = DriverConnection.connect("https://topsint.com/topserp/index.php");
			i.setAttribute("driver", driver);
			assertEquals(driver.getTitle(),"erp");
		}
}
