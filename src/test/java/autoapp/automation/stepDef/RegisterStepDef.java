package autoapp.automation.stepDef;

import autoapp.automation.pages.RegisterPage;
import autoapp.automation.utility.hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDef {
	
	hooks Hook;
	RegisterPage registerPage;
	
	public RegisterStepDef(hooks Hooks) {
		Hook=Hooks;
		registerPage= Hook.getPageObjectManager().getRegisterPage();
	}

	@Given("^Automation practice application is opened$")
	public void automation_practice_application_is_opened() throws Throwable {
		registerPage.openApplicaiton();
	}

	@When("^I click sign in$")
	public void i_click_sign_in() throws Throwable {
		registerPage.clickSignIn();

	}

	@And("^I create account with emailid \"([^\"]*)\"$")
	public void i_create_account_with_emailid(String emailId) throws Throwable {
		registerPage.createAccount(emailId);
		Thread.sleep(5000);
	}

	@Then("^I will see an error \"([^\"]*)\"$")
	public boolean iWillSeeAnError(String errorMessage) throws Throwable {
		if (registerPage.testMessage(errorMessage) != "Invalid email address.") {

		}
		return false;

	}
	
	
	@And ("^I hover on Dresses$")
	public void i_hover_on_Dresses() {
		registerPage.hoverOnDresses();
		
		
	}
	
	@And ("^I will see Summer Dresses$")
	public boolean i_will_see_summer_Dresses() {
		return registerPage.getSummer_dresses().isDisplayed();
		
	}
}
