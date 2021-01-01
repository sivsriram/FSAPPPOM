package wrappers;

public class IosWrappers extends AndroidWrappers{
	
	public boolean launchIosApp(String deviceName, String udid, String xcodeOrgId, String bundleId, String app) {
		return launchApp("iOS", deviceName, udid, "", "", "XCUITest", "", "", xcodeOrgId, "iPhone Developer", bundleId, app, "", "");
	}

	public boolean launchIosAppInParallel(String deviceName, String udid, String xcodeOrgId, String bundleId, String app, String wdaLocalPort) {
		return launchApp("iOS", deviceName, udid, "", "", "XCUITest", "", "", xcodeOrgId, "iPhone Developer", bundleId, app, "", wdaLocalPort);
	}
	
	public boolean launchSafariBrowser(String deviceName, String URL) {
		return launchBrowser("iOS", "Safari", deviceName, URL, "", "", "");
	}
	
	public boolean launchSafariBrowserInParallel(String deviceName, String URL, String udid, String wdaLocalPort ) {
		return launchBrowser("iOS", "Safari", deviceName, URL, udid, "", wdaLocalPort);
	}
	
}
