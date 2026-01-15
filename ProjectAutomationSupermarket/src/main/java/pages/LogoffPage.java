package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.Waitutility;

public class LogoffPage 
{
	
	 @FindBy(xpath="//input[@name='username']")WebElement username;
	   @FindBy(xpath="//input[@name='password']")WebElement password;
	  @FindBy(xpath="//button[text()='Sign In']")WebElement singinbutton;
	  @FindBy(xpath="//p[text()='Dashboard']") WebElement Dashord;
	  @FindBy( xpath="//a[@class='nav-link' and @data-toggle='dropdown' ]") WebElement Adminbutton;
	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout' and @class='dropdown-item']")WebElement Logoutbuttonclick;
	 @FindBy(xpath="//p[@class='login-box-msg']") WebElement Logingpagesession;
	 
	 
	  public WebDriver driver;
	   FileUploadUtility fileuploadutility= new FileUploadUtility(); 
	   Waitutility waitutility= new Waitutility();
	  
	     public LogoffPage (WebDriver driver) 
	     {
	    	 this.driver=driver;
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
	      public void ButtonClickonSinginButton() 
	      {
	    	 
	    	  singinbutton.click();
	      }
         
	      
	      public void logoutButton()
		     {
	    	  Adminbutton.click();
		     }
		     
		     public void logOffButtonClick()
		     {
		  
		    	 Logoutbuttonclick.click();
		     }
		     
		     public boolean isDisplayTheLogingPage()
		     {
				return Logingpagesession.isDisplayed();
		    	 
		     }
}
