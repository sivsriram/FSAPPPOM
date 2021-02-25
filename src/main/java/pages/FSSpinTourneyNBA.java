package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;

public class FSSpinTourneyNBA extends GenericWrappers {

	public FSSpinTourneyNBA(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 

	public FSSpinTourneyNBA clickChipandTokenTourney() {
			sleep(15000);
			click(getWebElement("id", "iv_spin"));
			reportStep("Spin screen Spin button clicked", "FAIL");		
			sleep(15000);		
			click(getWebElement("id", "FSspinprvbtn"));
			sleep(15000);		
			click(getWebElement("id", "FSLUPhomebtn"));
			sleep(15000);
			reportStep("Lineup screen Home button clicked", "FAIL");
			return new FSSpinTourneyNBA(driver,test);
	}
	
}
