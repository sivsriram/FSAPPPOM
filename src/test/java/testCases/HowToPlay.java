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
		testCaseName = "How to Play checks";
		testDescription = "How to Play screens";
		testNodes = "FSapp";
		dataSheetName = "INP1";
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
