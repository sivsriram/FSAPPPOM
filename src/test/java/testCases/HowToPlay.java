package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FSLoginPage;
import pages.FSSignupPage;
import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class HowToPlay extends ProjectSpecificWrappers {
	@BeforeTest
	public void bt() {
		testCaseName = "Login";
		testDescription = "Login in Fantasy Spin app";
		testNodes = "FSapp";
		dataSheetName = "TC01";
	}


	@Test
	public void runTC() {
		new FSSignupPage(driver, test)
			.clickHWPM()
			.clickHWP1();
			
			
			
//			.enterEmailAddress(un)
//			.enterPassword(pwd)
//			.clickLogin()			
//			.clickSettings()
//			.clickLinkAccounts()
//			.clickUnLinkAccounts();
//			
	}

}
