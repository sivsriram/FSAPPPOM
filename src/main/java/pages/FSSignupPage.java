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
			sleep(3000);
		} else {
			reportStep("Login button click failed", "FAIL");
		}
		return new FSLoginPage(driver,test);
		//return this;
	}

	public FSHWPage1 clickHWPM() {
		if (click(getWebElement("id", "ivHowToPlay"))) {
			reportStep("SignupScreen - HowtoPlay Main  button clicked successfully", "PASS");
		} else {
			reportStep("SignupScreen - HowtoPlay Main button click failed", "FAIL");
		}
		return new FSHWPage1(driver,test);
		//return this;
	}

	public FSGooglelinkpage clickgacct() {
		sleep(1000);
		if (click(getWebElement("xpath", "//android.widget.TextView[@text='Continue with Google']"))) {
			reportStep("Continue with Google button clicked successfully", "PASS");
			sleep(3000);
		} else {
			reportStep("Continue with Google button click failed", "FAIL");
		}
		return new FSGooglelinkpage(driver,test);
		//return this;
	}

	public FSFBLinkpage clickFBSignin() {
		sleep(1000);
		if (click(getWebElement("id", "FSFBloginbtn"))) {
			reportStep("Continue with FB button clicked successfully", "PASS");
			sleep(3000);
		} else {
			reportStep("Continue with FB button click failed", "FAIL");
		}
		return new FSFBLinkpage(driver,test);
		//return this;
	}

	
}
