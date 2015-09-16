package focisTester;

public class UIUser extends UIModel {
	
	private static final String USERNAME_XPATH = "//*[@id='Login1_UserName']";
	private static final String PASSWORD_XPATH = "//*[@id='Login1_Password']";
	private static final String LOGIN_XPATH = "//*[@id='Login1_LoginButton']";
	
	public void login(String username, String password) {
		uiDriver.navigateTo(FOCiSTester.getURL());
		uiDriver.enterText(USERNAME_XPATH, username);
		uiDriver.enterText(PASSWORD_XPATH, password);
		uiDriver.click(LOGIN_XPATH);
	}
	
	public void logout() {
		
	}

}
