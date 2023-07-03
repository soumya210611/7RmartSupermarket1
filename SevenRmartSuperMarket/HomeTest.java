package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.utilities.ExcelUtility;

import Retry.Retry;

public class HomeTest extends Base {
	LoginPage loginPage;
	HomePage homePage;
	@Test(priority = 1,description = "TC009 Verify user can abel to logout by clicking logout button",groups = {"Regression"},retryAnalyzer = Retry.class)
	public void verifyWhetherUserCanAbleToLogOutFromApplication() {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		loginPage.enterUsernameOnUsrnameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		homePage.clickOnAdminButtonForLogOut().clickOnLogOutButtonInHomePage();
		boolean loginPageLogoDispalyedWhenLogOut = homePage.isLogInPageLogoDisplayed();
		assertTrue(loginPageLogoDispalyedWhenLogOut, " The user cannot able to logout from the Application ");
	}
}
