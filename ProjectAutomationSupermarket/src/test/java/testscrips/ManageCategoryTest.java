package testscrips;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {

	@Test(groups = {
			"regression" }, description = "verifyTheUserIsAbleToAddNewCategory", retryAnalyzer = retry.Retry.class)
	public void verifyTheUserIsAbleToAddCategory() throws IOException {

		String Username = ExcelUtility.getStringData(1, 0, "LogingData");
		String Password = ExcelUtility.getStringData(1, 1, "LogingData");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUserName(Username);
		loginPage.enterThePassword(Password);
		loginPage.ButtonClickonSinginButton();
		ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.manageCatagoryButtonClick();
		managecategorypage.categoryNewcButtonClick();
		managecategorypage.selectTheradiobuttonclickonshowOnTopMenu();
		managecategorypage.selectTheradiobuttonclickonshowOnTopMenu();
		String ManageCatagoryText = ExcelUtility.getStringData(1, 0, "ContactFooterInfo");
		managecategorypage.enterTheManageCatagoryCatagoryText(ManageCatagoryText);
		managecategorypage.imageUploadManageCatagory();
		managecategorypage.saveButtonClick();

	}
}
