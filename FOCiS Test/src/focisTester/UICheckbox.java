package focisTester;

public class UICheckbox extends UIField {

	public UICheckbox(String inputXpath) { super(inputXpath);	}

	public Boolean get() {	return uiDriver.getCheckboxValue(inputXpath); }
	public void set(Boolean value) { uiDriver.setCheckbox(inputXpath, value); }
}