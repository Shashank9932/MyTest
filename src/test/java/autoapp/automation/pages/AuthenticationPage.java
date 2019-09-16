package autoapp.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends BasePage {

	protected AuthenticationPage(WebDriver driver) {
		super(getDriver());
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id=\'center_column\']/h1")
	private static WebElement authentication_text;

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void isLoaded() throws Error {
		isElementExistsByXPath(authentication_text);
		
	}

}
