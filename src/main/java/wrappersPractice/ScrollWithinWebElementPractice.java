package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class ScrollWithinWebElementPractice extends GenericWrappers{

	@Test
	public void runTC() {
		launchAndroidApp("my device", "com.vodqareactnative", "com.vodqareactnative.MainActivity", "", "");
		click(getWebElement("xpath", "//android.widget.TextView[@text='LOG IN']"));
		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "slider1"));
		enterValue(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "slider"), "10");
		scrollFromLeftToRightinAppWithWebElementUsingPointerInput(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "slider"));
		scrollFromRightToLeftinAppWithWebElementUsingPointerInput(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "slider"));
	}
}
