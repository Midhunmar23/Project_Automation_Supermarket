package testscrips;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUserPage;
import pages.ContactUsPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class ContactUsTest extends Base {

	@Test(groups = {
			"regression" }, description = "verifyTheUserIsAbleAddDetailsFromConatctUsPage", retryAnalyzer = retry.Retry.class)
	public void verifyTheUserIsAbleAddDetailsFromConatctUsPage() throws IOException {

		String username = ExcelUtility.getStringData(1, 0, "LogingData");
		String password = ExcelUtility.getStringData(1, 1, "LogingData");

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUserName(username);
		loginPage.enterThePassword(password);
		loginPage.ButtonClickonSinginButton();

		boolean isDashboardDisplayed = loginPage.isDashboardDisplayed();
		Assert.assertTrue(isDashboardDisplayed, Constant.DASHBOARDTEXT);

		ContactUsPage contactUsPage = new ContactUsPage(driver);
		contactUsPage.clickOnContactUsButton();
		contactUsPage.clickOnActionButton();

		/*
		 * String phoneNumber= "9746970366"; String
		 * companyEmail="midhun254@yopmail.com"; String companyAddress="New Avenue";
		 * String deliveryTime="5"; String deliveryCharge="12";
		 */

		String phoneNumber = ExcelUtility.getIntegerData(0, 0, "CompanyDetails");
		String companyEmail = ExcelUtility.getStringData(1, 0, "CompanyDetails");
		String companyAddress = ExcelUtility.getStringData(2, 0, "CompanyDetails");
		String deliveryTime = ExcelUtility.getIntegerData(3, 0, "CompanyDetails");
		String deliveryCharge = ExcelUtility.getIntegerData(4, 0, "CompanyDetails");
		contactUsPage.enterCompanyPhoneNumer(phoneNumber);
		contactUsPage.enterCompanyEmail(companyEmail);
		contactUsPage.enterCompanyAddress(companyAddress);
		contactUsPage.enterDeliveryTime(deliveryTime);
		contactUsPage.enterDeliveryChargeLimit(deliveryCharge);

		contactUsPage.clickOnUpdateButton();
		boolean AlertContactUpdatedSuccessfully = contactUsPage.AlertContactUpdatedSuccessfully();
		Assert.assertTrue(AlertContactUpdatedSuccessfully, Constant.CONTACTUPDATEDSUCCESSFULLY);

	}
}
