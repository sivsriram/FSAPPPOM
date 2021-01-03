package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LeafOrgAppHybridPractice extends GenericWrappers{
	
	@Test
	public void executeTest() {
		launchAndroidApp("Samsung phone", "com.testleaf.leaforg", "com.testleaf.leaforg.MainActivity", "", "");
		switchWebview();
		enterValue(getWebElement("xpath", "//input[@placeholder='Email']"), "rajkumar@testleaf.com");
		enterValue(getWebElement("xpath", "//input[@placeholder='Password']"), "Leaf@123");
		click(getWebElement("xpath", "//button[@type='submit']"));
	}
}