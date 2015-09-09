package focisTester;

public class UIField {
	
	private String xpath;
	private String[] tabPaths;
	private UIField parent;
	
	private String enableEditButtonXpath;
	private String cancelEditButtonXpath;
	private String saveEditButtonXpath;
	
	// goto function that works recursively through click path to make the field visible
	public void navigateTo() {
		if (parent != null) {
			parent.navigateTo();
		} // if
	} // navigateTo
	
	public void enableEdit() {
		
	} // enableEdit
	
	public void cancelEdit() {
		
	} // cancelEdit
	
	public void saveEdit() {
		
	} // saveEdit
	
} // UIField
