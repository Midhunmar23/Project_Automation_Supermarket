package testscrips;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.AddAdminUserPage;
import pages.LogoffPage;
import utilities.ExcelUtility;

public class AddAdminUserTest extends Base
{


	@Test(groups = {"regression" }, description = "verifyTheUserIsAbleAddUserFromTheNewAddFeture")
	public void verifyTheUserIsAbleAddUserFromTheNewAddFeture() throws IOException {
		// String Username="admin";
		// String Password="admin";
		String Username = ExcelUtility.getStringData(1, 0, "Loginpage");
		String Password = ExcelUtility.getStringData(1, 1, "Loginpage");
		AddAdminUserPage addadminuserpage = new AddAdminUserPage (driver);
		addadminuserpage.enterTheUseName(Username);
		addadminuserpage.enterThePassword(Password);
		addadminuserpage.ButtonClickonSinginButton();
		addadminuserpage.AddAdminuserButtonClick();
		addadminuserpage.newAdminUserButtonClick();
		String Adimusername=ExcelUtility.getStringData(1, 0, "Adminuser");
		String Adimpassword=ExcelUtility.getStringData(2, 0, "Adminuser");
		addadminuserpage.enterTheAdminUserName(Adimusername);
		addadminuserpage.enterTheAdminUserPassword(Adimpassword);
		addadminuserpage.newAdminUserButtonClick();
		addadminuserpage.adminSaveButtonClick();
	      
	
		
	}

}
