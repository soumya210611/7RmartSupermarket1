package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.utilities.ExcelUtility;

import Retry.Retry;

public class ManageOrderTest extends Base{
	LoginPage loginPage;
	ManageOrderPage manageOrderPage;
	@Test(priority = 1,description = "TC009 Verify user can add new slider information by clicking new button",groups = {"Regression"},retryAnalyzer = Retry.class)
	public void verifyWhetherUserCanAbleToUpdateDateFromManageOrderPage() {
		
		loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsrnameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		manageOrderPage=new ManageOrderPage(driver);
		manageOrderPage.clickOnMoreInfoButtonInManageOrderPage().clickChangeDeliveryDateButtonInManageOrderPage().clickOnDeliveryDateFieldInManageOrderPage().clickOnUpdateButtonInDateFromManageOrderPage();
		boolean isSucessMessageShownInOrderPage= manageOrderPage.isAlertMessageDisplayedAfertUpdateInManageOrderPage();
		assertTrue(isSucessMessageShownInOrderPage,"The user cannot able to update date from manage order page");		
	}
	

}
