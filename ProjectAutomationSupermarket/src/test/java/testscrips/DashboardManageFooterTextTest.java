package testscrips;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.DashboardManageFooterTextPage;
import utilities.ExcelUtility;

public class DashboardManageFooterTextTest extends Base {

	@Test(groups = { "regression" }, description = "verifyTheUserIsAbleAddDetailsFromConatctUsPage")
	public void verifyTheUserIsAbleAddDetailsFromManageFooterPage() throws IOException {
		// String Username="admin";
		// String Password="admin";
		String Username = ExcelUtility.getStringData(1, 0, "Loginpage");
		String Password = ExcelUtility.getStringData(1, 1, "Loginpage");
		DashboardManageFooterTextPage dashboardmanagefootertextpage = new DashboardManageFooterTextPage(driver);
		dashboardmanagefootertextpage.enterTheUseName(Username);
		dashboardmanagefootertextpage.enterThePassword(Password);
		dashboardmanagefootertextpage.ButtonClickonSinginButton();
		dashboardmanagefootertextpage.manageFooterText();
		dashboardmanagefootertextpage.actionFooterText();
		String Address = ExcelUtility.getStringData(1, 0, "ContactFooterInfo");
		dashboardmanagefootertextpage.enterTheAddressFooterManage(Address);
		String Email = ExcelUtility.getStringData(2, 0, "ContactFooterInfo");
		dashboardmanagefootertextpage.enterTheEmailFooterManage(Email);
		String Phone = ExcelUtility.getStringData(3, 0, "ContactFooterInfo");
		dashboardmanagefootertextpage.enterThePhoneFooterManage(Phone);
		dashboardmanagefootertextpage.updatebuttonManagecotactpage();
	}

}
