package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FSLoginPage;
import pages.FSSignupPage;
import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class LoginTC extends ProjectSpecificWrappers {
	@BeforeTest
	public void bt() {
		testCaseName = "Login";
		testDescription = "Login in Fantasy Spin app";
		testNodes = "FSapp";
		dataSheetName = "TC01";
	}


	@Test(dataProvider="fetchData")
	public void runTC(String un, String pwd) {
		new FSSignupPage(driver, test)
			.clickLogin()
			.enterEmailAddress(un)
			.enterPassword(pwd)
			.clickLogin()			
			.clickSettings()
			.clickLinkAccounts()
			.clickUnLinkAccounts();
			
	}

}
