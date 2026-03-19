package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.Waitutility;

public class ContactUsPage 
{
	
	  
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
	       
		      
		     /* public void ContactUsMoreinfoButtonClick()
		      {
		    	  ContactUsMoreinfo.click();
		      }*/
		      
		      public ContactUsPage  clickOnActionButton()
		      {
		    	  actionbuttonclick.click();
				  return this;
		      }
		      
		      
		      public ContactUsPage enterCompanyPhoneNumer(String phonenumer)
		      {
		    	  companyphonenumer.clear();
		    	  companyphonenumer.sendKeys(phonenumer);
				  return this;
		      }
		      
		     public ContactUsPage enterCompanyEmail(String CompanyEmail)
		      {
		    	  companyemail.clear();
		    	  companyemail.sendKeys(CompanyEmail);
				  return this;
		      }
		      
		      public ContactUsPage enterCompanyAddress(String CompanyAddress)
		      {
		    	  companyaddress.clear();
		    	  companyaddress.sendKeys(CompanyAddress);
				  return this;
		      }
		      
		      public ContactUsPage enterDeliveryTime(String Time)
		      {
		    	  deliverytime.clear();
		    	  deliverytime.sendKeys(Time);
				  return this;
		      }
		      
              public ContactUsPage   enterDeliveryChargeLimit(String DeleveryCharge)
              {
            	  DeliveryChargeLimit.clear();
            	  DeliveryChargeLimit.sendKeys(DeleveryCharge);
				  return this;
              }
              
              public ContactUsPage  clickOnUpdateButton()
              {
            	  UpdateButtonClick.click();
				  return this;
              }
              
              public boolean AlertContactUpdatedSuccessfully()
              {
          		return AlertContactUpdatedSuccessfully.isDisplayed() ;
            	  
              }
		      
  
	  
}
