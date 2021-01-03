package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class NotificationPractice extends GenericWrappers {

	@Test
	public void runTC() {
		launchAndroidApp("Emulator", "io.cloudgrey.the_app", "io.cloudgrey.the_app.MainActivity", "", "");
		showNotificationMenu();
		sleep(5000);
		hideNotificationMenu();
	}

}
