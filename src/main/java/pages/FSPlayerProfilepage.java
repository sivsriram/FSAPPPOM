package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;

public class FSPlayerProfilepage extends GenericWrappers {

	public FSPlayerProfilepage(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 

	public FSPlayerProfilepage clickEditbtn() {
		if (click(getWebElement("id", "FSPPeditbtn"))) {
			reportStep("Edit button clicked successfully", "PASS");
			sleep(3000);
		} else {
			reportStep("Edit button click failed", "FAIL");
		}
		return new FSPlayerProfilepage(driver,test);
	}
	public FSPlayerProfilepage clickeditavatar() {
		click(getWebElement("id", "iv_edit_avatar"));
		reportStep("Avatatr Edit button clicked successfully", "PASS");
		sleep(10000);
		if (click(getWebElement("xpath", "//android.widget.LinearLayout[2]"))) {
			reportStep("Selected Avatar image clicked successfully", "PASS");
			sleep(10000);
			reportStep("Selected Avatar image changed successfully", "PASS");
			sleep(10000);
			click(getWebElement("id", "iv_dlg_close"));
			sleep(10000);
			click(getWebElement("id", "FSPPeditbtn"));
			sleep(10000);
		} else {
			reportStep("Setting button click failed", "FAIL");
		}
		return new FSPlayerProfilepage(driver,test);
	}

//	public FSPlayerProfilepage clickModifyUsername() {
//		click(getWebElement("id", "FSPPusername"));
//		reportStep("Username Edit button clicked successfully", "PASS");
//		sleep(10000);
//		getWebElement("id", "FSPPusername").sendKeys("one");
////		String NUN = getText(getWebElement("id", "FSPPusername"));
////		enterValue(getWebElement("id", "FSPPusername"), NUN+"1");
////		if (click(getWebElement("id", "FSPPusername"))) {
////			reportStep("Username Edit button clicked successfully", "PASS");
////			sleep(10000);
////			String NUN = getText(getWebElement("id", "FSPPusername"));
////			System.out.println(getText(getWebElement("id", "FSPPusername")));
////			System.out.println(NUN);
//			sleep(10000);
////			enterValue(getWebElement("id", "FSPPusername"), NUN+"1");
////			System.out.println(NUN+"1");
//			sleep(10000);
//			reportStep("User name changed successfully", "PASS");
//			sleep(10000);
////			reportStep("Selected Avatar image changed successfully", "PASS");
//			sleep(10000);
//			click(getWebElement("id", "iv_dlg_close"));
//			sleep(10000);
//			click(getWebElement("id", "FSPPeditbtn"));
//			sleep(10000);
//
//
//		return new FSPlayerProfilepage(driver,test);
//	}
}
