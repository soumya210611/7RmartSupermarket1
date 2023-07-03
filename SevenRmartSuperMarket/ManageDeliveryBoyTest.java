package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.utilities.ExcelUtility;
import com.obsqura.utilities.RandomDataUtility;

import Retry.Retry;

public class ManageDeliveryBoyTest extends Base{
	LoginPage loginPage;
	ManageDeliveryBoyPage manageDeliveryBoyPage;
	@Test(priority = 1,description = "TC009 Verify user can add new deliveryboy by clicking new button",groups = {"Regression"},retryAnalyzer = Retry.class)
	public void verifyWhetherUserCanAbleToAddNewDeleveryBoy() {
		LoginPage loginPage = new LoginPage(driver);
		RandomDataUtility randomDataUtility=new RandomDataUtility();
		loginPage.enterUsernameOnUsrnameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		ManageDeliveryBoyPage manageDeliveryBoyPage=new ManageDeliveryBoyPage(driver);
		manageDeliveryBoyPage.clickOnMoreInfoButtonForLoadingManageDeliveryBoyPage().clickOnNewButtonToAddDeleveryBoys().enterNameOfDeleveryBoyInfoTextField(randomDataUtility.togetFirstname()).enterUsernameInDeliveryInfoTextFiled(ExcelUtility.getString(1, 1, "AdminUserInformation")).enterPasswordInDeliveryInfoTextField(ExcelUtility.getString(1, 2, "AdminUserInformation")).clickSaveButtonInDeliveryBoyPage();
		boolean isAlertMessageDisplayedInDelivaryBoyPage=manageDeliveryBoyPage.isAlertMessageDisplayedWhenSaveIsGivenInDeliveryPage();
		assertTrue(isAlertMessageDisplayedInDelivaryBoyPage,"The user cannot able to add new delivery boy");
	}

}
