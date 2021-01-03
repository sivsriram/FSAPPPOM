package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class EnterTextChallengePractice extends GenericWrappers {
	@Test
	public void runTC() {
		launchAndroidApp("Samsung Device", "com.m.qr", ".activities.misc.QRSplashScreen", "", "");
		click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='ACCOUNT']"));
		click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='Log in / Sign up']"));
		click(getWebElement(Locators.ID.toString(), "com.m.qr:id/alert_ok_btn"));
		//enterValue(getWebElement(Locators.XPATH.toString(), "(//*[@resource-id='com.m.qr:id/edit_text'])[1]"), "Lokesh");
		enterValue(getWebElement(Locators.XPATH.toString(), "//*[@text='Enter your email address or membership number*']"), "Lokesh");
		
	}
}
