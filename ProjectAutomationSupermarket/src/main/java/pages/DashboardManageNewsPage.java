package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.Waitutility;

public class DashboardManageNewsPage 
{
	
	   @FindBy(xpath="//input[@name='username']")WebElement username;
	   @FindBy(xpath="//input[@name='password']")WebElement password;
	  @FindBy(xpath="//button[text()='Sign In']")WebElement singinbutton;
	  @FindBy(xpath="//p[text()='Dashboard']") WebElement Dashord;
	 @FindBy(xpath="//div[contains(@class,'alert alert-danger ') ]") WebElement LogingValidationMessageforIncorrectUsername;
	   @FindBy(xpath="//p[text()='Manage News']") WebElement NewsManageButtonClick;
	   @FindBy(xpath="//a[@class='btn btn-rounded btn-danger' and @onclick='click_button(1)']") WebElement  NewsButtonClick;
	   @FindBy(id="news") WebElement NewsTextArea;
	   @FindBy(xpath="//button[@name='create']") WebElement SaveButtonClick;
	   @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alrtmessgae;
	   
	     public WebDriver driver;
	     FileUploadUtility fileuploadutility= new FileUploadUtility(); 
		   Waitutility waitutility= new Waitutility();
		  
	     
	     
	       public DashboardManageNewsPage(WebDriver driver ) 
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
	       
	        
	        public void NewsManageButtonClick()
	        {
	        	NewsManageButtonClick.click();
	        }
	        
	        public void  NewsButtonClick()
	        {
	        	 NewsButtonClick.click();
	        }
	        
	        public void EnterTheTextInField(String NewsTextArea1)
	        {
	        	NewsTextArea.sendKeys(NewsTextArea1);
	        }
	        
	        public void SaveButtonClick()
	        {
	        	SaveButtonClick.click();
	        }
	        
	        
	        public boolean isAlertDisplayed()
	        {
				return alrtmessgae.isDisplayed();
				
	        	
	        }
	        
	        public void utilAlertMethord(WebElement  element)
	        {
	        	PageUtility pageutility= new PageUtility();
	        	pageutility.alertDismiss(alrtmessgae);
	        }
	   

}
