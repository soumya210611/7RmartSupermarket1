package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.utilities.ExcelUtility;

import Retry.Retry;

public class ManageLocationTest extends Base{
	LoginPage loginPage;
	ManageLocationPage manageLocationPage;

	@Test(priority = 1,description = "TC009 Verify user can add Location information by clicking new button",groups = {"Regression"},retryAnalyzer = Retry.class)
	public void verifyWhetherLocationIsUpdatedInLocationPage() {
		loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsrnameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		manageLocationPage = new ManageLocationPage(driver);
		manageLocationPage.clickMoreInfoLocationPage().clickOnNewBottonInLocationPage().clickOnCountryToSelectInLocationPage(ExcelUtility.getString(1, 0, "Country")).clickOnStateToSelectInLocationPage(ExcelUtility.getString(1, 0, "State")).enterLocationInLocationPage(ExcelUtility.getString(1, 0, "location")).enterDeliveryChargeInLocationPage(ExcelUtility.getString(1, 0, "DeliveryCharge")).ClickOnSaveButtonInLocationPage();
		boolean isAlertMessageShownInPage = manageLocationPage.isAlertMessageDispalyedInLocationPage();
		assertTrue(isAlertMessageShownInPage, "Location cannot updated in Location Page");
	}
}
