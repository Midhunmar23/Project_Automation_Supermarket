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
	
	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-admin']")
	WebElement Adminuser;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger' and @onclick='click_button(1)']")
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
	

	public WebDriver driver;
	FileUploadUtility fileuploadutility = new FileUploadUtility();
	Waitutility waitutility = new Waitutility();

	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickAddAdminUserButton() {

		Adminuser.click();
	}

	public void clickNewAdminUserButton() {
		Newadminuserbuttonclick.click();
	}

	public void enterAdminUserName(String Adminuser)
	{
		Adminusername.sendKeys(Adminuser);
	}

	public void enterAdminUserPassword(String Adimpassword) {
		 Adminpassword.sendKeys(Adimpassword);
	}

	public void newAdminUserButtonClick() {
		Newadminuserbuttonclick.click();
		PageUtility pageutility = new PageUtility();
		pageutility.selectByValue( Adminusertype, "admin");
	}

	public void clickSaveButton() {
		AdminSavebutton.click();
	}
	
	public boolean isAlertUserCreatedSuccessfully()
    {
		return UserCreatedSuccessfully.isDisplayed() ;
  	  
    }
	
	

}
