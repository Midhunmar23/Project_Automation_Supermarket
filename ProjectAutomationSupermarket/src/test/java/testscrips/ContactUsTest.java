package testscrips;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AddAdminUserPage;
import pages.ContactUsPage;
import utilities.ExcelUtility;

public class ContactUsTest extends Base {

	@Test(groups = { "regression" }, description = "verifyTheUserIsAbleAddDetailsFromConatctUsPage")
	public void verifyTheUserIsAbleAddDetailsFromConatctUsPage() throws IOException {
		// String Username="admin";
		// String Password="admin";
		String Username = ExcelUtility.getStringData(1, 0, "Loginpage");
		String Password = ExcelUtility.getStringData(1, 1, "Loginpage");
		ContactUsPage contactuspage = new ContactUsPage(driver);
		contactuspage.enterTheUseName(Username);
		contactuspage.enterThePassword(Password);
		contactuspage.ButtonClickonSinginButton();
		contactuspage.contactUsButtonClick();
		contactuspage.actionButtonClick();
		String PhoneNumer = ExcelUtility.getStringData(1, 0, "CompanyDetails");
		contactuspage.enterTheCompanyPhoneNumer(PhoneNumer);
		String CompanyEmail = ExcelUtility.getStringData(2, 0, "CompanyDetails");
		contactuspage.enterTheCompanyEmail(CompanyEmail);
		String CompanyAddress = ExcelUtility.getStringData(3, 0, "CompanyDetails");
		contactuspage.enterTheCompanyAddress(CompanyAddress);
		String Time = ExcelUtility.getStringData(4, 0, "CompanyDetails");
		contactuspage.enterTheDeliveryTime(Time);
		String DeleveryCharge = ExcelUtility.getStringData(5, 0, "CompanyDetails");
		contactuspage.enterTheDeliveryChargeLimit(DeleveryCharge);
		contactuspage.updateButtonClick();

	}
}
