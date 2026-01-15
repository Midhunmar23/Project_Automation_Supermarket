package utilities;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	WebDriver driver;
	Actions newactions;

	public void selectByVisibleText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);

	}

	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void actionUtil(WebDriver driver) {
		Actions newactions = new Actions(driver);
	}

	public void mouseHover(WebElement element) {
		newactions.moveToElement(element).perform();
	}

	public void rightClick(WebElement element) {
		newactions.contextClick(element).perform();
	}

	public void doubleClick(WebElement element) {
		newactions.doubleClick(element).perform();

	}

	public void dragAndDrop(WebElement sourse, WebElement target) {
		newactions.dragAndDrop(sourse, target).perform();
	}

	public void radioButtonSelect(WebElement element) {
		if (!element.isSelected()) {
			element.click();
		}
	}

	public boolean isSelected(WebElement element) {
		return element.isSelected();

	}

	public void switchToFrameElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void acceptAlert(WebElement element) {
		driver.switchTo().alert().accept();
	}

	public void alertDismiss(WebElement element) {
		driver.switchTo().alert().dismiss();
	}

	public void PromtAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
		driver.switchTo().alert().accept();
	}

	public String getParentWindow() {
		return driver.getWindowHandle();

	}

	public Set<String> getAllWindows() {
		return driver.getWindowHandles();

	}

	

}
