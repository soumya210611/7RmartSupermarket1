package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.utilities.ExcelUtility;

import Retry.Retry;

public class ManageNewsTest extends Base {
	LoginPage loginPage;
	ManageNewsPage manageNewsPage;
	
	@Test(priority = 1,description = "TC009 Verify user can add news by clicking new button",groups = {"Regression"},retryAnalyzer = Retry.class)
	public void verifyWhetherUserCanAbleToUPdateNewsInManageNewsPage() {
	loginPage = new LoginPage(driver);
	loginPage.enterUsernameOnUsrnameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
	manageNewsPage=new ManageNewsPage(driver);
	manageNewsPage.navigateToManageNewsFromDashboard();
	manageNewsPage.clickOnNewButtonToAddNewsinManagePage().enterNewsInTheTextFiled(ExcelUtility.getString(1, 0, "News"));
	boolean alertMessageInNewsPage =manageNewsPage.isAlertMessageDisplayed();
	assertTrue(alertMessageInNewsPage,"The User cannot able to update news in manage news Page");


	}	
}
