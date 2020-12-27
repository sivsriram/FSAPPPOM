package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorAppRealDevice {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability("deviceName", "Lokesh Samsung Device");
		// dc.setCapability("platformName", "Android");
		// If App is not installed in device
		// dc.setCapability("app", "absolute file path");
		// If app is installed in device
		dc.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		dc.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);

		driver.findElementByXPath("(//android.widget.Button)[5]").click();
		driver.findElementByXPath("(//android.widget.Button)[9]").click();
		driver.findElementByXPath("(//android.widget.Button)[8]").click();
		driver.findElementByXPath("(//android.widget.Button)[11]").click();
		driver.findElementByXPath("(//android.widget.Button)[20]").click();
		System.out.println(driver.findElementById("com.sec.android.app.popupcalculator:id/calc_edt_formula").getText());
	}

}
