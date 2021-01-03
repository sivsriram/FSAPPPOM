package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LeafOrgAppNativeHybridPractice extends GenericWrappers{
	
	@Test
	public void executeTest() {
		launchAndroidApp("Samsung phone", "com.testleaf.leaforg", "com.testleaf.leaforg.MainActivity", "", "");
		switchWebview();
		enterValue(getWebElement("xpath", "//input[@placeholder='Email']"), "rajkumar@testleaf.com");
		enterValue(getWebElement("xpath", "//input[@placeholder='Password']"), "Leaf@123");
		switchNativeview();
		click(getWebElement("xpath", "//android.widget.Button"));
	}
}