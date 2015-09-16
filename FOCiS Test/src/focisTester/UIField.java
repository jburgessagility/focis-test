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
	
	public void set(Object value) { }
	public Object get() {	return null; }
	public String getLabel() { return uiDriver.getText(labelXpath);	}
	public boolean isEditable() {	return uiDriver.isEditable(inputXpath); }
	public boolean isReadOnly() {	return !isEditable(); }
	public boolean isVisible() { return uiDriver.isVisible(inputXpath); }
	public boolean isInvisible() { return !isVisible(); }
}
