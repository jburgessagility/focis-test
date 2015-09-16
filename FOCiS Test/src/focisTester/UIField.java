package focisTester;

public class UIField {
	
	protected UIDriver uiDriver;
	protected String groupXpath;
	protected String inputXpath;
	protected String labelXpath;
	
	public UIField(String inputXpath) {
		uiDriver = FOCiSTester.uiDriver2;
		this.inputXpath = inputXpath;
		groupXpath = inputXpath + "/ancestor::*[contains(@class,'control-group')]";
		labelXpath = groupXpath + "/descendant::span";
	}
	
	public void set(String text) { uiDriver.enterText(inputXpath, text); }
	public String get() {	return uiDriver.getText(inputXpath); }
	public String getLabel() { return uiDriver.getText(labelXpath);	}
	public boolean isEditable() {	return uiDriver.isEditable(inputXpath); }
	public boolean isReadOnly() {	return !uiDriver.isEditable(inputXpath); }
	
} // UIField
