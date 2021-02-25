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

	public FSDailyspinpage clickLogin() {
		if (click(getWebElement("xpath", "(//span[@class='button-inner'])[3]"))) {
			reportStep("Login button clicked successfully", "PASS");
			sleep(5000);
			 boolean DStext = false;
				try {
				DStext=(verifyText(getWebElement(Locators.ID.toString(), "com.footballnation.fantasyspin.debug:id/tv_slogan"), "SPIN EVERYDAY TO GET FREE CHIPS!"));
				}catch (Exception e) {
					
				}
				if (DStext)
				{
				System.out.println("On daily spin screen");
				click(getWebElement(Locators.ID.toString(), "tv_spin_count_shadow"));
				//reportStep("Spin button clicked successfully", "PASS");
				return new FSDailyspinpage(driver,test);
				
				}
				
				else {
					reportStep("Moved to Home screen", "FAIL");
					return new FSDailyspinpage(driver,test);
				}
					
		} else {
			reportStep("Moved to Home screen", "FAIL");
			
		}
		return new FSDailyspinpage(driver,test);
	}



public FSDailyspinpage verification() {
    sleep(500);
    boolean DStext = false;
	try {
		DStext=(verifyText(getWebElement(Locators.ID.toString(), "com.footballnation.fantasyspin.debug:id/tv_slogan"), "SPIN EVERYDAY TO GET FREE CHIPS!"));
	}catch (Exception e) {
		
	}
	if (DStext)
	{
	System.out.println("On daily spin screen");
	//click(getWebElement(Locators.ID.toString(), "tv_spin_count_shadow"));
	reportStep("Spin button clicked successfully", "PASS");
	
	}
	return new FSDailyspinpage(driver,test);
}
}