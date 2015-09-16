package focisTester;

public class UITextField extends UIField {
	
	protected UIDriver uiDriver;
	protected String groupXpath;
	protected String inputXpath;
	protected String labelXpath;
	
	public UITextField(String inputXpath) {
		super(inputXpath);
	}
	
	public void set(String text) { uiDriver.enterText(inputXpath, text); }
	public String get() {	return uiDriver.getText(inputXpath); }
	public String getLabel() { return uiDriver.getText(labelXpath);	}
	public boolean isEditable() {	return uiDriver.isEditable(inputXpath); }
	public boolean isReadOnly() {	return !uiDriver.isEditable(inputXpath); }
	
} // UIField
