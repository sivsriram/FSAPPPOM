package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;

public class FSTourneyType extends GenericWrappers {

	public FSTourneyType(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 

	public FSChooseTourneyNBA clickChipandTokenTourney() {
		if (click(getWebElement("id", "row1"))) {
			reportStep("FSChooseTourneyNBA button clicked successfully", "PASS");
			sleep(3000);
		} else {
			reportStep("FSChooseTourneyNBA button click failed", "FAIL");
		}
		return new FSChooseTourneyNBA(driver,test);
	}
	
}
