package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class IosPractice1 extends GenericWrappers {

	@Test
	public void runTC() {
		launchIosApp("iPhone 8", "119ACEC8-470E-48D6-ABD1-DC78D4AC70F6", "", "com.example.apple-samplecode.UICatalog",
				"");
		click(getWebElement(Locators.XPATH.toString(), "//XCUIElementTypeCell"));
		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Okay / Cancel"));
		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Cancel"));
		click(getWebElement(Locators.NAME.toString(), "UICatalog"));
	}

}
