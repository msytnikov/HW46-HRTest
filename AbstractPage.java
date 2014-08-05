package HRTest;
import org.openqa.selenium.WebDriver;

public class AbstractPage
	{

		protected WebDriver driver;

		public AbstractPage(WebDriver driver)
		{
			// super();
			this.driver = driver;
		}

		public MainPage navigateToWebApp() // it lokks like the deleteEmployee 
		//(the data type) can be any object of the existing class
		
		{
			driver.navigate().to("https://www.naturalhr.com");
			return new MainPage(driver); // either one : HomePage or ContactPage
		}

	}
