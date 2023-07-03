package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageOrderPage {
	public WebDriver driver;
	public ManageOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "(//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-order')]) [1]")
	WebElement moreInfoButtonInManageOrderPage;
	@FindBy(xpath = "(//a[contains(@class,'btn-primary btn-sm')])[1]")
	WebElement changeDeliveryDateButtonInManageOrderPageElement;
	@FindBy(xpath = "(//div[@class='jquery-datepicker']//child::input[@name='del_up_date'])[1]")
	WebElement deliveryDateFieldInManageOrderPageElement;
	@FindBy(xpath = "(//button[contains(@class,'btn-info')])[2]")
	WebElement updateButtonDateInManageOrderPage;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement sucessAlertMessageShownInManageOrderPage;
	
	@FindBy(xpath = "(//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/Order')])[3]")
	WebElement viewButtonInManageOrderPage;
	
	public ManageOrderPage clickOnMoreInfoButtonInManageOrderPage() {
		moreInfoButtonInManageOrderPage.click();
		return this;
	}
	public ManageOrderPage clickChangeDeliveryDateButtonInManageOrderPage() {
		changeDeliveryDateButtonInManageOrderPageElement.click();
		return this;
	}
	public ManageOrderPage clickOnDeliveryDateFieldInManageOrderPage() {
		deliveryDateFieldInManageOrderPageElement.click();
		return this;
	}
	public ManageOrderPage clickOnUpdateButtonInDateFromManageOrderPage() {
		updateButtonDateInManageOrderPage.click();
		return this;		
	}
	public boolean isAlertMessageDisplayedAfertUpdateInManageOrderPage() {
		return sucessAlertMessageShownInManageOrderPage.isDisplayed();		
	}
	public void clickOnViewButtonInManageOderPageForDetailsOfEachUser() {
		viewButtonInManageOrderPage.click();
		
	}

}
