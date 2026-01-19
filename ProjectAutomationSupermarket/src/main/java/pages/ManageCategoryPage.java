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
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']")
	WebElement ManageCatagoryButtonClick;
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


	public void manageCatagoryButtonClick() {
		ManageCatagoryButtonClick.click();
	}
	public void categoryNewcButtonClick() {
		CategoryNewcButtonClick.click();
	}
	

	public void enterTheManageCatagoryCatagoryText(String ManageCatagoryText) {
		ManageCatagoryCatagoryText.sendKeys(ManageCatagoryText);
	}
	
	public void selectTheradiobuttonclickonshowOnTopMenu()
	{
		radiobuttonclickonshowOnTopMenu.click();
	}
	
	public void selectTheradiobuttonclickOnLeftMenu()
	{
		PageUtility pageutility= new PageUtility();
		pageutility.radioButtonSelect(selectTheradiobuttonclickOnLeftMenu);
	}

	public void imageUploadManageCatagory() {

		fileuploadutility.fileuploadUsingSendKeys(imageuploadButton, Constant.CARIMAGE);
	}

	public void saveButtonClick() {
		SavebuttonManageCatagoryclick.click();
	}

}
