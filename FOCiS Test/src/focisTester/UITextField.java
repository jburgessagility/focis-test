package focisTester;

public class UITextField extends UIField {
	
	public UITextField(String inputXpath) {
		super(inputXpath);
	}
	
	public void set(String text) { uiDriver.enterText(inputXpath, text); }
	public String get() {	return uiDriver.getText(inputXpath); }
	
} // UIField
