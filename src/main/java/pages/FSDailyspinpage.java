package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;

public class FSDailyspinpage extends GenericWrappers {

	public FSDailyspinpage(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 

	public FSSHomePage clickDailySpin() {
		if (click(getWebElement("id", "tv_spin_count_shadow"))) {
			reportStep("Daily Spin button clicked successfully", "PASS");
			sleep(3000);
		} else {
			reportStep("Daily Spin button click failed", "FAIL");
		}
		return new FSSHomePage(driver,test);
	}
	public FSSettings clickSettings() {
		if (click(getWebElement("id", "FSHOMEsettingsicon"))) {
			reportStep("Setting button clicked successfully", "PASS");
			sleep(3000);
		} else {
			reportStep("Setting button click failed", "FAIL");
		}
		return new FSSettings(driver,test);
	}

//	public FSSHomePage clickLinkAccounts() {
//		if (click(getWebElement("xpath", "//android.widget.TextView[@text='Link Accounts']"))) {
//			reportStep("LinkAccts button clicked successfully", "PASS");
//			sleep(3000);
//		} else {
//			reportStep("LinkAccts button click failed", "FAIL");
//		}
//		return new FSSHomePage(driver,test);
//}
//	public FSSHomePage clickUnLinkAccounts() {
//		if (click(getWebElement("id", "//android.widget.TextView[@text='UNLINK']"))) {
//			reportStep("UnLinkAccts button clicked successfully", "PASS");
//			sleep(3000);
//		} else {
//			reportStep("UnLinkAccts button click failed", "FAIL");
//		}
//		return new FSSHomePage(driver,test);
//}
}
