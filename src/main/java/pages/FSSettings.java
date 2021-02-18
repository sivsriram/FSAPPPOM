package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.touch.TouchActions;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;
import wrappers.CommonWrappers.Locators;

public class FSSettings extends GenericWrappers {

	public FSSettings(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}



	public FSLinkAccts clickLinkAccounts() {
		if (click(getWebElement("xpath", "//android.widget.TextView[@text='Link Accounts']"))) {
			reportStep("LinkAccts button clicked successfully", "PASS");
			sleep(3000);
		} else {
			reportStep("LinkAccts button click failed", "FAIL");
		}
		return new FSLinkAccts(driver,test);
}
	public FSSettings clickHowtoplay() {
		if (click(getWebElement("xpath", "//android.widget.TextView[@text='How to Play']"))) {
			reportStep("How to Play button clicked successfully", "PASS");
			sleep(15000);
			reportStep("How to Play screen captured","");
			sleep(15000);
			switchToAnotherApp("com.footballnation.fantasyspin.debug");
			sleep(15000);	
						
		} else {
			reportStep("How to Play button click failed", "FAIL");
		}
		return new FSSettings(driver,test);
	}
	
	public FSSettings clickscoring() {
		if (click(getWebElement("xpath", "//android.widget.TextView[@text='Scoring']"))) {
			reportStep("Scoring button clicked successfully", "PASS");
			sleep(15000);
			reportStep("Scoring screen captured","");
			sleep(15000);		
			click(getWebElement("xpath", "//android.widget.TextView[@text='MLB BASEBALL']"));
			reportStep("Scoring Game  options screen captured","");
			sleep(15000);
			switchToAnotherApp("com.footballnation.fantasyspin.debug");
			sleep(15000);	
			click(getWebElement("id", "FSsetscrebackbtn"));
		} else {
			reportStep("Setting button click failed", "FAIL");
		}
		return new FSSettings(driver,test);
	}
	public FSSettings clickFAQS() {
		if (click(getWebElement("xpath", "//android.widget.TextView[@text='Frequently Asked Questions']"))) {
			sleep(15000);
			reportStep("FAQ button clicked successfully", "PASS");
			sleep(15000);
			reportStep("Web link screen captured successfully", "PASS");
			sleep(15000);
			switchToAnotherApp("com.footballnation.fantasyspin.debug");
			sleep(15000);
		} else {
			reportStep("Setting button click failed", "FAIL");
		}
		return new FSSettings(driver,test);
	}
	public FSSettings ClickLegal_support() {
		if (click(getWebElement("xpath", "//android.widget.TextView[@text='Legal & Support']"))) {
			reportStep("Legal & Support button clicked successfully", "PASS");
			sleep(15000);
			reportStep("Sub item screen captured successfully", "PASS");
			click(getWebElement("xpath", "//android.widget.TextView[@text='TERMS OF USE']"));
			sleep(15000);
			reportStep("Web link screen captured successfully", "PASS");
			sleep(15000);
			switchToAnotherApp("com.footballnation.fantasyspin.debug");
			sleep(15000);
			click(getWebElement("id", "FSsetLSbackbtn"));
		} else {
			reportStep("Setting button click failed", "FAIL");
		}
		return new FSSettings(driver,test);
	}
	
	public FSHowtplay_score_FAQpage ClickFeedback() {
		sleep(15000);
		scrollFromDownToUpinAppUsingPointerInput();
		if (click(getWebElement("xpath", "//android.widget.TextView[@text='Feedback']"))) {
			reportStep("Feedback button clicked successfully", "PASS");
			sleep(15000);
			switchToAnotherApp("com.footballnation.fantasyspin.debug");
		} else {
			reportStep("Feedback button click failed", "FAIL");
		}
		return new FSHowtplay_score_FAQpage(driver,test);
	}
}
