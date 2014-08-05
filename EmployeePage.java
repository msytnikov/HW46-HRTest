package HRTest;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeePage extends AbstractPage {

	public EmployeePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	public EmployeeQuickAddPage deleteEmp()

	{
		driver.get("https://www.naturalhr.com" + "/hr/employee/");

		List<WebElement> count = driver.findElements(By
				.xpath("//img[@alt='Delete']"));

		int empCount = count.size();

		for (int i = 0; i < empCount; i++) {
			driver.findElement(By.xpath("//img[@alt='Delete']")).click();
			driver.switchTo().alert().accept();
		}
		assertTrue("Failure",
				(driver.findElement(By.tagName("body")).getText()
						.contains("No employees found")));
		return new EmployeeQuickAddPage(driver);
	}
}
