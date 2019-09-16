package autoapp.automation.utility;

import org.openqa.selenium.WebDriver;

import autoapp.automation.pages.RegisterPage;
import autoapp.automation.pages.SummerDressPage;

public class pageObjectManagers {

	private RegisterPage registerPage;
	private SummerDressPage summerDressPage;
	private WebDriver driver;

	public pageObjectManagers(WebDriver driver) {
		this.driver = driver;
	}

	public RegisterPage getRegisterPage() {

		return (registerPage == null) ? registerPage = new RegisterPage(driver) : registerPage;

	}
	
	public SummerDressPage getSummerDressPage() {

		return (summerDressPage == null) ? summerDressPage = new SummerDressPage(driver) : summerDressPage;

	}

}
