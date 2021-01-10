package wrappersPractice;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LaunchIosUiCatlogApp extends GenericWrappers{
	
	@Test
	public void runTC() {
		launchIosApp("iPhone", "00008020-001A656C1105002E", "GJZCQ6TB82", "com.example.apple-samplecode.UICatalog", "");
//		click(getWebElement(Locators.XPATH.toString(), "(//XCUIElementTypeCell)[1]"));
//		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Okay / Cancel"));
//		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "OK"));
//		click(getWebElement(Locators.NAME.toString(), "UICatalog"));
		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Date Picker"));
		List<WebElement> picker = driver.findElementsByXPath("//XCUIElementTypePickerWheel");
		chooseNextOptionInPickerWheel(picker.get(0));
		choosePreviousOptionInPickerWheel(picker.get(0));
		picker.get(0).sendKeys("Jan 13");
		picker.get(1).sendKeys("5");
		picker.get(2).sendKeys("34");
		picker.get(3).sendKeys("PM");


	}

}
