package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ManageNewsPage {
	public WebDriver driver;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer'])[1]")
	WebElement moreInfoButtonInNewsPage;
	@FindBy(xpath="//a[contains(@class,'btn-danger')]//child :: i[contains(@class,'fa-edit')]")
	WebElement newButtonInManageNewsPage;
	@FindBy(xpath="//textarea[@id='news']")
	WebElement enterNewsTextArea;
	@FindBy(xpath="//button[@type='submit' and @name='create']")
	WebElement saveButtonInManageNewPage;
	@FindBy(xpath="//div[@class='col-sm-12']")
	WebElement successAlertMessageInManageNewsPage;
	
	public void navigateToManageNewsFromDashboard() {
		PageUtility pageUtility = new PageUtility();
		pageUtility.toClickButton(driver,moreInfoButtonInNewsPage);
	}
	public ManageNewsPage clickOnNewButtonToAddNewsinManagePage() {
		newButtonInManageNewsPage.click();
		return this;
	}
	public ManageNewsPage enterNewsInTheTextFiled(String textMessage) {
		enterNewsTextArea.sendKeys(textMessage);
		return this;
	}
	public ManageNewsPage clickSaveButtonInManageNewsPage() {
		PageUtility pageUtility = new PageUtility();
		pageUtility.toClickButton(driver,saveButtonInManageNewPage );
		return this;
	}
	 public boolean isAlertMessageDisplayed() {
		 boolean isALertMessageDisplayedAfterAddingNews = successAlertMessageInManageNewsPage.isDisplayed();
		 return isALertMessageDisplayedAfterAddingNews;
	 }
}
