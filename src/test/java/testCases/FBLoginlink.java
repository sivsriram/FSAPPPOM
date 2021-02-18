package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FSFBLinkpage;
import pages.FSLoginPage;
import pages.FSSignupPage;
import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class FBLoginlink extends ProjectSpecificWrappers {
	@BeforeTest
	public void bt() {
		testCaseName = "Continue with FaceBook User";
		testDescription = "Continue with FaceBook User checks";
		testNodes = "FSapp";
		dataSheetName = "INP3";
	}

//	@Test
//	public void runTC() {
//		new FSSignupPage(driver, test)
//		.clickFBSignin()	
//		.enterEmailAddress("qauser1dc@gmail.com")
//		.enterPassword("Admin@123")
//		.clickFBLogin();
	
		@Test(dataProvider="fetchData")
		public void runFB(String un, String pwd) {
			new FSSignupPage(driver, test)
				.clickFBSignin()
				.enterEmailAddress(un)
				.enterPassword(pwd)
				.clickFBLogin()
				.clickLinkAccounts()
				.clickUnLinkAccounts();
			
		}		
			
			

}
