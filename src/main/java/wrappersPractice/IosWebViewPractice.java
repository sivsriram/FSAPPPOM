package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;
import wrappers.CommonWrappers.Locators;

public class IosWebViewPractice  extends GenericWrappers{

	@Test
	public void runTC() {
		launchIosApp("iPhone 8", "119ACEC8-470E-48D6-ABD1-DC78D4AC70F6", "", "com.example.apple-samplecode.UICatalog", "");
		scrollFromDownToUpinAppUsingPointerInputUntilElementIsVisible(Locators.NAME.toString(), "Web View");
		click(getWebElement(Locators.NAME.toString(), "Web View"));
		sleep(10000);
		printContext();
		switchWebview();
		click(getWebElement(Locators.XPATH.toString(), "//li[@class='ac-gn-item ac-gn-menuicon']/a"));
		
		
		
	}

}
