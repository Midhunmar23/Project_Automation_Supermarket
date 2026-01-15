package testscrips;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashboardManageNewsPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.PageUtility;

public class DashboardManageNewsTest extends Base {

	@Test(groups = {
			"regression" }, description = "verifyTheUserIsAbleToLoginTheSinginUsingValdCrediatiolsAndWithGivingInvalidTestShouldNotDispayAnyOutputInManageNews")
	public void verifyTheUserIsAbleToLoginTheSinginUsingValdCrediatiolsAndWithGivingValidTextinTheTextareaItShouldDispayAAlertMeassgeManageNews()
			throws IOException {
		// String Username="admin";
		// String Password="admin";
		String Username = ExcelUtility.getStringData(1, 0, "Loginpage");
		String Password = ExcelUtility.getStringData(1, 1, "Loginpage");
		DashboardManageNewsPage dashboardmanagenewspage = new DashboardManageNewsPage(driver);
		dashboardmanagenewspage.enterTheUseName(Username);
		dashboardmanagenewspage.enterThePassword(Password);
		dashboardmanagenewspage.ButtonClickonSinginButton();
		boolean homepage = dashboardmanagenewspage.isDashboardDisplayed();
		Assert.assertTrue(homepage, "By Giving the Valid username and Vaild password user is not able to Loging");
		dashboardmanagenewspage.NewsManageButtonClick();
		dashboardmanagenewspage.NewsButtonClick();
		// String NewTextArea="NewsRead";
		String NewTextArea = ExcelUtility.getStringData(1, 0, "TestData");
		dashboardmanagenewspage.EnterTheTextInField(NewTextArea);
		dashboardmanagenewspage.SaveButtonClick();
		boolean alet = dashboardmanagenewspage.isAlertDisplayed();
		Assert.assertTrue(alet, "Text is Given and accepted");
		// dashboardmanagenewspage.

	}

	@Test(groups = {
			"regression" }, description = "verifyTheUserIsAbleToLoginTheSinginUsingValdCrediatiolsAndWithGivingInvalidTestShouldNotDispayAnyOutputInManageNews")
	public void verifyTheUserIsAbleToLoginTheSinginUsingValdCrediatiolsAndWithGivingInvalidTestShouldNotDispayAnyOutputInManageNews()
			throws IOException {
		// String Username="admin";
		// String Password="admin";
		String Username = ExcelUtility.getStringData(1, 0, "Loginpage");
		String Password = ExcelUtility.getStringData(1, 1, "Loginpage");
		DashboardManageNewsPage dashboardmanagenewspage = new DashboardManageNewsPage(driver);
		dashboardmanagenewspage.enterTheUseName(Username);
		dashboardmanagenewspage.enterThePassword(Password);
		dashboardmanagenewspage.ButtonClickonSinginButton();
		boolean homepage = dashboardmanagenewspage.isDashboardDisplayed();
		Assert.assertTrue(homepage, "By Giving the Valid username and Vaild password user is not able to Loging");
		dashboardmanagenewspage.NewsManageButtonClick();
		dashboardmanagenewspage.NewsButtonClick();
		String NewTextArea = "";
		dashboardmanagenewspage.EnterTheTextInField(NewTextArea);
		dashboardmanagenewspage.SaveButtonClick();

	}

}
