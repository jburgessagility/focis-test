package focisTester;

public class UINumericField extends UIField {

	public UINumericField(String inputXpath) { super(inputXpath); }
	
	public void set(String text) { uiDriver.enterText(inputXpath, text); }
	public String get() {	return uiDriver.getNumericText(inputXpath); }
}
