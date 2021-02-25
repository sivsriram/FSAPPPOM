package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;

public class FSChooseTourneyNBA extends GenericWrappers {

	public FSChooseTourneyNBA(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 

	public FSSpinTourneyNBA clickChipandTokenTourney() {
		sleep(15000);
		System.out.println("Alert pop up message");
		click(getWebElement("id", "iv_dlg_close"));
		sleep(15000);
		scrollFromDownToUpinAppUsingPointerInput();
		sleep(10000);
		reportStep("Spin screen 1K Display ", "PASS");
		click(getWebElement("xpath", "//android.widget.TextView[@text='1K']"));
		reportStep("1K tourney button clicked  successfully", "PASS");
		sleep(10000);
		return new FSSpinTourneyNBA(driver,test);


			
	}
		
		
	}
	

