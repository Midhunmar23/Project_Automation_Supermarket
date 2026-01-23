package testscrips;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {
	
	HomePage homepage;
	ManageCategoryPage managecategorypage;

	@Test(groups = {
			"regression" }, description = "verifyTheUserIsAbleToAddNewCategory", retryAnalyzer = retry.Retry.class)
	public void verifyTheUserIsAbleToAddCategory() throws IOException {

		String Username = ExcelUtility.getStringData(1, 0, "LogingData");
		String Password = ExcelUtility.getStringData(1, 1, "LogingData");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUserName(Username).enterThePassword(Password);
		homepage=loginPage.ButtonClickonSinginButton();
		//ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		//managecategorypage.manageCatagoryMoreinfo();
	
	     managecategorypage=homepage.manageCatagoryMoreinfo();
		managecategorypage.categoryNewcButtonClick();
		managecategorypage.selectTheradiobuttonclickonshowOnTopMenu().selectTheradiobuttonclickonshowOnTopMenu();
		String ManageCatagoryText = ExcelUtility.getStringData(1, 0, "ContactFooterInfo");
		managecategorypage.enterTheManageCatagoryCatagoryText(ManageCatagoryText).imageUploadManageCatagory().saveButtonClick();

	}
}
