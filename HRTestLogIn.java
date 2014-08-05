package HRTest;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRTestLogIn {

	static WebDriver driver = new FirefoxDriver();
	static String baseUrl = "https://www.naturalhr.com";
	String email = "clubnik@hotmail.com";
	String password = "zaq!@wsx";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		driver.quit();
	}
	



	

	@Before
	public void setUp() throws Exception {
	/*LoginPage lP = new LoginPage(driver);*/	
	/*	lP.logIn();*/
		driver.get(baseUrl + "/login");
		driver.findElement(By.name("ipt-login")).clear();
		driver.findElement(By.name("ipt-login")).sendKeys(email);
		driver.findElement(By.name("ipt-password")).clear();
		driver.findElement(By.name("ipt-password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
	 
		
	}

	@After
	public void tearDown() throws Exception {
		
		// <b class="caret"></b>
		driver.findElement(By.cssSelector("b.caret")).click();
		driver.findElement(By.linkText("Logoff")).click();
	}




}
