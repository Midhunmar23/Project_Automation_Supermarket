package testscrips;

import java.io.IOException;

import org.testng.annotations.Test;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {

	@Test(groups = {"regression" }, description = "verifyTheUserIsAbleToAddNewCategory")
	public void verifyTheUserIsAbleToAddCategory() throws IOException {
// String Username="admin";
// String Password="admin";
		String Username = ExcelUtility.getStringData(1, 0, "Loginpage");
		String Password = ExcelUtility.getStringData(1, 1, "Loginpage");
		ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.enterTheUseName(Username);
		managecategorypage.enterThePassword(Password);
		managecategorypage.ButtonClickonSinginButton();
		managecategorypage.ManageCatagoryButtonClick();
		String ManageCatagoryText = ExcelUtility.getStringData(1, 0, "ContactFooterInfo");
		managecategorypage.enterTheManageCatagoryCatagoryText(ManageCatagoryText);
		managecategorypage.imageUploadManageCatagory();
		managecategorypage.saveButtonClick();

	}
}
