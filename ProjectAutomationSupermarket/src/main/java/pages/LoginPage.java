package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.Waitutility;

public class LoginPage 
{
	
	  @FindBy(xpath="//input[@name='username']")WebElement username;
	  @FindBy(xpath="//input[@name='password']")WebElement password;
	  @FindBy(xpath="//button[text()='Sign In']")WebElement singinbutton;
	  @FindBy(xpath="//p[text()='Dashboard']") WebElement Dashord;
	 @FindBy(xpath="//div[contains(@class,'alert alert-danger ') ]") WebElement  Loginvalidationmessge;
	
	 
	 
	  
	  public WebDriver driver;
	   FileUploadUtility fileuploadutility= new FileUploadUtility(); // declread as globally
	   Waitutility waitutility= new Waitutility();
	  
	     public LoginPage(WebDriver driver) 
	     {
	    	 this.driver=driver;
	    	 PageFactory.initElements(driver, this);
		
	      }

		 public void enterTheUserName(String username1)
	     {
	    	 username.sendKeys(username1);
	     }
		 
	     
	      public void enterThePassword(String password1) 
	      {
	    	  password.sendKeys(password1);
	      }
	      public void ButtonClickonSinginButton() 
	      {
	    	 
	    	  waitutility.waitForElementToBeClickable(driver, singinbutton);
	    	  singinbutton.click();
	      }
	      
	     /* public void choseFile()
	      {
	    	  
	    	  fileuploadutility.fileuploadUsingSendKeys(Dashord, Constant.CARIMAGE);
	    	  
	      }*/
	      
	       /*public void pageUtilityMethord()
	       {
	    	   PageUtility utils= new PageUtility();
	    	   utils.mouseHover(element);
	       }*/
	      
	     
	      
	      public boolean isDashboardDisplayed() {
	    	    return Dashord.isDisplayed();
	    	}
	      
	      public boolean isLoginPageDisplayed() {
	          return Loginvalidationmessge.isDisplayed();
	      }
	   
	     
	     
	      
	      

}
