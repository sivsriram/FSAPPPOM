package pages;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import wrappers.GenericWrappers;

public class FSLoginPage extends GenericWrappers {
	
	public FSLoginPage(AppiumDriver<WebElement> driver, ExtentTest test) 
	{
		this.driver = driver;
		this.test = test;
	}


	public FSLoginPage enterEmailAddress(String email) {
		if (enterValue(getWebElement("id", "FSloginemailtxt"), email))
			reportStep("Email address " + email + " entered successfully", "PASS");
		else
			reportStep("Email address entry failed", "FAIL");
		return this;
	}

	public FSLoginPage enterPassword(String pwd) {
		if (enterValue(getWebElement("id", "FSloginpwdtxt"), pwd))
			reportStep("Password " + pwd + " entered successfully", "PASS");
		else
			reportStep("Password entry failed", "FAIL");
		return this;
	}
	
	public FSSHomePage clickLogin() {
		if (click(getWebElement("id", "FSloginbtn"))) {
			reportStep("Login button clicked successfully", "PASS");
			sleep(3000);
		} else {
			reportStep("Login button click failed", "FAIL");
		}
		//return this;
		return new FSSHomePage(driver,test);
		
	}

	public FSLoginPage clickLoginForFailure() {
		if (click(getWebElement("id", "FSloginbtn"))) {
			reportStep("UserName or password is incorrect", "PASS");
			sleep(20000);
		} else {
			reportStep("Login button click failed", "FAIL");
		}
		return this;
	}
//
//	public HomePage clickLogin() {
//		if (click(getWebElement("xpath", "(//span[@class='button-inner'])[3]"))) {
//			reportStep("Login button clicked successfully", "PASS");
//		} else {
//			reportStep("Login button click failed", "FAIL");
//		}
//		return new HomePage(driver,test);
//	}

}
