package workflowRunner;

public class UIStakeholder extends UIModel {

	private static final String STAKEHOLDER_PICKER_NAME_XPATH = "//*[@id='gs_StakeholderName']";
	
	public void set(String xpath, String stakeholder) {   
    uiDriver.clickAndWaitForElement(xpath+"/descendant::button[1]", STAKEHOLDER_PICKER_NAME_XPATH);
    uiDriver.enterText(STAKEHOLDER_PICKER_NAME_XPATH, stakeholder);
    uiDriver.clickAndWaitForText("//a[text()='"+stakeholder+"']", xpath+"/descendant::input[4]", stakeholder);
	} // setStakeholder
	
}
