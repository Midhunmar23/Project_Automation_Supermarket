package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtility;
import utilities.Waitutility;

public class ManageCategoryPage {

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement singinbutton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']")
	WebElement ManageCatagoryButtonClick;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger' and @href='https://groceryapp.uniqassosiates.com/admin/Category/add']")
	WebElement CategoryNewcButtonClick;
	@FindBy(id = "category")
	WebElement ManageCatagoryCatagoryText;
	@FindBy(id = "main_img")
	WebElement imageuploadButton;
	@FindBy(xpath = "//button[@Class='btn btn-danger']")
	WebElement SavebuttonManageCatagoryclick;

	public WebDriver driver;
	FileUploadUtility fileuploadutility = new FileUploadUtility();
	Waitutility waitutility = new Waitutility();

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterTheUseName(String username1) {
		username.sendKeys(username1);
	}

	public void enterThePassword(String password1) {
		password.sendKeys(password1);
	}

	public void ButtonClickonSinginButton() {

		waitutility.waitForElementToBeClickable(driver, singinbutton);
		singinbutton.click();
	}

	public void ManageCatagoryButtonClick() {
		ManageCatagoryButtonClick.click();
	}

	public void enterTheManageCatagoryCatagoryText(String ManageCatagoryText) {
		ManageCatagoryCatagoryText.sendKeys(ManageCatagoryText);
	}

	public void imageUploadManageCatagory() {

		fileuploadutility.fileuploadUsingSendKeys(imageuploadButton, Constant.CARIMAGE);
	}

	public void saveButtonClick() {
		SavebuttonManageCatagoryclick.click();
	}

}
