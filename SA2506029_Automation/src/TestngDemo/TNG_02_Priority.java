package TestngDemo;

import org.testng.annotations.Test;

public class TNG_02_Priority {

	@Test (priority=1)
	public void setupBrowser() {
		System.out.println("Launch browser");
	}

	@Test (priority=2)
	public void setupAppURL() {
		System.out.println("Launch URL");
	}

	@Test (priority=3)
	public void registeration() {
		System.out.println("register done");
	}

	@Test (priority=4)
	public void login() {
		System.out.println("login done.....");
	}

	@Test (priority=5)
	public void CloseBrowser() {
		System.out.println("browserClose");
	}

}
