package com.obsqura.rMartMarket.SevenRmartSuperMarket;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.obsqura.utilities.GeneralUtility;
import com.obsqura.utilities.ScreenShotUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	public Properties prop;
	FileInputStream fs;
	public ScreenShotUtility scrshot;

	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void initilizeBrowser(String browser) throws Exception {
		
			try 
			{
				prop = new Properties();
				fs = new FileInputStream(GeneralUtility.CONFIGfILE);
				prop.load(fs);
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
		if (browser.equalsIgnoreCase("firefox")) {
			driver = WebDriverManager.firefoxdriver().create();
		} else if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(chromeOptions);
		}

		else if (browser.equalsIgnoreCase("edge")) {

			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(edgeOptions);
		} else {
			throw new Exception("Browser is not correct");
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void browserQuit(ITestResult iTestResult) throws Exception {

		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			scrshot = new ScreenShotUtility();
			scrshot.getScreenShot(driver, iTestResult.getName());
		}
		driver.quit();
	}
}
