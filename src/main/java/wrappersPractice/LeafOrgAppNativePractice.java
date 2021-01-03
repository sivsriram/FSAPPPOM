package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LeafOrgAppNativePractice extends GenericWrappers{
	
	@Test
	public void executeTest() {
		launchAndroidApp("Android phone", "com.testleaf.leaforg", "com.testleaf.leaforg.MainActivity", "", "");
		printContext();
		enterValue(getWebElement("xpath", "(//android.widget.EditText)[1]"), "rajkumar@testleaf.com");
		enterValue(getWebElement("xpath", "(//android.widget.EditText)[2]"), "Leaf@123");
		click(getWebElement("xpath", "//android.widget.Button"));
	}

}