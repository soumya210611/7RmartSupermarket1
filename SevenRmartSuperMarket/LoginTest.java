package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.obsqura.utilities.ExcelUtility;

import Retry.Retry;

public class LoginTest extends Base {
	LoginPage loginPage;
	@Test(priority = 1,description = "TC009 verify Whether The User Is Able To LogIn with Valid Username And Valid Password While Clicking OnS ignIn Button",groups = {"Regression"},retryAnalyzer = Retry.class)
	public void verifyWhetherTheUserIsAbleToLogInwithValidUsernameAndValidPasswordWhileClickingOnSignInButton()throws Exception {
		loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsrnameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		boolean userLoginToHomePageIsDispalyaed = loginPage.userCanLoginToHomePage();
		assertTrue(userLoginToHomePageIsDispalyaed,"The user cannot able to login Valid username and Valid Password While Click on SignIn Button");
	}

	@Test(priority = 2,description = "TC009 Verify user can add new deliveryboy by clicking new button",groups = {"Regression"},retryAnalyzer = Retry.class)
	public void verifyWhetherTheUserIsAbleToLogInwithInValidUsernameAndValidPasswordWhileClickingOnSignInButton() {
		loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsrnameField(ExcelUtility.getString(2, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(2, 1, "LoginPage")).clickOnSignInButton();
		boolean userGetInvalidLoginMessage = loginPage.invalidLoginMessage();
		assertTrue(userGetInvalidLoginMessage,"The user is able to login with inValid username and Valid Password While Click on SignIn Button");
	}

	@Test(priority = 4,description = "TC009 Verify user Is Able To Log In with InValid Username And InValid Password While Clicking On SignIn Button",groups = {"Regression"},retryAnalyzer = Retry.class)
	@Parameters({ "username", "password" })
	public void verifyWhetherTheUserIsAbleToLogInwithInValidUsernameAndInValidPasswordWhileClickingOnSignInButton(String username, String password) {
		loginPage = new LoginPage(driver).enterUsernameOnUsrnameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		boolean userGetInvalidLoginMessage = loginPage.invalidLoginMessage();
		assertTrue(userGetInvalidLoginMessage,"The user is able to login InValid username and InValid Password While Click on SignIn Button");
	}

	@Test(priority = 5, description = "TC004 Verify users can able to login using Invalid credentials", groups = {"Smoke" }, retryAnalyzer = Retry.class, dataProvider = "SearchProvider")
	public void verifyWhetherTheUserIsAbleToLogInwithInValidUsernameAndInValidPasswordWhileClickingOnSignInButtonUsingDataProvider(String username, String password) {
		loginPage = new LoginPage(driver).enterUsernameOnUsrnameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		boolean userGetInvalidLoginMessage = loginPage.invalidLoginMessage();
		assertTrue(userGetInvalidLoginMessage,"The user is able to login InValid username and InValid Password While Click on SignIn Button");
	}

	@DataProvider(name = "SearchProvider")
	public Object[][] getDataFromDataprovider() {
		return new Object[][] { { "admin", "Krishna" }, { "admin", "aparna" }

		};

	}
}
