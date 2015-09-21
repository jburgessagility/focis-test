package focisTester;

public class UITemplateSearch extends UIModel {

	public UIDropdown product = new UIDropdown("//*[@id='PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_drpProduct']");
	public UIDropdown productType = new UIDropdown("//*[@id='PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_drpProductType']");
	
	public UITemplateSearch(UIDriver uiDriver) {	this.uiDriver = uiDriver;	}
	
	public void createBlankJob() {
		uiDriver.click("//*[@id='PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_btnCreateBooking']");
	} // createBlankJob
	
	
}
