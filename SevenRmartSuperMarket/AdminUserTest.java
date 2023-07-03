package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.utilities.ExcelUtility;

import Retry.Retry;

public class AdminUserTest extends Base {
	LoginPage loginPage;
	AdminUserPage adminUserPage;
	
	@Test(priority = 1,description = "TC009 Verify user can add new deliveryboy by clicking new button",groups = {"Regression"},retryAnalyzer = Retry.class)
	public void verifyUserCanAbleToAddNewUserInAdminUserPage() {
		loginPage = new LoginPage(driver);
		adminUserPage = new AdminUserPage(driver);
		loginPage.enterUsernameOnUsrnameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();		
		adminUserPage.clickOnMoreInfoButtonToloadAdminUserPage().clickOnNewButtonToAddUserserInAdminUserPage().enterUserNAmeForNewUserInAdminPage(ExcelUtility.getString(1, 0, "AdminUserInformation")).enterPasswordForNewUserInAdminPage(ExcelUtility.getString(1, 1, "AdminUserInformation")).clickOnUserTypeButtonInAdminUserPage();
		adminUserPage.clickOnSaveButtonToSaveTheDetailsInAdminUserInfoPage();
		boolean isAlertMessageDispalyedInAdminUser = adminUserPage.isAlertMessageGeneratedWhenSaveButtonIsClicked();
		assertTrue(isAlertMessageDispalyedInAdminUser, "The user cannot able to add new user in the admin user page");

	}
}
