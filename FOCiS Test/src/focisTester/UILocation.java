package focisTester;

public class UILocation extends UIField {
	
	private UITextField code;
	private UITextField name;
	
	private String codeXpath;
	private String nameXpath;
	
	public UILocation(String inputXpath) { 
		super(inputXpath);
		codeXpath = inputXpath;
		nameXpath = groupXpath + "/descendant::input[2]";
		code = new UITextField(codeXpath);
		name = new UITextField(nameXpath);
	} // UILocation

	public String getCode() {	return code.get(); }
	public String getName() {	return name.get(); }
	
	public void setByCode(String code) {
		this.code.set(code);
		uiDriver.pressTab(inputXpath);
	} // setByCode
	
	public void setByName(String name) { 
		this.name.set(name);
		uiDriver.pressTab(nameXpath);
	} // setByName
	
	// Set by picker...
	
} // UILocation