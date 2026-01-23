package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.Waitutility;

public class ManageCategoryPage {
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger' and @href='https://groceryapp.uniqassosiates.com/admin/Category/add']")
	WebElement CategoryNewcButtonClick;
	@FindBy(id="category")
	WebElement ManageCatagoryCatagoryText;
	@FindBy(xpath="//input[@name='top_menu' and @Value='no']")
	WebElement radiobuttonclickonshowOnTopMenu;
	@FindBy(xpath="//input[@name='top_menu' and @Value='yes']") 
	WebElement selectTheradiobuttonclickOnLeftMenu;
	@FindBy(id="main_img")
	WebElement imageuploadButton;
	@FindBy(xpath="//button[@Class='btn btn-danger']")
	WebElement SavebuttonManageCatagoryclick;

	public WebDriver driver;
	FileUploadUtility fileuploadutility = new FileUploadUtility();
	Waitutility waitutility = new Waitutility();

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/*public void manageCatagoryMoreinfo() {
		ManageCatagoryMoreinfo.click();
	}*/
	public ManageCategoryPage categoryNewcButtonClick() {
		CategoryNewcButtonClick.click();
		return this;
	}
	

	public ManageCategoryPage enterTheManageCatagoryCatagoryText(String ManageCatagoryText) {
		ManageCatagoryCatagoryText.sendKeys(ManageCatagoryText);
		return this;
	}
	
	public ManageCategoryPage selectTheradiobuttonclickonshowOnTopMenu()
	{
		radiobuttonclickonshowOnTopMenu.click();
		return this;
	}
	
	public ManageCategoryPage selectTheradiobuttonclickOnLeftMenu()
	{
		PageUtility pageutility= new PageUtility();
		pageutility.radioButtonSelect(selectTheradiobuttonclickOnLeftMenu);
		return this;
	}

	public ManageCategoryPage imageUploadManageCatagory() {

		fileuploadutility.fileuploadUsingSendKeys(imageuploadButton, Constant.CARIMAGE);
		return this;
	}

	public ManageCategoryPage saveButtonClick() {
		SavebuttonManageCatagoryclick.click();
		return this;
	}

}
