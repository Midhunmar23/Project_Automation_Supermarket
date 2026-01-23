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
	       
	       

	        
	        public DashboardManageNewsPage NewsManageButtonClick()
	        {
	        	NewsManageButtonClick.click();
	        	return this;
	        }
	        
	        public DashboardManageNewsPage NewsButtonClick()
	        {
	        	 NewsButtonClick.click();
	        	 return this;
	        }
	        
	        public DashboardManageNewsPage EnterTheTextInField(String NewsTextArea1)
	        {
	        	NewsTextArea.sendKeys(NewsTextArea1);
	        	return this;
	        }
	        
	        public DashboardManageNewsPage SaveButtonClick()
	        {
	        	SaveButtonClick.click();
	        	return this;
	        }
	        
	        
	        public boolean isAlerNewNewsCreatedtDisplayed()
	        {
				return alrtmessgae.isDisplayed();
				
	        	
	        }
	        
	       
	       
	   

}
