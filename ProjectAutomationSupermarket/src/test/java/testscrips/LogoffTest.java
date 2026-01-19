package testscrips;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.DashboardManageNewsPage;
import pages.LoginPage;
import pages.LogoffPage;
import utilities.ExcelUtility;

public class LogoffTest extends Base {

	@Test(groups = {
			"regression" }, description = "verifyTheUserIsAbleToLogoffFromTheCreatedAccount", retryAnalyzer = retry.Retry.class)
	public void verifyTheUserIsAbleToLogoffFromTheCreatedAccount() throws IOException {
		String Username = ExcelUtility.getStringData(1, 0, "LogingData");
		String Password = ExcelUtility.getStringData(1, 1, "LogingData");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUserName(Username);
		loginPage.enterThePassword(Password);
		loginPage.ButtonClickonSinginButton();

		LogoffPage logoffpage = new LogoffPage(driver);
		logoffpage.logoutButton();
		logoffpage.logOffButtonClick();
		boolean isLoginPageDisplayed = logoffpage.isLoginPageDisplayed();
		Assert.assertTrue(isLoginPageDisplayed, Constant.INVALIDLOGINERRORMESSAGE);

	}

}
