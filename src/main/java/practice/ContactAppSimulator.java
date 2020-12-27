package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ContactAppSimulator {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("avd", "Pixel_4_API_30");
		dc.setCapability("deviceName", "Lokesh Device");
		// dc.setCapability("platformName", "Android");
		// If App is not installed in device
		// dc.setCapability("app", "absolute file path");
		// If app is installed in device
		dc.setCapability("appPackage", "com.android.contacts");
		dc.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
	}
}
