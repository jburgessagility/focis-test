package focisTester;

public class UICarrierBooking {

	private UIDriver uiDriver;

	private static final String SAVE = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpCarierBookingFr_CarierBookingFr_btnSave']";
	private static final String REQUEST = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpCarierBookingFr_CarierBookingFr_btnRequested']";
	private static final String PRINT_PREVIEW = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpCarierBookingFr_CarierBookingFr_btnPreview']";
	private static final String PRINT = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpCarierBookingFr_CarierBookingFr_BtnPrint']";
	private static final String EMAIL = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpCarierBookingFr_CarierBookingFr_BtnEmailPopup']";
	private static final String AMEND = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpCarierBookingFr_CarierBookingFr_btnAmend']";
	private static final String CANCEL = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpCarierBookingFr_CarierBookingFr_btnCancel']";
	
	private static final String CLOSE_PRINT_DIALOG = "//*[@class='ui-dialog-titlebar-close']";
	
	
	//public UIStakeholder carrierBookingOffice = new UIStakeholder("//*[@id='PWCMasterPage_PWCWebPartManager_gwpCarierBookingFr_CarierBookingFr_txtCarrierName']");
	public UITextField carrierBookingOffice = new UITextField("//*[@id='PWCMasterPage_PWCWebPartManager_gwpCarierBookingFr_CarierBookingFr_txtCarrierName']");
	public UIDropdown mblTerms = new UIDropdown("//*[@id='PWCMasterPage_PWCWebPartManager_gwpCarierBookingFr_CarierBookingFr_drpMBLTerms']");
	public UITextField carrierContractNo = new UITextField("//*[@id='PWCMasterPage_PWCWebPartManager_gwpCarierBookingFr_CarierBookingFr_txtCarrierContractNo']");
	public UITextField spotRateNo = new UITextField("//*[@id='PWCMasterPage_PWCWebPartManager_gwpCarierBookingFr_CarierBookingFr_txtSpotRateNo']");
	public UITextField vessel = new UITextField("//*[@id='PWCMasterPage_PWCWebPartManager_gwpCarierBookingFr_CarierBookingFr_txtVessel']");
	public UITextField voyageNo = new UITextField("//*[@id='PWCMasterPage_PWCWebPartManager_gwpCarierBookingFr_CarierBookingFr_txtVoyageNo']");
	public UITextField feeder = new UITextField("//*[@id='PWCMasterPage_PWCWebPartManager_gwpCarierBookingFr_CarierBookingFr_txtFeeder']");
	public UITextField feederVoyageNo = new UITextField("//*[@id='PWCMasterPage_PWCWebPartManager_gwpCarierBookingFr_CarierBookingFr_txtVoyageNo1']");

	
	public UICarrierBooking(UIDriver uiDriver) { this.uiDriver = uiDriver; }
	public void save() { uiDriver.click(SAVE); }
	public void request() {	uiDriver.click(REQUEST); }
	public void print() {	uiDriver.click(PRINT); }
	public void email() { uiDriver.click(EMAIL); }
	public void printPreview() { uiDriver.click(PRINT_PREVIEW); }
	public void amend() { uiDriver.click(AMEND); }
	public void cancel() { uiDriver.click(CANCEL); }
	public void closePrintDialog() { uiDriver.click(CLOSE_PRINT_DIALOG); }
	
}
