package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;

public class FSFBLinkpage extends GenericWrappers {

	public FSFBLinkpage(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public FSFBLinkpage enterEmailAddress(String email) {
		//System.out.println(getWebElement("xpath", "//android.widget.EditText[@resource-id='m_login_email']"));
		if(getText(getWebElement("xpath", "//android.widget.EditText[@resource-id='m_login_email']")) !="") {
			System.out.println(getText(getWebElement("xpath", "//android.widget.EditText[@resource-id='m_login_email']")));
			enterValue(getWebElement("xpath", "//android.widget.EditText[@resource-id='m_login_email']"), "");
		}
		
		if (enterValue(getWebElement("xpath", "//android.widget.EditText[@resource-id='m_login_email']"), email)) {
			sleep(5000);			
			reportStep("Email address " + email + " entered successfully", "PASS");
		}
		else
			reportStep("Email address entry failed", "FAIL");
		return this;
	}

	public FSFBLinkpage enterPassword(String pwd) {
		
		if (enterValue(getWebElement("xpath", "//android.widget.EditText[@resource-id='m_login_password']"), pwd))
			{ 
			reportStep("Password " + pwd + " entered successfully", "PASS");
			sleep(5000);
			}
			
		else
			reportStep("Password entry failed", "FAIL");
		return this;
	}



	public FSFBLinkpage clickFBLogin() {
		
		if (click(getWebElement("xpath", "//android.widget.Button[@text='Log In']"))) {
			reportStep("FB Login button clicked successfully", "PASS");
			sleep(15000);
			click(getWebElement("xpath", "//android.widget.Button[@text='Continue']"));
			sleep(15000);
			click(getWebElement("id", "FSHOMEsettingsicon"));
			sleep(15000);
		} else {
			reportStep("FB Login button click failed", "FAIL");
		}
		return new FSFBLinkpage(driver,test);
	}

	public FSFBLinkpage clickLinkAccounts() {
		if (click(getWebElement("xpath", "//android.widget.TextView[@text='Link Accounts']"))) {
			reportStep("LinkAccts button clicked successfully", "PASS");
			sleep(15000);
		} else {
			reportStep("LinkAccts button click failed", "FAIL");
		}
		return new FSFBLinkpage(driver,test);
	}
//}
	public FSFBLinkpage clickUnLinkAccounts() {
	
		if (click(getWebElement("id", "btn_unlink"))) {
			reportStep("UnLinkAccts button clicked successfully", "PASS");
			sleep(15000);
			closebrowserApp();
			sleep(15000);
		} else {
			reportStep("UnLinkAccts button click failed", "FAIL");
		}
		return new FSFBLinkpage(driver,test);
}
	
}
