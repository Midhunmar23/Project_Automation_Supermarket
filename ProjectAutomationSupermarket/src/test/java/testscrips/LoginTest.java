package testscrips;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {

	@Test(groups = {"regression" }, description = "verifyTheUserIsAbleToLoginTheSinginUsingValdCrediatiols", retryAnalyzer = retry.Retry.class)
	public void verifyTheUserIsAbleToLoginTheSinginUsingValdCrediatiols() throws IOException {
		// String Username="admin";
		// String Password="admin";
		String Username = ExcelUtility.getStringData(1, 0, "Loginpage");
		String Password = ExcelUtility.getStringData(1, 1, "Loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUseName(Username);
		loginpage.enterThePassword(Password);
		loginpage.ButtonClickonSinginButton();
		boolean homepage = loginpage.isDashboardDisplayed();
		Assert.assertTrue(homepage, "By Giving the Valid username and Vaild password user is not able to Loging");
	}

	@Test(groups = {
			"regression" }, description = "verifyThatTheIsAbleToSinginWithinVaidUsername", retryAnalyzer = retry.Retry.class)
	public void verifyThatTheUserSholudNotAbleToSinginWithinVaidUsernameandInvalidPassword() throws IOException {
		String Username = ExcelUtility.getStringData(2, 0, "Loginpage");
		String Password = ExcelUtility.getStringData(2, 1, "Loginpage");

		// String Username="Adim12";
		// String Password="admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUseName(Username);
		loginpage.enterThePassword(Password);
		loginpage.ButtonClickonSinginButton();
		boolean singinpageValidationMessage = loginpage.isValidationMessageForIncorrectUsernameDisplayed();
		Assert.assertTrue(singinpageValidationMessage,
				"The user is able to loging the appication By giving Vaild Username and Password");
	}

	@Test(groups = {
			"regression" }, description = "verifyThatTheUserShouldnotabletoLoginWithInvalidPasswordandCorrectUsername", retryAnalyzer = retry.Retry.class)
	public void verifyThatTheUserShouldnotabletoLoginWithInvalidPasswordandCorrectUsername() throws IOException {

		String Username = ExcelUtility.getStringData(3, 0, "Loginpage");
		String Password = ExcelUtility.getStringData(3, 1, "Loginpage");

		// String Username="admin";
		// String Password="admin@1234";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUseName(Username);
		loginpage.enterThePassword(Password);
		loginpage.ButtonClickonSinginButton();
		boolean singinpageValidationMessage = loginpage.isValidationMessageForIncorrectUsernameDisplayed();
		Assert.assertTrue(singinpageValidationMessage);
	}

	@Test(groups = {
			"regression" }, description = "verifyThatTheUserShouldNotAbleToLoginWithInvalidUserCrediations", retryAnalyzer = retry.Retry.class)
	public void verifyThatTheUserShouldNotAbleToLoginWithInvalidUserCrediations() throws IOException {
		// String Username="admin15";
		// String Password="admin@1234";
		String Username = ExcelUtility.getStringData(4, 0, "Loginpage");
		String Password = ExcelUtility.getStringData(4, 1, "Loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUseName(Username);
		loginpage.enterThePassword(Password);
		loginpage.ButtonClickonSinginButton();
		boolean singinpageValidationMessage = loginpage.isValidationMessageForIncorrectUsernameDisplayed();
		Assert.assertTrue(singinpageValidationMessage);
	}

	
}
