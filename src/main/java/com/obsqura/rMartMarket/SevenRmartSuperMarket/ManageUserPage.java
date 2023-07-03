package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.RandomDataUtility;

public class ManageUserPage {
	public WebDriver driver;
	public ManageUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-user']")
	WebElement moreInfoButtonInUserPage;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchButtonInUserPage;
	@FindBy(xpath = "//input[@id='un']")
	WebElement nameTextFieldInUserpage;
	@FindBy(xpath = "//input[@id='ut']")
	WebElement mailIdFieldInUserpage;
	@FindBy(xpath = "//input[@id='ph']")
	WebElement phoneNumberInUserPage;
	@FindBy(xpath = "//button[@name='Search']")
	WebElement searchButtonInListOfUsersFromUserPage;
	@FindBy(xpath="//span[@id='res']")
	WebElement errorMrssageShownInUserPage;
	
	public ManageUserPage clickOnMoreInfoButtonInuserPage() {
		moreInfoButtonInUserPage.click();
		return this;
	}
	public ManageUserPage clickOnSearchButtonInUserPage() {
		searchButtonInUserPage.click();
		return this;
	}
	public ManageUserPage enterNameInUserPage(String name) {
		nameTextFieldInUserpage.sendKeys(name);
		return this;
	}
	public ManageUserPage enterMailIdInUserPage(String mailid) {
		mailIdFieldInUserpage.sendKeys(mailid);
		return this;
	}
	public ManageUserPage enterPhoneNumberInUserPage(String phoneNumber) {
		phoneNumberInUserPage.sendKeys(phoneNumber);
		return this;
	}
	public ManageUserPage clickOnSearchButtonInListOfUsers() {
		searchButtonInListOfUsersFromUserPage.click();
		return null;
	}
	public boolean isErrorMessageDispalyedInUserPage() {
		return errorMrssageShownInUserPage.isDisplayed();
	}

}
