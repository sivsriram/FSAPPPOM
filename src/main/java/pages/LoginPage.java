package pages;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {

	public LoginPage(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		if (!verifyText(getWebElement("xpath", "//ion-label[contains(text(),'LeafOrg')]"), "LeafOrg")) {
			reportStep("Login Page is not displayed", "FAIL");
		}
	}

	public LoginPage enterEmailAddress(String email) {
		if (enterValue(getWebElement("xpath", "//input[@formcontrolname='email']"), email))
			reportStep("Email address " + email + " entered successfully", "PASS");
		else
			reportStep("Email address entry failed", "FAIL");
		return this;
	}

	public LoginPage enterPassword(String pwd) {
		if (enterValue(getWebElement("xpath", "//input[@formcontrolname='password']"), pwd))
			reportStep("Password " + pwd + " entered successfully", "PASS");
		else
			reportStep("Password entry failed", "FAIL");
		return this;
	}

	public LoginPage clickLoginForFailure() {
		if (click(getWebElement("xpath", "(//span[@class='button-inner'])[3]"))) {
			reportStep("Login button clicked successfully", "PASS");
		} else {
			reportStep("Login button click failed", "FAIL");
		}
		return this;
	}

	public HomePage clickLogin() {
		if (click(getWebElement("xpath", "(//span[@class='button-inner'])[3]"))) {
			reportStep("Login button clicked successfully", "PASS");
		} else {
			reportStep("Login button click failed", "FAIL");
		}
		return new HomePage(driver,test);
	}

}
