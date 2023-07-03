package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.GeneralUtility;

public class MobileSliderPage {
	public WebDriver driver;

	public MobileSliderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-slider' and @ class='small-box-footer']")
	WebElement moreInfoButtonInMobleSliderPage;
	@FindBy(xpath = "//a[contains(@class,'btn-danger')]//child :: i[contains(@class,'fa-edit')]")
	WebElement newButtonInMobileSliderPage;
	@FindBy(xpath = "//input[@id='main_img']")
	WebElement chooseFileButtonInMobileSliderPage;
	@FindBy(xpath = "//input[@id='link']")
	WebElement linkTextFieldInSlider;	
	@FindBy(xpath = "//button[@type='submit' and @name='create']")	
	WebElement saveButtonInManagePage;
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	WebElement SucessAlertMessageInManagePage;

	public MobileSliderPage clickOnMoreInfoButtonInSliderPage() {
		moreInfoButtonInMobleSliderPage.click();
		return this;
	}
	public MobileSliderPage clickOnNewButtonInMobileSliderPage() {
		newButtonInMobileSliderPage.click();
		return this;
	}
	public MobileSliderPage clickOnChoofileButtonInMobileSliderPage() {
		
		chooseFileButtonInMobileSliderPage.sendKeys(GeneralUtility.IMAGEFILEFORMANAGEOFFERPAGE);;
		return this;
	}
	public MobileSliderPage enterLinkTextFieldInSliderPage(String link) {
		linkTextFieldInSlider.sendKeys(link);
		return this;
	}

	public MobileSliderPage clickOnSaveButtonInMobileSliderPage() {
		saveButtonInManagePage.click();
		return this;
	}

	public boolean isAlerMessagedisplayedWhenSaveTheFile() {
		return SucessAlertMessageInManagePage.isDisplayed();
	}
}
