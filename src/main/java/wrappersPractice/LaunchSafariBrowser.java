package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LaunchSafariBrowser extends GenericWrappers {

	@Test
	public void runTC() {
		launchSafariBrowser("iPhone", "https://www.goglobalwithtwitter.com/en", "00008020-001A656C1105002E");
		deleteSafariCookies();
		loadURL("https://www.goglobalwithtwitter.com/en");
		click(getWebElement(Locators.XPATH.toString(), "(//button[@type=\"button\"])[3]"));
		click(getWebElement(Locators.XPATH.toString(), "//a[text()='Account Set up']"));
		switchToLastWindow();
		click(getWebElement(Locators.XPATH.toString(), "//a[@data-text='Need help? Contact us']"));
	}
}
