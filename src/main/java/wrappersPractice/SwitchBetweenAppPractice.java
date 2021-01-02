package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class SwitchBetweenAppPractice extends GenericWrappers {

	@Test
	public void runTC() {
		launchAndroidApp("Emulator", "io.cloudgrey.the_app", "io.cloudgrey.the_app.MainActivity", "", "");
		click(getWebElement(Locators.XPATH.toString(), "//android.view.ViewGroup[@content-desc=\"Webview Demo\"]"));
		switchToAnotherApp("com.vodqareactnative");
		click(getWebElement("xpath", "//android.widget.TextView[@text='LOG IN']"));
		switchToAnotherApp("io.cloudgrey.the_app");
		enterValue(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "urlInput"), "https://appiumpro.com");
		switchToAnotherApp("com.vodqareactnative");
		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "slider1"));

	}

}
