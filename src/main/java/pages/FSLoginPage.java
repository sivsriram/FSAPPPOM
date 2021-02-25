package pages;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import wrappers.GenericWrappers;
import wrappers.CommonWrappers.Locators;

public class FSLoginPage extends GenericWrappers {
	
	public FSLoginPage(AppiumDriver<WebElement> driver, ExtentTest test) 
	{
		this.driver = driver;
		this.test = test;
	}


	public FSLoginPage enterEmailAddress(String email) {
		if (enterValue(getWebElement("id", "FSloginemailtxt"), email)) {
			reportStep("Email address " + email + " entered successfully", "PASS");
			sleep(3000);
	}	else {
	
			reportStep("Email address entry failed", "FAIL");
	}
		return this; 
}

	public FSLoginPage enterPassword(String pwd) {
		if (enterValue(getWebElement("id", "FSloginpwdtxt"), pwd)) {
			reportStep("Password " + pwd + " entered successfully", "PASS");
			sleep(3000);
		}else {
			reportStep("Password entry failed", "FAIL");
		}
		return this;
	}
	
	public FSSHomePage clickUPLogin() {
		if (click(getWebElement("id", "FSloginbtn"))) {
			reportStep("Login button clicked successfully", "PASS");
			sleep(5000);
			
//			 boolean DStext = false;
			
			if (eleIsDisplayed(getWebElement(Locators.ID.toString(), "com.footballnation.fantasyspin.debug:id/tv_slogan"))) {
				System.out.println("On daily spin screen");
				click(getWebElement(Locators.ID.toString(), "tv_spin_count_shadow"));
				reportStep("DAILY Spin button clicked successfully", "PASS");
				//return new FSDailyspinpage(driver,test);
			}
			else
			System.out.println("Not On daily spin screen");
//			return new FSSHomePage(driver,test);
//				try {
//				DStext=(verifyText(getWebElement(Locators.ID.toString(), "com.footballnation.fantasyspin.debug:id/tv_slogan"), "SPIN EVERYDAY TO GET FREE CHIPS!"));
//				}catch (Exception e) {
//					
//				}
//				if (DStext)
//				{
//				System.out.println("On daily spin screen");
//				click(getWebElement(Locators.ID.toString(), "tv_spin_count_shadow"));
//				reportStep("DAILY Spin button clicked successfully", "PASS");
//				//return new FSDailyspinpage(driver,test);
//				}
//				else
//					return new FSSHomePage(driver,test);
				

		} else {
			reportStep("Login button click failed", "FAIL");
		}
		//return this;
		return new FSSHomePage(driver,test);
		
	}

	public FSLoginPage clickLoginForFailure() {
		sleep(2000);
		if (click(getWebElement("id", "FSloginbtn"))) {
			reportStep("UserName or password is incorrect", "PASS");
			sleep(3000);
			reportStep("UserName or password is incorrect", "PASS");
			sleep(2000);
		} else {
			reportStep("Login button click failed", "FAIL");
		}
//		return this;
		return new FSLoginPage(driver,test);
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
