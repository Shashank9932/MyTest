package autoapp.automation.utility;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;




public class hooks {
	public WebDriver driver;
	public WebDriverManager webDrive;
	public pageObjectManagers pageManager;

	public hooks() {
		webDrive = new WebDriverManager();
		pageManager= new pageObjectManagers(webDrive.getDriver());
	}

	@Before
	public void setUp() {

		driver = webDrive.getDriver();
	}

	@After
	public void tearDown() {
		webDrive.getDriver().quit();
	}

	private String getParameter(String name) {
		String value = System.getProperty(name);
		if (value == null)
			throw new RuntimeException(name + " is not a parameter!");

		if (value.isEmpty())
			throw new RuntimeException(name + " is empty!");

		return value;
	}
	
	 public WebDriverManager getWebDriverManager() {
		 return webDrive;
		 }
		 
		 public pageObjectManagers getPageObjectManager() {
		 return pageManager;
		 }
}
