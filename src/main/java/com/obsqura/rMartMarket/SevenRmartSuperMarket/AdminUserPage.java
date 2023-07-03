package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class AdminUserPage {
public WebDriver driver;
	
	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'])[2]")
	WebElement moreInfoButtonInAdminUsersElement;
	@FindBy(xpath = "//a[contains(@class,'btn btn-rounded btn-danger')]")
	WebElement newButtonInAdminUserPage;
	@FindBy(xpath = "//input[@id='username']")
	WebElement usernameInAdminUserPage;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordInAdminPage;
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement userTpeButtonInAdminUser;
	@FindBy(xpath = "//select[@name='ut']//child::option[@value='staff']")
	WebElement staffOptionSelectFromUserType;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement saveButtonInAdminUserInfoPage;
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	WebElement alertMessageGeneratedWhenSaveDetailsInAdminPge;
	
	public AdminUserPage clickOnMoreInfoButtonToloadAdminUserPage() {
		moreInfoButtonInAdminUsersElement.click();
		return this;
	}
	public AdminUserPage clickOnNewButtonToAddUserserInAdminUserPage() {
		newButtonInAdminUserPage.click();
		return this;
	}
	public AdminUserPage enterUserNAmeForNewUserInAdminPage(String username) {
		usernameInAdminUserPage.sendKeys(username);
		return this;
	}
	public AdminUserPage enterPasswordForNewUserInAdminPage(String password) {
		passwordInAdminPage.sendKeys(password);
		return this;
	}

	public AdminUserPage clickOnUserTypeButtonInAdminUserPage() {
		userTpeButtonInAdminUser.click();
		PageUtility pageUtility = new PageUtility();
		pageUtility.selectDropdownbyIndex(userTpeButtonInAdminUser, 1);
		return this;
	}
	public AdminUserPage clickOnStaffFromUserTypeInAdminUserElement() {
		staffOptionSelectFromUserType.click();
		return this;
	}
	public AdminUserPage clickOnSaveButtonToSaveTheDetailsInAdminUserInfoPage() {
		saveButtonInAdminUserInfoPage.click();
		return this;
	}
	public boolean isAlertMessageGeneratedWhenSaveButtonIsClicked() {
		return alertMessageGeneratedWhenSaveDetailsInAdminPge.isDisplayed();
	}
}
