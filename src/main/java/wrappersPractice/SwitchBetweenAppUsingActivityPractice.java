package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class SwitchBetweenAppUsingActivityPractice extends GenericWrappers {

	@Test
	public void runTC() {
		launchAndroidApp("Emulator", "io.cloudgrey.the_app", "io.cloudgrey.the_app.MainActivity", "", "");
		click(getWebElement(Locators.XPATH.toString(), "//android.view.ViewGroup[@content-desc=\"Webview Demo\"]"));
		startAnAppUsingActivity("com.vodqareactnative","com.vodqareactnative.MainActivity");
		//click(getWebElement("xpath", "//android.widget.TextView[@text='LOG IN']"));
		sleep(3000);
		startAnAppUsingActivity("io.cloudgrey.the_app","io.cloudgrey.the_app.MainActivity");
		//enterValue(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "urlInput"), "https://appiumpro.com");
		sleep(3000);
		startAnAppUsingActivity("com.vodqareactnative","com.vodqareactnative.MainActivity");
		//click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "slider1"));

	}

}
