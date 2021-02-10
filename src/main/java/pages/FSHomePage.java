package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;

public class FSHomePage extends GenericWrappers {

	public FSHomePage(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public FSHomePage clickSettings() {
		if (click(getWebElement("xpath", "//android.widget.TextView[@text='LOG IN']"))) {
			reportStep("Login button clicked successfully", "PASS");
		} else {
			reportStep("Login button click failed", "FAIL");
		}
		return new FSHomePage(driver,test);
		//return this;
	}

	
}
