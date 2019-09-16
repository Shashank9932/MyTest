package autoapp.automation.pages;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage<T extends customLoadableComponent<T>> extends customLoadableComponent<T> {

	protected static final int DEFAULT_FLUENTWAIT_TIMEOUT = 20;

	private static WebDriver driver;

	protected BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static int generateRandomIntIntRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	public BasePage<T> isElementIsClickable(By by) {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(by));
			return this;
		} catch (WebDriverException e) {
			throw new Error("Element is not clickable");
		}
	}

	public boolean isElementExistsByXPath(WebElement xpath) {
		WebElement elementName = getElementByXPath(xpath, 60);
		return elementName != null;
	}

	public WebElement getElementByXPath(WebElement xpath, long elementWaitTime) {
		return getElement(xpath);
	}

	public final WebElement getElement(WebElement object) {
		try {
			return fluentWait(object, DEFAULT_FLUENTWAIT_TIMEOUT);
		} catch (TimeoutException timeoutException) {
			return null;
		}
	}

	public WebElement fluentWait(final WebElement object, int timeinsec) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeinsec, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			@SuppressWarnings("unused")
			public WebElement apply(@SuppressWarnings("rawtypes") WebDriver driver) {
				return object;
			}

			public WebElement apply1(WebDriver arg0) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		return element;
	}

}
