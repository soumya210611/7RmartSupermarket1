package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ManagePage {
	public WebDriver driver;
	public ManagePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='small-box-footer'])[1]")
	WebElement manageInfoButton;
	@FindBy(xpath = "(//i[contains(@class,' fa-edit')])[3]")
	WebElement editButtonInManageInfoPage;
	@FindBy(xpath = "//input[@id='title']")
	WebElement titleFromEditPageInformationInManageInfoPage;
	@FindBy(xpath = "//div[contains(@class,'note-editable')]")
	WebElement descriptionFromEditPageInManageInfoPage;
	@FindBy(xpath = "//button[@name='update']")
	WebElement updateButtonFromEditpageInManageInfoPage;
	@FindBy(xpath = "//div[contains(@class,'alert-success alert-dismissible')]")
	WebElement alertMessageDisplayedAfterEdit;
	@FindBy(xpath = "(//i[contains(@class,'fa-trash-alt')])[5]")
	WebElement deleteButtonInManageInfoPage;
	@FindBy(xpath = "//div[contains(@class,'alert-success alert-dismissible')]")
	WebElement alertMessageDisplayedWhenDeleted;

	public ManagePage clickOnMoreInfoButtonFromManagePages() {
		manageInfoButton.click();
		return this;
	}

	public ManagePage clickOnEditButtonFromInfoPage() {
		editButtonInManageInfoPage.click();
		return this;
	}

	public ManagePage enterNewTitleForEditingManageInfoPage(String titleInfo) {
		titleFromEditPageInformationInManageInfoPage.sendKeys(titleInfo);
		return this;
	}

	public ManagePage enterNewDescriptionForEditingMAnageInfoPage(String descriptionInfo) {
		descriptionFromEditPageInManageInfoPage.sendKeys(descriptionInfo);
		return this;
	}

	public ManagePage clickOnUpdateButtonInEditInfoPageInManageInfoPage() {
		updateButtonFromEditpageInManageInfoPage.click();
		return this;
	}
	public boolean isAlertMessageDispalyedWhenEditIsDoneInManagePage() {
		return alertMessageDisplayedAfterEdit.isDisplayed();
	}

	public ManagePage clickDeleteButtonInManageInfoPage() {
		deleteButtonInManageInfoPage.click();
		PageUtility pageUtility=new PageUtility();
		pageUtility.alertHandlingaccept(driver);
		return this;
	}
	public boolean isAlertMessageIsDisplayedWhenDelectButtonClickedInManagePage() {
		return alertMessageDisplayedWhenDeleted.isDisplayed();
	}
}
