package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.Waitutility;

public class DashboardManageFooterTextPage {

	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")
	WebElement ManageFooterText;
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
		ContatpageEmail.clear();
		ContatpageEmail.sendKeys(Email);
	}

	public void enterThePhoneFooterManage(String Phone) {
		ManageFooterpagePhonenumber.clear();
		ManageFooterpagePhonenumber.sendKeys(Phone);
	}

	public void updateButtonManageContactPage() {
		UpdatebuttonManagecotactpage.click();

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
