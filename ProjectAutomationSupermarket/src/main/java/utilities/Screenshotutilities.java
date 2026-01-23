package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshotutilities {
	
	
	public void getScreenshot(WebDriver driver, String failedTestCase) throws IOException {

		TakesScreenshot scrShot = (TakesScreenshot) driver;  // take screenshot interface 
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);  // methord inside the getscreenshot 

		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());  //create date and time 

		File f1 = new File(System.getProperty("user.dir") + "//outputScreenShot");// create folder to store screenshot 
		if (!f1.exists()) {                                      // checkfolder exist orn

		f1.mkdirs();  //makedirectory checkfolder exist ornot 
		}
		String destination = System.getProperty("user.dir") + "//outputScreenShot//" + failedTestCase + timeStamp
		+ ".png"; //set final screenshot path
		
		File finalDestination = new File(destination);
		FileHandler.copy(screenShot, finalDestination);   //save the screenshot
		}

}




	
     
		


