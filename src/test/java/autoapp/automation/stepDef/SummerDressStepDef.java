package autoapp.automation.stepDef;

import autoapp.automation.pages.RegisterPage;
import autoapp.automation.pages.SummerDressPage;
import autoapp.automation.utility.hooks;
import cucumber.api.java.en.And;

public class SummerDressStepDef {

	hooks Hook;
	RegisterPage registerPage;
	SummerDressPage summerDressPage;

	public SummerDressStepDef(hooks Hooks) {
		Hook = Hooks;
		registerPage = Hook.getPageObjectManager().getRegisterPage();
		summerDressPage = Hook.getPageObjectManager().getSummerDressPage();
	}

	@And("^I will click on Summer Dresses$")
	public void i_will_click_on_summer_Dress() {
		registerPage.getSummer_dresses().click();

	}

	@And("^I will see sortby option$")
	public boolean i_will_see_sortby_option() {
		return summerDressPage.getSort_by_dropdown().isDisplayed();
	}

	@And("^I select sortby price$")
	public void i_select_sortby_option() {
		summerDressPage.selectSortbyValue("price:asc");
	}

	@And("^I see dresses sorted$")
	public void i_see_dresses_sorted() {
		summerDressPage.dressesSorted();
	}

	@And("^I will select first summer Dress in list$")
	public void i_will_select_first_summer_dress_in_list() {
		summerDressPage.clickOnTheFirstDress();

	}

	@And("^I will see printed Summer Dress loaded$")
	public void i_will_see_printed_summer_dress_loaded() {
		summerDressPage.printedSummerDressPageLoaded();
	}

	@And("^I select colour blue$")
	public void i_select_colour_blue() {
		if (summerDressPage.printedSummerDressPageLoaded() == true) {
			summerDressPage.selectColourBlue();
		}
	}

	@And("^I click on add to cart$")
	public void i_click_on_add_to_cart() {
		summerDressPage.clickAddToCart();
	}

	@And("^I compare the product details$")
	public void i_compare_the_product_details() {
		summerDressPage.ComapreDetails();
	}
}
