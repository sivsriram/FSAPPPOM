package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.DataInputProvider;

public class ProjectSpecificWrappers extends GenericWrappers {

	public String dataSheetName;

	@BeforeSuite
	public void bs() {
		startResult();
	}

	@BeforeClass
	public void bc() {
		startTestModule(testCaseName, testDescription);
	}

	@Parameters({ "platformName", "platformVersion", "deviceName", "udid", "appPath", "appPackage", "appActivity",
			"automationName", "chromedriverPort", "systemPort", "xcodeOrgId", "bundleId", "wdaLocalPort" })
	@BeforeMethod
	public void bm(String platformName, String platformVersion, String deviceName, String udid, String appPath,
			String appPackage, String appActivity, String automationName, int chromedriverPort, int systemPort,
			String xcodeOrgId, String bundleId, int wdaLocalPort) {
		startTestCase(testNodes);
		
	}

	@AfterMethod
	public void am() {
		closeApp();
	}

	@AfterSuite
	public void as() {
		endResult();
	}

	@DataProvider(name = "fetchData")
	public Object[][] getData() {
		return DataInputProvider.getSheet(dataSheetName);
	}

}
