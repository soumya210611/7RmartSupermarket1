package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.obsqura.utilities.ExcelUtility;
import com.obsqura.utilities.RandomDataUtility;

import Retry.Retry;

public class ManageUserTest extends Base{
	LoginPage loginPage;
	ManageUserPage manageUserPage;

	@Test(priority = 1,dataProvider = "dataFromExcel", description = "TC009 Verify user can able to search information by clicking new button", groups = {"Regression" }, retryAnalyzer = Retry.class)
	public void verifyWhetherUserCanAbleToSearchUsersInManageUserPage(String username) {
		loginPage = new LoginPage(driver);
		manageUserPage = new ManageUserPage(driver);
		loginPage.enterUsernameOnUsrnameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		manageUserPage.clickOnMoreInfoButtonInuserPage().clickOnSearchButtonInUserPage().enterNameInUserPage(username).enterMailIdInUserPage(ExcelUtility.getString(1, 1, "ManageUser")).enterPhoneNumberInUserPage(ExcelUtility.getString(1, 2, "ManageUser")).clickOnSearchButtonInListOfUsers();
		boolean isErrorMsgShown = manageUserPage.isErrorMessageDispalyedInUserPage();
		assertTrue(isErrorMsgShown,"The user cannot able to search users");
	}
	@DataProvider(name = "dataFromExcel")
	public Object[][] getDataFromTestData() {
		return new Object[][] { {  ExcelUtility.getString(1, 1, "ManageUser") },

		};
	}
}
