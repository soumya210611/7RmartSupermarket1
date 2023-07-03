package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.utilities.ExcelUtility;

import Retry.Retry;

public class MobileSliderTest extends Base {
	LoginPage loginPage ;
	MobileSliderPage mobileSliderPage;

	@Test(priority = 1,description = "TC009 Verify user can add new slider information by clicking new button",groups = {"Regression"},retryAnalyzer = Retry.class)
	public void verifyUserCanAbleToUploadFileInMobileSlider() {
		loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsrnameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		mobileSliderPage = new MobileSliderPage(driver);
		mobileSliderPage.clickOnMoreInfoButtonInSliderPage().clickOnNewButtonInMobileSliderPage().clickOnChoofileButtonInMobileSliderPage().enterLinkTextFieldInSliderPage(ExcelUtility.getString(1, 0, "SliderPage")).clickOnSaveButtonInMobileSliderPage();
		boolean isSucessAlertMessageDisplayedInMobileSliderPage = mobileSliderPage.isAlerMessagedisplayedWhenSaveTheFile();
		assertTrue(isSucessAlertMessageDisplayedInMobileSliderPage,"The use cannot Able to uploadFileInMoble Slider page");
	}
}
