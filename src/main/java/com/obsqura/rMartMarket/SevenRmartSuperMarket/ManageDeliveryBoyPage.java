package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;
import com.obsqura.utilities.WaitUtility;

public class ManageDeliveryBoyPage {
	public WebDriver driver;

	public ManageDeliveryBoyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-deliveryboy')])[2]")
	WebElement moreInfoButtonInManageDeliveryBoy;
	@FindBy(xpath = "(//a[contains(@class,'btn-rounded')])[1]")
	WebElement newButtonInDeliveryBoyPage;
	@FindBy(xpath = "//input[@id='name']")
	WebElement nameTextFieldInDeliveryBoyPage;
	@FindBy(xpath = "//input[@id='username']")
	WebElement usernameTextFieldInDeliveryBoyPage;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordTextFieldInDeliveryBoyPage;
	@FindBy(xpath  = "//button[@type='submit' and @name='create']")
	WebElement saveButtonInDelivaryBoyPage;
	@FindBy(xpath = "//button[@data-dismiss='alert']")
	WebElement alertMessageIsShownWhenDataSavedInDelivaryPage;
	
	public ManageDeliveryBoyPage clickOnMoreInfoButtonForLoadingManageDeliveryBoyPage() {
		moreInfoButtonInManageDeliveryBoy.click();
		return this;
	}
	public ManageDeliveryBoyPage clickOnNewButtonToAddDeleveryBoys() {
		
		newButtonInDeliveryBoyPage.click();
		
		return this;
	}
	public ManageDeliveryBoyPage enterNameOfDeleveryBoyInfoTextField(String name) {
		nameTextFieldInDeliveryBoyPage.sendKeys(name);
		return this;
	}
	public ManageDeliveryBoyPage enterUsernameInDeliveryInfoTextFiled(String username) {		
		usernameTextFieldInDeliveryBoyPage.sendKeys(username);		
		return this;
	}
	public ManageDeliveryBoyPage enterPasswordInDeliveryInfoTextField(String password) {
		passwordTextFieldInDeliveryBoyPage.sendKeys(password);
		return this;		
	}
	public ManageDeliveryBoyPage clickSaveButtonInDeliveryBoyPage() {
		
		WaitUtility waitUtility=new WaitUtility();
		waitUtility.waitForElementClickable(driver, saveButtonInDelivaryBoyPage);
		PageUtility pageUtility= new PageUtility();
		pageUtility.toClickButton(driver, saveButtonInDelivaryBoyPage);
		return this;
	}
	public boolean isAlertMessageDisplayedWhenSaveIsGivenInDeliveryPage() {
		return alertMessageIsShownWhenDataSavedInDelivaryPage.isDisplayed();
	}
}
