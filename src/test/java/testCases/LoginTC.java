package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class LoginTC extends ProjectSpecificWrappers {
	@BeforeTest
	public void bt() {
		testCaseName = "Login";
		testDescription = "Login in LeafOrg app";
		testNodes = "Login";
		dataSheetName = "TC01";
	}

	@Test(dataProvider="fetchData")
	public void runTC(String un, String pwd) {
		new LoginPage(driver,test)
			.enterEmailAddress(un)
			.enterPassword(pwd)
			.clickLogin();
	}
}
