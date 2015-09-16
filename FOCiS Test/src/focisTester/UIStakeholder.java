package focisTester;

public class UIStakeholder extends UIField {
	
	private UITextField name;
	private UITextField address;
	private UITextField contact;
	
	private String nameXpath;
	private String addressXpath;
	private String contactXpath;
	
	public UIStakeholder(String inputXpath) { 
		super(inputXpath);
		nameXpath = inputXpath;
		addressXpath = groupXpath + "/descendant::input[2]";
		contactXpath = groupXpath + "/descendant::input[3]";
		name = new UITextField(nameXpath);
		address = new UITextField(addressXpath);
		contact = new UITextField(contactXpath);
	} // UIStakeholder

	public String getName() {	return name.get(); }
	public String getAddress() {	return address.get(); }
	public String getContact() {	return contact.get(); }
	
	public void setByName(String name) { 
		this.name.set(name);
		uiDriver.pressTab(nameXpath);
	} // setByName
	
} // UIStakeholder