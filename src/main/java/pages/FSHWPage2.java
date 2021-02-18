package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;

public class FSHWPage2 extends GenericWrappers {

	public FSHWPage2(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public FSHWPage2 clickSettings() { 
		if (click(getWebElement("xpath", "//android.widget.TextView[@text='LOG IN']"))) {
			reportStep("Login button clicked successfully", "PASS");
			//click(getWebElement("xpath", "//android.widget.TextView[@text='LOG IN']"));
		} else {
			reportStep("Login button click failed", "FAIL");
		}
		return new FSHWPage2(driver,test);
		//return this;
	}

	
}
