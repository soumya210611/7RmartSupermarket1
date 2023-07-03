package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.utilities.ExcelUtility;

import Retry.Retry;

public class ManagePageTest extends Base {
	LoginPage loginPage;
	ManagePage managePage;
	
	@Test(priority = 1,description = "TC009 Verify user can edit information by clicking new button",groups = {"Regression"},retryAnalyzer = Retry.class)
	public void verifyWhetherUserCanAbleToEditManageInfopage() {
		loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsrnameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		managePage = new ManagePage(driver);
		managePage.clickOnMoreInfoButtonFromManagePages().clickOnEditButtonFromInfoPage().enterNewTitleForEditingManageInfoPage(ExcelUtility.getString(1, 0, "ManagePageEdit")).enterNewDescriptionForEditingMAnageInfoPage(ExcelUtility.getString(1, 1, "ManagePageEdit")).clickOnUpdateButtonInEditInfoPageInManageInfoPage();
		boolean isAlertMEssageDispalyedInManagePageFromEdit = managePage.isAlertMessageDispalyedWhenEditIsDoneInManagePage();
		assertTrue(isAlertMEssageDispalyedInManagePageFromEdit,"The user cannot able to edit");
	}
	
	@Test(priority = 2,description = "TC009 Verify user can able to delete information by clicking delete button",groups = {"Regression"},retryAnalyzer = Retry.class)
	public void verifyWhetherUserCanAbleToDeleteTitleFromManagePage() {
		loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsrnameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		 managePage = new ManagePage(driver);
		managePage.clickOnMoreInfoButtonFromManagePages().clickDeleteButtonInManageInfoPage();
		boolean isAlertMessageinManagePageFromDelete = managePage.isAlertMessageIsDisplayedWhenDelectButtonClickedInManagePage();
		assertTrue(isAlertMessageinManagePageFromDelete,"The user cannot Able to delete");
	}

}
