package focisTester;

public class UIStakeholder extends UIModel {

	private static final String STAKEHOLDER_NAME_XPATH = "/descendant::input[contains(@id,'txtPartyName')]";
	private static final String STAKEHOLDER_BILL_TO_PARTY_XPATH = "/descendant::input[contains(@id,'txtBillToPartyName')]";
	private static final String STAKEHOLDER_BILLING_PARTY_XPATH = "/descendant::select[contains(@id,'grdPartyOrgComponent')]";
	private static final String STAKEHOLDER_PICKER_NAME_XPATH = "//*[@id='gs_StakeholderName']";
	
	public UIStakeholder(UIDriver uiDriver) {
		this.uiDriver = uiDriver;
	}
	
	public void set(String xpath, String stakeholder) {   
    uiDriver.clickAndWaitForElement(xpath+"/descendant::button[1]", STAKEHOLDER_PICKER_NAME_XPATH);
    uiDriver.enterText(STAKEHOLDER_PICKER_NAME_XPATH, stakeholder);
    uiDriver.clickAndWaitForText("//a[text()='"+stakeholder+"']", xpath+"/descendant::input[4]", stakeholder);
	} // setStakeholder
	
	public String getName(String xpath) {
		return uiDriver.getText(xpath+STAKEHOLDER_NAME_XPATH);
	}
	
	public String getBillToParty(String xpath) {
		return uiDriver.getText(xpath+STAKEHOLDER_BILL_TO_PARTY_XPATH);
	}
	
	public String getBillingParty(String xpath) {
		return uiDriver.getText(xpath+STAKEHOLDER_BILLING_PARTY_XPATH);
	}
	
	public String getCode(String xpath) {
		// TODO
		return "";
	}
	
}
