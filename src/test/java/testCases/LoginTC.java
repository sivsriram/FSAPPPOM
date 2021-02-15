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
		testCaseName = "Login as Valid User";
		testDescription = "Login Valid User Check";
		testNodes = "FSapp";
		dataSheetName = "INP1";
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
