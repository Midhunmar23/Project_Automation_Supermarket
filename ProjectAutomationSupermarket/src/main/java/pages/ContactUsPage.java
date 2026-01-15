package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.Waitutility;

public class ContactUsPage 
{
	
	   @FindBy(xpath="//input[@name='username']")WebElement username;
	   @FindBy(xpath="//input[@name='password']")WebElement password;
	  @FindBy(xpath="//button[text()='Sign In']")WebElement singinbutton;
	  @FindBy(xpath="//p[text()='Dashboard']") WebElement Dashord;
	  @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class=' nav-link']") WebElement ContactUsButtonClick;
	  @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1']") WebElement actionbuttonclick;
	  @FindBy(id="phone") WebElement companyphonenumer;
	  @FindBy(id="email") WebElement companyemail;
	  @FindBy(xpath="//textarea[@id='content'  and @name='address']") WebElement companyaddress;
	  @FindBy(xpath="//textarea[@id='content'  and @name='del_time']") WebElement deliverytime;
	  @FindBy(xpath="//input[@class='form-control' and @id='del_limit']") WebElement DeliveryChargeLimit;
	  @FindBy(xpath="//button[@class='btn btn-block-sm btn-info' and @name='Update']") WebElement UpdateButtonClick;
	  
	  
	  public WebDriver driver;
	     FileUploadUtility fileuploadutility= new FileUploadUtility(); 
		   Waitutility waitutility= new Waitutility();
		  
	     
	     
	       public ContactUsPage (WebDriver driver ) 
	       {
	    	   this.driver= driver;
	    	   PageFactory.initElements(driver, this);
	       }
	       
	       

		   public void enterTheUseName(String username1)
		     {
		    	 username.sendKeys(username1);
		     }
		     
		      public void enterThePassword(String password1) 
		      {
		    	  password.sendKeys(password1);
		      }
		      
		      public boolean isDashboardDisplayed()
		      {
		    	  return Dashord.isDisplayed();
		      }
		      
		      
		      public void ButtonClickonSinginButton() 
		      {
		    	 
		    	  waitutility.waitForElementToBeClickable(driver, singinbutton);
		    	  singinbutton.click();
		      }
		      
		      public void contactUsButtonClick()
		      {
		    	  ContactUsButtonClick.click();
		      }
		      
		      public void actionButtonClick()
		      {
		    	  actionbuttonclick.click();
		      }
		      
		      public void enterTheCompanyPhoneNumer(String phoneNumer)
		      {
		    	  companyphonenumer.clear();
		    	  companyphonenumer.sendKeys(phoneNumer);
		      }
		      
		      public void  enterTheCompanyEmail(String CompanyEmail)
		      {
		    	  companyemail.clear();
		    	  companyemail.sendKeys(CompanyEmail);
		      }
		      
		      public void enterTheCompanyAddress(String CompanyAddress)
		      {
		    	  companyaddress.clear();
		    	  companyaddress.sendKeys(CompanyAddress);
		      }
		      
		      public void enterTheDeliveryTime(String Time)
		      {
		    	  deliverytime.clear();
		    	  deliverytime.sendKeys(Time);
		      }
		      
              public void  enterTheDeliveryChargeLimit(String DeleveryCharge)
              {
            	  DeliveryChargeLimit.clear();
            	  DeliveryChargeLimit.sendKeys(DeleveryCharge);
              }
              
              public void updateButtonClick()
              {
            	  UpdateButtonClick.click();
              }
		      
		     
		      
		      
	       
	  
	  
	  
	  
}
