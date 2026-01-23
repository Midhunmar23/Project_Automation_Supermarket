package testscrips;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	
	HomePage homepage;

	@Test(groups = {
			"regression" }, description = "verifyTheUserIsAbleToLoginTheSinginUsingValdCrediatiols", retryAnalyzer = retry.Retry.class)
	public void verifyTheUserIsAbleToLoginTheSinginUsingValdCrediatiols() throws IOException {
		String Username = ExcelUtility.getStringData(1, 0, "LogingData");
		String Password = ExcelUtility.getStringData(1, 1, "LogingData");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(Username).enterThePassword(Password);
		homepage=loginpage.ButtonClickonSinginButton();
		boolean isDashboardDisplayed = loginpage.isDashboardDisplayed();
		Assert.assertTrue(isDashboardDisplayed, Constant.DASHBOARDTEXT);
	}

	@Test(groups = {
			"regression" }, description = "verifyThatTheUserSholudNotAbleToSinginWithinVaidUsernameandvalidPasswordPassword", retryAnalyzer = retry.Retry.class)
	public void verifyThatTheUserSholudNotAbleToSinginWithinVaidUsernameandvalidPassword() throws IOException {

		// String Username = ExcelUtility.getStringData(2, 0, "Loginpage");
		// String Password = ExcelUtility.getStringData(2, 1, "Loginpage");

		Faker faker = new Faker();
		String Username = faker.name().username();
		String Password = faker.internet().password();

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(Username).enterThePassword(Password);
		homepage=loginpage.ButtonClickonSinginButton();
		boolean isLoginPageDisplayed = loginpage.isLoginPageDisplayed();
		Assert.assertTrue(isLoginPageDisplayed, Constant.INVALIDLOGINERRORMESSAGE

		);

	}

	@Test(groups = {
			"regression" }, description = "verifyThatTheUserSholudNotAbleToSinginWithinVaidUsernameandinvalidPassword", retryAnalyzer = retry.Retry.class)
	public void verifyThatTheUserSholudNotAbleToSinginWithinVaidUsernameandinvalidPassword() throws IOException {
		String Username = ExcelUtility.getStringData(3, 0, "LogingData");
		String Password = ExcelUtility.getStringData(3, 1, "LogingData");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(Username).enterThePassword(Password);
		homepage=loginpage.ButtonClickonSinginButton();
		boolean isLoginPageDisplayed = loginpage.isLoginPageDisplayed();
		Assert.assertTrue(isLoginPageDisplayed, Constant.INVALIDLOGINERRORMESSAGE

		);

	}

	@Test(dataProvider="loginProvider",groups = {"regression" }, description = "verifyThatTheUserSholudNotAbleToSinginWithInVaidUsernameandInvalidPassword", retryAnalyzer = retry.Retry.class)
	public void verifyThatTheUserSholudNotAbleToSinginWithInVaidUsernameandInvalidPassword(String Username, String Password) throws IOException {
		//String Username = ExcelUtility.getStringData(4, 0, "LogingData");
		//String Password = ExcelUtility.getStringData(4, 1, "LogingData");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(Username).enterThePassword(Password);
		homepage=loginpage.ButtonClickonSinginButton();
		boolean isLoginPageDisplayed = loginpage.isLoginPageDisplayed();
		Assert.assertTrue(isLoginPageDisplayed, Constant.INVALIDLOGINERRORMESSAGE

		);

	}
	
	@DataProvider(name = "loginProvider")
	public Object[][] getDataFromDataProvider() throws IOException {

		return new Object[][] { new Object[] { "admin", "admin22" }, new Object[] { "admin123", "123" },};

}
}
