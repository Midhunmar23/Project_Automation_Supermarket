package testscrips;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashboardManageNewsPage;
import pages.LogoffPage;
import utilities.ExcelUtility;

public class LogoffTest extends Base {

	@Test(groups = { "regression" }, description = "verifyTheUserIsAbleToLogoffFromTheCreatedAccount")
	public void verifyTheUserIsAbleToLogoffFromTheCreatedAccount() throws IOException {
		// String Username="admin";
		// String Password="admin";
		String Username = ExcelUtility.getStringData(1, 0, "Loginpage");
		String Password = ExcelUtility.getStringData(1, 1, "Loginpage");
		LogoffPage logofftest = new LogoffPage(driver);
		logofftest.enterTheUseName(Username);
		logofftest.enterThePassword(Password);
		logofftest.ButtonClickonSinginButton();
		logofftest.logoutButton();
		logofftest.logOffButtonClick();
		boolean Singinpage = logofftest.isDisplayTheLogingPage();
		Assert.assertTrue(Singinpage, "By Giving the Valid username and Vaild password user is not able to Loging");
	}

}
