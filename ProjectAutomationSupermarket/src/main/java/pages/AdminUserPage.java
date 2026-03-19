package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.Waitutility;

public class AdminUserPage {
	
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger' and @onclick='click_button(1)']")
	WebElement Newadminuserbuttonclick;
	@FindBy(xpath="//input[@class='form-control' and @name='username']")
	WebElement Adminusername;
	@FindBy(xpath="//input[@class='form-control' and @id='password']")
	WebElement Adminpassword;
	@FindBy(id = "user_type")
	WebElement Adminusertype;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger' and @name='Create']")
	WebElement AdminSavebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement UserCreatedSuccessfully;
    @FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
    WebElement userAlreadyExist;
	

	public WebDriver driver;
	FileUploadUtility fileuploadutility = new FileUploadUtility();
	Waitutility waitutility = new Waitutility();

	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/*public void clickAdminUserMoreinfo() {

		Adminusermoreinfo.click();
	}*/

	public AdminUserPage clickNewAdminUserButton() {
		Newadminuserbuttonclick.click();
		return this;
		
	}
	

	public AdminUserPage enterAdminUserName(String Adminuser)
	{
		Adminusername.sendKeys(Adminuser);
		return this;
	}

	public AdminUserPage enterAdminUserPassword(String Adimpassword) {
		 Adminpassword.sendKeys(Adimpassword);
		 return this;
	}

	public AdminUserPage newAdminUserButtonClick() {
		Newadminuserbuttonclick.click();
		PageUtility pageutility = new PageUtility();
		pageutility.selectByValue( Adminusertype, "admin");
		return this;
	}

	public AdminUserPage clickSaveButton() {
		AdminSavebutton.click();
		return this;
	}
	
	public boolean isAlertUserCreatedSuccessfully() {
	    try {
	        return UserCreatedSuccessfully.isDisplayed();
	    } catch (Exception e) {
	        return false;
	    }
	}

	public boolean isAlertUserAlreadyExist() {
	    try {
	        return userAlreadyExist.isDisplayed();
	    } catch (Exception e) {
	        return false;
	    }
	}
	
	

}
