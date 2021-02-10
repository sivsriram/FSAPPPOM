package pages;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import wrappers.GenericWrappers;

public class FSSignupPage extends GenericWrappers {
	
	public FSSignupPage(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
//		if (!verifyText(getWebElement("xpath", "//android.widget.TextView[@text='Spin to Win Fantasy Sports!']"), "Spin to Win Fantasy Sports!"))
//		{
//			reportStep("Login Page is not displayed", "FAIL");
//			////android.widget.TextView[@text='Spin to Win Fantasy Sports!']
//			//android.widget.TextView[contains(text(),'Spin '])
//			
//		}
	}
	
	public FSLoginPage clickLogin() {
		if (click(getWebElement("xpath", "//android.widget.TextView[@text='LOG IN']"))) {
			reportStep("Login button clicked successfully", "PASS");
		} else {
			reportStep("Login button click failed", "FAIL");
		}
		return new FSLoginPage(driver,test);
		//return this;
	}



}
