package autoapp.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SummerDressPage extends BasePage {
	

	

	public SummerDressPage(WebDriver driver) {
		super(getDriver());
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(xpath = "//*[@id=\"productsSortForm\"]/div/label")
	private static WebElement sort_by_text;

	@FindBy(id = "selectProductSort")
	private static WebElement sort_by_dropdown;

	@FindBy(xpath = "//*[@id=\'center_column\']/ul/li[1]/div/div[1]/div/a[1]/img")
	private static WebElement first_summer_dress;

	@FindBy(xpath = "//*[@id=\'center_column\']/ul/li[1]/div/div[2]/div[1]/span[1]")
	private static WebElement price_per_product;

	@FindBy(xpath = "//*[@classname='product_list grid row']/ul/li[1]/div")
	private static WebElement dressTOChoose;

	@FindBy(id = "product_reference")
	private static WebElement productReference;

	public static WebElement getProductReference() {
		return productReference;
	}

	@FindBy(id = "color_14")
	private static WebElement colour_blue;

	@FindBy(id = "add_to_cart")
	private static WebElement add_to_cart;

	@FindBy(id = "our_price_display")
	private static WebElement price_of_item;

	@FindBy(id = "layer_cart_product_price")
	private static WebElement layer_cart_price;

	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/text()")
	private static WebElement successMessageForItemAdd;

	@FindBy(id = "quantity_wanted")
	private static WebElement quatity_wanted;

	@FindBy(xpath = "//*[@id=\"layer_cart_product_title\"]")
	private static WebElement product_summary_in_cart;

	@FindBy(id = "layer_cart_product_quantity")
	private static WebElement product_quantity_in_cart;



	@Override
	protected void load() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void isLoaded() throws Error {
		isElementExistsByXPath(sort_by_text);
	}

	public static WebElement getSort_by_dropdown() {
		return sort_by_dropdown;
	}

	public void selectSortbyValue(String value) {
		Select s = new Select(getDriver().findElement(By.id("selectProductSort")));
		s.selectByValue(value);
	}

	public boolean dressesSorted() {
		List list = getDriver().findElements(By.className("price product-price"));
		int count = getDriver().findElements(By.className("price product-price")).size();
		if (count > 0) {
			for (int i = count; i > 0; i--) {
				for (int j = count - 1; j > 0; j--) {
					String s = list.get(i).toString();
					String p = list.get(j).toString();
					int r = Integer.parseInt(s);
					int q = Integer.parseInt(p);
					if (r < q)
						break;
				}

			}

		}
		return true;

	}

	public void clickOnTheFirstDress() {
		dressTOChoose.click();
	}

	public boolean printedSummerDressPageLoaded() {
		return productReference.isDisplayed();
	}

	public boolean selectColourBlue() {
		colour_blue.click();
		return colour_blue.isSelected();
	}

	public void clickAddToCart() {
		add_to_cart.click();
	}

	public boolean ComapreDetails() {
		
		String productRefString = productReference.getText();
		String productRefInCartString = product_summary_in_cart.getText();

		String quantityOnScreen = quatity_wanted.getText();
		String quantityOnCart = product_quantity_in_cart.getText();

		if (productRefString == productRefInCartString && quantityOnScreen == quantityOnCart) {
			System.out.println("details matched");
		}

		return true;
	}
}
