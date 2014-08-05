package HRTest;


import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;*/

public class MainPage   extends AbstractPage {

	public MainPage(WebDriver driver) {
		super(driver);
	}

	

	public EmployeePage loginS() {

		 assertTrue("Failure", (driver.findElement(By.tagName("body")).getText().contains("Quickstart")));

		return new EmployeePage(driver);
		
	
	
	}
}
