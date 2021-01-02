package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class ScrollwithWebElementUntilElementIsVisible extends GenericWrappers{

	@Test
	public void runCode() {
		launchAndroidApp("Samsung Phone","in.amazon.mShop.android.shopping", "com.amazon.mShop.splashscreen.StartupActivity","","" );
		scrollFromDownToUpinAppUsingPointerInputUntilElementIsVisible(Locators.XPATH.toString(), "//android.view.View[@text='See all deals']");
	}
	
}