package testscrips;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.DashboardManageNewsPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.PageUtility;

public class DashboardManageNewsTest extends Base {

	@Test(groups = {
			"regression" }, description = "verifyTheUserIsAbleToLoginTheSinginUsingValdCrediatiolsAndWithGivingInvalidTestShouldNotDispayAnyOutputInManageNews", retryAnalyzer = retry.Retry.class)
	public void verifyTheUserIsAbleToLoginTheSinginUsingValdCrediatiolsAndWithGivingValidTextinTheTextareaItShouldDispayAAlertMeassgeManageNews()
			throws IOException {
		// String Username="admin";
		// String Password="admin";
		String Username = ExcelUtility.getStringData(1, 0, "LogingData");
		String Password = ExcelUtility.getStringData(1, 1, "LogingData");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(Username);
		loginpage.enterThePassword(Password);
		loginpage.ButtonClickonSinginButton();
		boolean isDashboardDisplayed = loginpage.isDashboardDisplayed();
		Assert.assertTrue(isDashboardDisplayed, Constant.DASHBOARDTEXT);

		DashboardManageNewsPage dashboardmanagenewspage = new DashboardManageNewsPage(driver);
		dashboardmanagenewspage.NewsManageButtonClick();
		dashboardmanagenewspage.NewsButtonClick();
		// String NewTextArea="NewsRead";
		String NewTextArea = ExcelUtility.getStringData(1, 0, "TestData");
		dashboardmanagenewspage.EnterTheTextInField(NewTextArea);
		dashboardmanagenewspage.SaveButtonClick();

		boolean isAlerNewCreatedtDisplayed = dashboardmanagenewspage.isAlerNewNewsCreatedtDisplayed();
		Assert.assertTrue(isAlerNewCreatedtDisplayed, Constant.NEWSCREATEDSUCCESSFULLY);

	}

}
