package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class IosPractice2  extends GenericWrappers{

	@Test
	public void runTC() {
		launchIosApp("iPhone 8", "119ACEC8-470E-48D6-ABD1-DC78D4AC70F6", "", "com.example.apple-samplecode.UICatalog", "");
		click(getWebElement(Locators.XPATH.toString(), "(//XCUIElementTypeCell)[3]"));
		click(getWebElement(Locators.NAME.toString(), "Text Entry"));
		enterValue(getWebElement(Locators.XPATH.toString(), "//XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther"), "Sriram");
		click(getWebElement(Locators.NAME.toString(), "OK"));

	}

}
