package practice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class CalculatorApp extends GenericWrappers {

	@Test
	public void TC() {
		launchAndroidApp("deviceName", "com.sec.android.app.popupcalculator",
				"com.sec.android.app.popupcalculator.Calculator", "", "");
		click(getWebElement("xpath", "(//android.widget.Button)[5]"));
		click(getWebElement(Locators.XPATH.toString(), "(//android.widget.Button)[9]"));
		click(getWebElement(Locators.XPATH.toString(), "(//android.widget.Button)[8]"));
		click(getWebElement(Locators.XPATH.toString(), "(//android.widget.Button)[11]"));
		click(getWebElement(Locators.XPATH.toString(), "(//android.widget.Button)[20]"));
		String text = getText(
				getWebElement(Locators.ID.toString(), "com.sec.android.app.popupcalculator:id/calc_edt_formula"));
		System.out.println(text);

	}

}
