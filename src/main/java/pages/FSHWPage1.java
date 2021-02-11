package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;

public class FSHWPage1 extends GenericWrappers {

	public FSHWPage1(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public FSHWPage2 clickHWP1() {
		if (click(getWebElement("id", "ivRight"))) {
			reportStep("HowtoPlay1 screen button clicked successfully", "PASS");
		     int c=1;
			sleep(3000);
			click(getWebElement("id", "ivRight"));
			reportStep("HowtoPlay2 screen button clicked successfully", "PASS");
			c=c+1;
			sleep(3000);
			click(getWebElement("id", "ivRight"));
			reportStep("HowtoPlay3 screen button clicked successfully", "PASS");
			c=c+1;
			sleep(3000);
			reportStep("HowtoPlay4 screen button clicked successfully", "PASS");
			c=c+1;
			sleep(3000);
			click(getWebElement("id", "ivRight"));
			reportStep("HowtoPlay5 screen button clicked successfully", "PASS");
			c=c+1;
			sleep(3000);
			click(getWebElement("id", "ivRight"));
			reportStep("HowtoPlay6 screen button clicked successfully", "PASS");
			c=c+1;
			sleep(3000);
			click(getWebElement("id", "ivRight"));
			reportStep("HowtoPlay7 screen button clicked successfully", "PASS");
			c=c+1;
//			boolean  A = false;
			System.out.println(c);
//			try {
//			A=eleIsDisplayed(getWebElement("id", "ivRight"));
//			System.out.println(A);
//			} catch (Exception e) {
//			}
//			sleep(3000);
			if (c == 7) {
//			click(getWebElement("id", "ivRight"));
			click(getWebElement("id", "ivLeft"));
			sleep(3000);
			click(getWebElement("id", "FSSignupbtn"));
			}
			else
			{
			click(getWebElement("id", "ivRight"));
				//click(getWebElement("id", "button"));
			}
			
		} else {
			reportStep("HowtoPlay1 Screen button click failed", "FAIL");
		}
		return new FSHWPage2(driver,test);
		//return this;
	}
	
}	
