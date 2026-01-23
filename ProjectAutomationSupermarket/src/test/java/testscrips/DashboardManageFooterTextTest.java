package testscrips;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.ContactUsPage;
import pages.DashboardManageFooterTextPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class DashboardManageFooterTextTest extends Base {

	HomePage homepage;
	DashboardManageFooterTextPage dashboardManageFooterTextPage;
	
	@Test(groups = {
			"regression" }, description = "verifyTheUserIsAbleAddDetailsFromConatctUsPage", retryAnalyzer = retry.Retry.class)
	public void verifyTheUserIsAbleAddDetailsFromManageFooterPage() throws IOException {

		String username = ExcelUtility.getStringData(1, 0, "LogingData");
		String password = ExcelUtility.getStringData(1, 1, "LogingData");

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUserName(username);
		loginPage.enterThePassword(password);
		homepage=loginPage.ButtonClickonSinginButton();

		//DashboardManageFooterTextPage dashboardManageFooterTextPage = new DashboardManageFooterTextPage(driver);
		//dashboardManageFooterTextPage.manageFootermoreinfo();
		
		//dashboardManageFooterTextPage=homepage.manageFootermoreinfo();
		
		dashboardManageFooterTextPage= homepage.manageFootermoreinfo().actionFooterText();

		/*
		 * String address= "1234avenuew"; String email="midhun254@yopmail.com"; String
		 * phone="9746970355";
		 */
		String address = ExcelUtility.getStringData(0, 0, "ContactFooterInfo");
		String email = ExcelUtility.getStringData(1, 0, "ContactFooterInfo");
		String phone = ExcelUtility.getIntegerData(2, 0, "ContactFooterInfo");

		dashboardManageFooterTextPage.enterTheAddressFooterManage(address).enterTheEmailFooterManage(email).enterThePhoneFooterManage(phone);
		dashboardManageFooterTextPage.updateButtonManageContactPage();

		boolean AlertFooterTextUpdatedSuccessfully = dashboardManageFooterTextPage.AlertFooterTextUpdatedSuccessfully();
		Assert.assertTrue(AlertFooterTextUpdatedSuccessfully, Constant.FOOTERTEXTUPDATEDSUCCESSFULLYALERT);
	}

}
