package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement userNameTextField;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordTestField;
	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']")
	WebElement signInButton;
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	WebElement invalidUserNameOrPassword;;
	@FindBy(xpath = "//i[@class='nav-icon fas fa-shopping-basket']")
	WebElement homePageElement7rSuperMarket;

	public LoginPage enterUsernameOnUsrnameField(String userName) {
		userNameTextField.sendKeys(userName);
		return this;
	}

	public LoginPage enterPasswordOnPasswordField(String password) {
		passwordTestField.sendKeys(password);
		return this;
	}

	public LoginPage clickOnSignInButton() {
		signInButton.click();
		return this;
	}

	public boolean invalidLoginMessage() {
		boolean invalidLoginMessageIsDisplayed = invalidUserNameOrPassword.isDisplayed();
		return invalidLoginMessageIsDisplayed;
	}

	public boolean userCanLoginToHomePage() {
		boolean elementIsDisplayedWhenLogin = homePageElement7rSuperMarket.isDisplayed();
		return elementIsDisplayedWhenLogin;
	}
}
