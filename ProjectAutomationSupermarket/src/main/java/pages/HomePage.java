package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.Waitutility;

public class HomePage {

	@FindBy(xpath = "//a[@class='nav-link' and @data-toggle='dropdown' ]")
	WebElement Adminiconsinginpagebutton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout' and @class='dropdown-item']")
	WebElement Logoutbuttonclick;
	
	@FindBy(xpath="//button[text()='Sign In']") WebElement Login;

	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-admin']")
	 WebElement Adminusermoreinfo;
	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']") WebElement ContactUsMoreinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")
	WebElement manageFootermoreinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']")
	WebElement manageCatagoryMoreinfo;

	public WebDriver driver;
	FileUploadUtility fileuploadutility = new FileUploadUtility();
	Waitutility waitutility = new Waitutility();

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public HomePage logoutButton() {
		Adminiconsinginpagebutton.click();
		return this;
	}

	public HomePage logOffButtonClick() {

		Logoutbuttonclick.click();
		return this;
	}

	public boolean isLoginPageDisplayed() {
		return Login.isDisplayed();
	}

	public AdminUserPage clickAdminUserMoreinfo() {

		Adminusermoreinfo.click();
		return new AdminUserPage(driver);
	}

	public ContactUsPage contactUsMoreinfoButtonClick() {
		ContactUsMoreinfo.click();
		return new ContactUsPage(driver);
	}

	public  DashboardManageFooterTextPage  manageFootermoreinfo()
	{
		manageFootermoreinfo.click();
		return new  DashboardManageFooterTextPage (driver);
	}
	
	public ManageCategoryPage manageCatagoryMoreinfo()
	{
		manageCatagoryMoreinfo.click();
		return new ManageCategoryPage(driver);
	}
}
