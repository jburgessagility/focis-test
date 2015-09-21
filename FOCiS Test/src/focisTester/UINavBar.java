package focisTester;

public class UINavBar extends UIModel {
	public UINavBar(UIDriver uiDriver) {	this.uiDriver = uiDriver;	}
	
	public void open(String menu1) { open(menu1, null, null); }
	public void open(String menu1, String menu2) { open(menu1, menu2, null); }
	public void open(String menu1, String menu2, String menu3) {
		uiDriver.click("//span[text()='"+menu1+"']");
		if (menu2 != null) { uiDriver.click("//span[text()='"+menu2+"']"); }
		if (menu3 != null) { uiDriver.click("//span[text()='"+menu3+"']"); }
	} // open
	
} // UINavBar
