package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FSLoginPage;
import pages.FSSignupPage;
import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class GoogleAcctLink extends ProjectSpecificWrappers {
	@BeforeTest
	public void bt() {
		testCaseName = "Continue with Google User";
		testDescription = "Continue with Google User Checks";
		testNodes = "FSapp";
		dataSheetName = "INP1";
	}


	@Test
	public void runTC() {
		new FSSignupPage(driver, test)
			.clickgacct()
			.clickGAccount()
			.clickLinkAccounts()
			.clickUnLinkAccounts();

//	@Test(dataProvider="fetchData")
//	public void runTC(String un, String pwd) {
//		new FSSignupPage(driver, test)
//			.clickLogin()
//			.enterEmailAddress(un)
//			.enterPassword(pwd)
//			.clickLogin()			
//			.clickSettings()
//			.clickLinkAccounts()
//			.clickUnLinkAccounts();
//			
	}

}
