package testscrips;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import constant.Constant;
import utilities.Waitutility;

public class Base 
{
    
	 public WebDriver driver;
	 FileInputStream fileinputstream;
	 Properties  properties;
	 
	@Parameters("browser")
	@BeforeMethod (alwaysRun = true)
	public void browserIntilization( String browser) throws Exception
	{
		
		try
		{
			properties = new Properties();
			fileinputstream = new FileInputStream(Constant.FILEINPUTSTREAM);
			properties.load(fileinputstream);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver= new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver= new FirefoxDriver();
		}
		else
		{
			throw new Exception("Not Connected");
		}
		
		driver.get(properties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Waitutility.IMPLICITWAIT));
		//driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().window().maximize();
	}
	
	@AfterMethod (alwaysRun = true)
	public void closeBrowser()
	{
		//driver.close();
	}

}
