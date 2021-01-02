package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class VerifyAndInstallApp extends GenericWrappers {

	@Test
	public void runTC() {
		launchAndroidApp("Emulator", "com.android.contacts",
				"com.android.contacts.activities.PeopleActivity", "", "");
		verifyAndInstallApp("io.cloudgrey.the_app", System.getProperty("user.dir")+"/apps/TheApp.apk");
	}
}
