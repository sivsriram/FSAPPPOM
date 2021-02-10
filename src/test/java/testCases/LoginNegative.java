package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FSLoginPage;
import pages.FSSignupPage;
import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class LoginNegative extends ProjectSpecificWrappers {
	@BeforeTest
	public void bt() {
		testCaseName = "Login";
		testDescription = "Invalid Login in Fantasy Spin app";
		testNodes = "FSapp";
		dataSheetName = "TC02";
		sleep(10000);
	}


	@Test(dataProvider="fetchData")
	public void runTC(String un, String pwd) {
		new FSSignupPage(driver, test)
			.clickLogin()
			.enterEmailAddress(un)
			.enterPassword(pwd)
			.clickLoginForFailure();			


			
	}
}
