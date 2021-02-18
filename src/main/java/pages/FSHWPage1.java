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
	    int c=1;
	    reportStep("HowtoPlay 1st screen Loaded successfully", "PASS");
		if (click(getWebElement("id", "ivRight"))) {
			sleep(3000);
			reportStep("HowtoPlay 2nd screen button clicked successfully", "PASS");
		    c=c+1;			
			click(getWebElement("id", "ivRight"));
			sleep(3000);			
			reportStep("HowtoPlay 3rd screen button clicked successfully", "PASS");
			c=c+1;
			click(getWebElement("id", "ivRight"));
			sleep(3000);
			reportStep("HowtoPlay 4th screen button clicked successfully", "PASS");
			c=c+1;
			click(getWebElement("id", "ivRight"));
			sleep(3000);
			reportStep("HowtoPlay 5th screen button clicked successfully", "PASS");
			c=c+1;
			sleep(3000);
			click(getWebElement("id", "ivRight"));
			sleep(3000);
			reportStep("HowtoPlay 6th screen button clicked successfully", "PASS");
			c=c+1;
			click(getWebElement("id", "ivRight"));
			sleep(3000);
			reportStep("HowtoPlay 7th screen button clicked successfully", "PASS");
			c=c+1;
//			click(getWebElement("id", "ivRight"));
//			sleep(3000);
//			reportStep("HowtoPlay7 screen button clicked successfully", "PASS");
//			c=c+1;
//			boolean  A = false;
			System.out.println(c);
			System.out.println("How to play screen reached the last screen" );
			
//			try {
//			A=eleIsDisplayed(getWebElement("id", "ivRight"));
//			System.out.println(A);
//			} catch (Exception e) {
//			}
//			sleep(5000);
//			if (c == 7) {
////			click(getWebElement("id", "ivRight"));
//			click(getWebElement("id", "ivLeft"));
//			sleep(5000);
//			click(getWebElement("id", "button"));
//			sleep(3000);
//			reportStep("Signup button clicked successfully", "PASS");
//			sleep(3000);
//			}
//			else
//			{
//			click(getWebElement("id", "ivRight"));
//				//click(getWebElement("id", "button"));
//			}
			
		} else {
			reportStep("HowtoPlay Screen button click failed", "FAIL");
		}
		return new FSHWPage2(driver,test);
		//return this;
	}
	
}	
