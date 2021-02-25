package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;

public class FSSpinYourLineups extends GenericWrappers {

	public FSSpinYourLineups(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 

	public FSTourneyType clickNBABasketball() {
		if (click(getWebElement("xpath", "//android.widget.RelativeLayout[2]/android.widget.ImageView[@index=3]"))) {
			reportStep("NBA BaseBall button clicked successfully", "PASS");
			sleep(3000);
		} else {
			reportStep("NBA BaseBall button click failed", "FAIL");
		}
		return new FSTourneyType(driver,test);
	}
	
}
