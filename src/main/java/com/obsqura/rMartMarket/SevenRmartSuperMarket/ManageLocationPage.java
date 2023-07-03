package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.ExcelUtility;
import com.obsqura.utilities.PageUtility;
import com.obsqura.utilities.RandomDataUtility;

public class ManageLocationPage {
	public WebDriver driver;

	public ManageLocationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-location')])[2]")
	WebElement moreInfoButtonInLocationPage;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newButtonInLocationPage;
	@FindBy(xpath = "//select[@name='country_id']")
	WebElement selectCountryInLocationPage;
	
	@FindBy(xpath="//select[@name='state_id']")
	WebElement selectStateFromLocation;
	@FindBy(xpath = "//input[@name='location']")
	WebElement selectLocationForLocationPagElement;
	
	@FindBy(xpath = "//input[@name='delivery']")
	WebElement deliveryChargeInLocation;
	@FindBy(xpath = "//button[@name='create']")
	WebElement saveButtonInLocationPage;
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	WebElement sucessMessageInLocationPage;
	
	public ManageLocationPage clickMoreInfoLocationPage() {
		moreInfoButtonInLocationPage.click();
		return this;
	}
	public ManageLocationPage clickOnNewBottonInLocationPage() {
		newButtonInLocationPage.click();
		return this;
	}
	public ManageLocationPage clickOnCountryToSelectInLocationPage(String value) {
		selectCountryInLocationPage.click();	
		PageUtility pageUtility=new PageUtility();
		pageUtility.selectDropdownbyText(selectCountryInLocationPage, value);
		return this;
	}
	public ManageLocationPage clickOnStateToSelectInLocationPage(String states) {
		selectStateFromLocation.click();	
		PageUtility pageUtility=new PageUtility();
		pageUtility.selectDropdownbyText(selectStateFromLocation, states);
		return this;		
	}
	public ManageLocationPage enterLocationInLocationPage(String location) {
		selectLocationForLocationPagElement.sendKeys(location);
		return this;
	}
	public ManageLocationPage enterDeliveryChargeInLocationPage(String charge) {
		deliveryChargeInLocation.sendKeys(charge);
		return this;
	}
	public void ClickOnSaveButtonInLocationPage() {
		saveButtonInLocationPage.click();
	}
	public boolean isAlertMessageDispalyedInLocationPage() {
		return sucessMessageInLocationPage.isDisplayed();
	}

}
