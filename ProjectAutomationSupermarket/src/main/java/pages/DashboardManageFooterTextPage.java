package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.Waitutility;

public class DashboardManageFooterTextPage {

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement singinbutton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")
	WebElement ManageFooterText;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1' and @class='btn btn-sm btn btn-primary btncss']")
	WebElement actionFooterText;
	@FindBy(xpath = "//textarea[@id='content']")
	WebElement ManagefooterAddress;
	@FindBy(id = "email")
	WebElement ContatpageEmail;
	@FindBy(id = "phone")
	WebElement ManageFooterpagePhonenumber;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-info' ]")
	WebElement UpdatebuttonManagecotactpage;

	public WebDriver driver;
	FileUploadUtility fileuploadutility = new FileUploadUtility();
	Waitutility waitutility = new Waitutility();

	public DashboardManageFooterTextPage(WebDriver driver) {
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

	public void manageFooterText() {
		ManageFooterText.click();
	}

	public void actionFooterText() {
		actionFooterText.click();
	}

	public void enterTheAddressFooterManage(String Address) {
		ManagefooterAddress.clear();
		ManagefooterAddress.sendKeys(Address);
	}

	public void enterTheEmailFooterManage(String Email) {
		ManagefooterAddress.clear();
		ManagefooterAddress.sendKeys(Email);
	}

	public void enterThePhoneFooterManage(String Phone) {
		ManagefooterAddress.clear();
		ManagefooterAddress.sendKeys(Phone);
	}

	public void updatebuttonManagecotactpage() {
		UpdatebuttonManagecotactpage.click();

	}

}
