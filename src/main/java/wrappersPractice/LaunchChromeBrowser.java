package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LaunchChromeBrowser extends GenericWrappers{

	@Test
	public void runTC() {
		launchChromeBrowser("Emulator", "https://www.amazon.in/");
		printContext();
		switchNativeview();
		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Close"));
		switchContext("CHROMIUM");
		//enterValue(getWebElement(Locators.NAME.toString(), "k"), "Toys");
		enterValue(getWebElement(Locators.XPATH.toString(), "//input[@name='k']"), "Toys");
		pressEnter();
	}
}
