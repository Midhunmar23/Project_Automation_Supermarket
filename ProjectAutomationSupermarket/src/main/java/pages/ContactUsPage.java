package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.Waitutility;

public class ContactUsPage 
{
	
	  @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']") WebElement ContactUsButtonClick;
	  @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1' and @class='btn btn-sm btn btn-primary btncss']") WebElement actionbuttonclick;
	  @FindBy(xpath="//input[@class='form-control' and @name='phone']") WebElement companyphonenumer;
	  @FindBy(xpath="//input[@class='form-control' and @id='email']") WebElement companyemail;
	  @FindBy(xpath="//textarea[@id='content'  and @name='address']") WebElement companyaddress;
	  @FindBy(xpath="//textarea[@id='content'  and @name='del_time']") WebElement deliverytime;
	  @FindBy(xpath="//input[@class='form-control' and @id='del_limit']") WebElement DeliveryChargeLimit;
	  @FindBy(xpath="//button[@class='btn btn-block-sm btn-info' and @name='Update']") WebElement UpdateButtonClick;
	  @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement AlertContactUpdatedSuccessfully;
	  
	  
	  public WebDriver driver;
	     FileUploadUtility fileuploadutility= new FileUploadUtility(); 
		   Waitutility waitutility= new Waitutility();
		  
	     
	     
	       public ContactUsPage (WebDriver driver ) 
	       {
	    	   this.driver= driver;
	    	   PageFactory.initElements(driver, this);
	       }
	       
		      
		      public void clickOnContactUsButton()
		      {
		    	  ContactUsButtonClick.click();
		      }
		      
		      public void clickOnActionButton()
		      {
		    	  actionbuttonclick.click();
		      }
		      
		      
		      public void enterCompanyPhoneNumer(String phonenumer)
		      {
		    	  companyphonenumer.clear();
		    	  companyphonenumer.sendKeys(phonenumer);
		      }
		      
		     public void  enterCompanyEmail(String CompanyEmail)
		      {
		    	  companyemail.clear();
		    	  companyemail.sendKeys(CompanyEmail);
		      }
		      
		      public void enterCompanyAddress(String CompanyAddress)
		      {
		    	  companyaddress.clear();
		    	  companyaddress.sendKeys(CompanyAddress);
		      }
		      
		      public void enterDeliveryTime(String Time)
		      {
		    	  deliverytime.clear();
		    	  deliverytime.sendKeys(Time);
		      }
		      
              public void  enterDeliveryChargeLimit(String DeleveryCharge)
              {
            	  DeliveryChargeLimit.clear();
            	  DeliveryChargeLimit.sendKeys(DeleveryCharge);
              }
              
              public void clickOnUpdateButton()
              {
            	  UpdateButtonClick.click();
              }
              
              public boolean AlertContactUpdatedSuccessfully()
              {
          		return AlertContactUpdatedSuccessfully.isDisplayed() ;
            	  
              }
		      
  
	  
}
