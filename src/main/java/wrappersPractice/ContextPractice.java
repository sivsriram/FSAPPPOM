package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class ContextPractice extends GenericWrappers {

	@Test
	public void runTC() {
		launchAndroidApp("Emulator", "io.cloudgrey.the_app", "io.cloudgrey.the_app.MainActivity", "", System.getProperty("user.dir")+"/apps/TheApp.apk");
		click(getWebElement(Locators.XPATH.toString(), "//android.view.ViewGroup[@content-desc=\"Webview Demo\"]"));
		enterValue(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "urlInput"), "https://appiumpro.com");
		click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='Go']"));
		printContext();
		switchWebview();
		sleep(10000);
		click(getWebElement(Locators.XPATH.toString(), "//a[@id='toggleMenu']"));
		switchNativeview();
		click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='Clear']"));
	}

}
