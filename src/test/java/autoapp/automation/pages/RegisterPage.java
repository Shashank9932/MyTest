package autoapp.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {

	/*
	 * public static String signIn_xpath =
	 * "//a[@title='Log in to your customer account']"; public static String
	 * email_id = "email_create"; public static String createAccount_xpath =
	 * "//form[@id='create-account_form']//span[1]";
	 */
	public RegisterPage(WebDriver driver) {
		super(getDriver());
		PageFactory.initElements(getDriver(), this);
		
	}
//Move to HomePage class
	@FindBy(xpath = "//a[@title='Log in to your customer account")
	private static WebElement signIn;

	@FindBy(id = "email_create")
	private static WebElement email_id;

	@FindBy(xpath = "//form[@id='create-account_form']//span[1]")
	private static WebElement createAccount;
	
	@FindBy(xpath = "//*[@id=\'center_column\']/div[1]/ol/li")
	private static WebElement errorMessage;
	

	
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private static WebElement dresses;
	
	//*[@id="block_top_menu"]/ul/li[2]/ul/li[2]/a
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")
	private static WebElement summer_dresses;

	//move URL to config property file
	public static void openApplicaiton() {
		getDriver().navigate().to("http://automationpractice.com/index.php");
		getDriver().manage().window().maximize();
	}
	
	
	public static WebElement getSummer_dresses() {
		return summer_dresses;
	}
	
//move to HomePage class
	public static void clickSignIn() {
		signIn.click();

	}

	public static void createAccount(String emailid) {
		emailid = emailid.replaceAll("Random", Integer.toString(generateRandomIntIntRange(00000, 99999)));
		email_id.sendKeys(emailid);
		createAccount.click();
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub

	}

	// check for loaded screen
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		isElementExistsByXPath(signIn);
	}
	
	public boolean errorEmailDisplayed() {
		return isElementExistsByXPath(errorMessage);
	}

	public static  String testMessage(String t) {
		 t=errorMessage.getText();
		return t;
	}
	
	public static void hoverOnDresses() {
		Actions action = new Actions(getDriver());
		action.moveToElement(dresses).perform();
		
	}
	
public void dressLinkWorks() {
	hoverOnDresses();
	int count=getDriver().findElements(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")).size();
	if(count>0) {
		summer_dresses.click();
		
	}
	
		

}
	
}
