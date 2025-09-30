package pages;

import coreFunctions.webDriverLibrary;

public class loginPage extends webDriverLibrary {

	String username_xpath = "//*[@id='form']/div/div/div[1]/div/form/input[2]";
	String password_xpath = "//*[@id='form']/div/div/div[1]/div/form/input[3]";
	String loginButton_xpath = "//*[@id='form']/div/div/div[1]/div/form/button";

	public void openApplication(String url) {

		urlNavigation(url);
	}

	public void loginIntoApplication(String username, String password) {
		enterTextInToField(username_xpath, username);
		enterTextInToField(password_xpath, password);
		clickOnElement(loginButton_xpath);
	}

	public void navigateUserToLoginPage(String expectedTitle) {
		verifyPageTitle(expectedTitle);
	}
}
