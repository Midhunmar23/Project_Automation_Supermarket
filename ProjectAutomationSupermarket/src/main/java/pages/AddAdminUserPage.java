package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.Waitutility;

public class AddAdminUserPage {
	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement singinbutton;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement Dashord;
	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-admin']")
	WebElement AddAdminuser;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger' and @onclick='click_button(1)']")
	WebElement Newadminuserbuttonclick;
	@FindBy(id = "username")
	WebElement Adminusername;
	@FindBy(id = "password")
	WebElement Adminpassword;
	@FindBy(id = "user_type")
	WebElement Adminusertype;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger' and @name='Create']")
	WebElement AdminSavebutton;

	public WebDriver driver;
	FileUploadUtility fileuploadutility = new FileUploadUtility();
	Waitutility waitutility = new Waitutility();

	public AddAdminUserPage(WebDriver driver) {
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

		singinbutton.click();
	}

	public void AddAdminuserButtonClick() {

		AddAdminuser.click();
	}

	public void Newadminuserbuttonclick() {
		Newadminuserbuttonclick.click();
	}

	public void enterTheAdminUserName(String Adimusername1) {
		Adminusername.sendKeys(Adimusername1);
	}

	public void enterTheAdminUserPassword(String Adimpassword1) {
		Adminusername.sendKeys(Adimpassword1);
	}

	public void newAdminUserButtonClick() {
		Newadminuserbuttonclick.click();
		PageUtility pageutility = new PageUtility();
		pageutility.selectByValue(AddAdminuser, "admin");
	}

	public void adminSaveButtonClick() {
		AdminSavebutton.click();
	}

}
