package testscrips;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import constant.Constant;
import pages.AdminUserPage;
import pages.LoginPage;
import pages.HomePage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base {
	
	HomePage homepage;
	AdminUserPage adminuserpage;

	@Test(groups = {
			"regression" }, description = "verifyTheUserIsAbleAddUserFromTheNewAddFeture", retryAnalyzer = retry.Retry.class)
	public void verifyTheUserIsAbleAddUserFromTheNewAddFeture() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LogingData");
		String password = ExcelUtility.getStringData(1, 1, "LogingData");

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUserName(username).enterThePassword(password);
		homepage=loginPage.ButtonClickonSinginButton();

		//AdminUserPage adminuserpage = new AdminUserPage(driver);
		//adminuserpage.clickAdminUserMoreinfo();
		adminuserpage=homepage.clickAdminUserMoreinfo();
		adminuserpage.clickNewAdminUserButton();

		//String adminUsername = ExcelUtility.getStringData(0, 0, "Adminuser");
		//String adminPassword = ExcelUtility.getStringData(1, 0, "Adminuser");
		Faker faker = new Faker();
		String Username = faker.name().username();
		String Password = faker.internet().password();
		adminuserpage.enterAdminUserName(Username).enterAdminUserPassword(Password).newAdminUserButtonClick().clickSaveButton();
		
		boolean isUserCreated = adminuserpage.isAlertUserCreatedSuccessfully();

		if (isUserCreated) {
		    Assert.assertTrue(true, Constant.USERCREATEDSUCCESSFULLY);
		} else {
		    boolean isUserAlreadyExist = adminuserpage.isAlertUserAlreadyExist();
		    Assert.assertTrue(isUserAlreadyExist, Constant.USERALREADYEXISTS);
		}

		
		

	}

	
}
