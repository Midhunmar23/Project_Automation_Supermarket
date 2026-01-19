package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitutility {
	public static final int IMPLICITWAIT = 5;
	public static final int FLUENTWAIT = 20;
	public static final int POLLWAIT = 5;
	public static final int EXPLICITWAIT = 3;

	public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void WaitForElement(WebDriver driver, WebElement target) {

		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(FLUENTWAIT))
				.pollingEvery(Duration.ofSeconds(POLLWAIT)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(target));
	}

	public void WaitForElementVisible(WebDriver driver, WebElement target) {

		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(FLUENTWAIT))
				.pollingEvery(Duration.ofSeconds(POLLWAIT)).ignoring(NoSuchElementException.class);

		fluentWait.until(ExpectedConditions.visibilityOf(target));
	}

	public void WaitForElementPresent(WebDriver driver, By locator) {

		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(FLUENTWAIT))
				.pollingEvery(Duration.ofSeconds(POLLWAIT)).ignoring(NoSuchElementException.class);

		fluentWait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void WaitForElementInvisible(WebDriver driver, WebElement target) {

		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(FLUENTWAIT))
				.pollingEvery(Duration.ofSeconds(POLLWAIT)).ignoring(NoSuchElementException.class);

		fluentWait.until(ExpectedConditions.invisibilityOf(target));
	}

	public void WaitForTextToBePresent(WebDriver driver, WebElement target, String text) {

		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(FLUENTWAIT))
				.pollingEvery(Duration.ofSeconds(POLLWAIT)).ignoring(NoSuchElementException.class);

		fluentWait.until(ExpectedConditions.textToBePresentInElement(target, text));
	}

}
