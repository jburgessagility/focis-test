package focisTester;

public class UIDropdown extends UIField {

	public UIDropdown(String inputXpath) {
		super(inputXpath);
	}
	
	public String get() {	return uiDriver.getValue(inputXpath); }
	public void set(String text) { uiDriver.setDropdown(inputXpath, text); }
	public String[] getOptions() { return uiDriver.getDropdownOptions(inputXpath); }
	
}
