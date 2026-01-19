package testscrips;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUserPage;
import pages.LoginPage;
import pages.LogoffPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base {

	@Test(groups = {
			"regression" }, description = "verifyTheUserIsAbleAddUserFromTheNewAddFeture", retryAnalyzer = retry.Retry.class)
	public void verifyTheUserIsAbleAddUserFromTheNewAddFeture() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LogingData");
		String password = ExcelUtility.getStringData(1, 1, "LogingData");

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUserName(username);
		loginPage.enterThePassword(password);
		loginPage.ButtonClickonSinginButton();

		AdminUserPage adminuserpage = new AdminUserPage(driver);
		adminuserpage.clickAddAdminUserButton();
		adminuserpage.clickNewAdminUserButton();

		String adminUsername = ExcelUtility.getStringData(0, 0, "Adminuser");
		adminuserpage.enterAdminUserName(adminUsername);
		String adminPassword = ExcelUtility.getStringData(1, 0, "Adminuser");
		adminuserpage.enterAdminUserPassword(adminPassword);

		adminuserpage.newAdminUserButtonClick();

		adminuserpage.clickSaveButton();

		boolean isAlertUserCreatedSuccessfully = adminuserpage.isAlertUserCreatedSuccessfully();
		Assert.assertTrue(isAlertUserCreatedSuccessfully, Constant.ISALERTUSERCREATEDSUCCESSFULLY);
		
		

	}

}
