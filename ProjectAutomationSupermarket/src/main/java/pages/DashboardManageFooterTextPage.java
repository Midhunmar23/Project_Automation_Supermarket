package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.Waitutility;

public class DashboardManageFooterTextPage {

	
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1' and @class='btn btn-sm btn btn-primary btncss']")
	WebElement actionFooterText;
	@FindBy(css="textarea#content")
	WebElement ManagefooterAddress;
	@FindBy(css="input.form-control[name='email']")
	WebElement ContatpageEmail;
	@FindBy(xpath="//input[@class='form-control' and @name='phone']")
	WebElement ManageFooterpagePhonenumber;
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-info']") WebElement UpdatebuttonManagecotactpage;
	 @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement FooterTextUpdatedSuccessfully;

	public WebDriver driver;
	FileUploadUtility fileuploadutility = new FileUploadUtility();
	Waitutility waitutility = new Waitutility();

	public DashboardManageFooterTextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*public void manageFootermoreinfo() {
		ManageFootermoreinfo.click();
	}*/

	public  DashboardManageFooterTextPage actionFooterText() {
		actionFooterText.click();
		return this;
	}

	public  DashboardManageFooterTextPage enterTheAddressFooterManage(String Address) {
		
		ManagefooterAddress.clear();
		ManagefooterAddress.sendKeys(Address);
		return this;
	}

	public  DashboardManageFooterTextPage enterTheEmailFooterManage(String Email) {
		ContatpageEmail.clear();
		ContatpageEmail.sendKeys(Email);
		return this;
	}

	public  DashboardManageFooterTextPage enterThePhoneFooterManage(String Phone) {
		ManageFooterpagePhonenumber.clear();
		ManageFooterpagePhonenumber.sendKeys(Phone);
		return this;
	}

	public  DashboardManageFooterTextPage updateButtonManageContactPage() {
		UpdatebuttonManagecotactpage.click();
		return this;

	}
	 public boolean AlertFooterTextUpdatedSuccessfully()
     {
 		return FooterTextUpdatedSuccessfully.isDisplayed() ;
   	  
     }
	 public boolean AlertFooterTextUpdatedNoCreated()
     {
 		return FooterTextUpdatedSuccessfully.isDisplayed() ;
   	  
     }

}
