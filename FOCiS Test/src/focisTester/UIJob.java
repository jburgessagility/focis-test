package focisTester;

public class UIJob extends UIModel {
	
	private static final String MAIN_LABEL = "Main";
	private static final String CARGO_LABEL = "Cargo";
	private static final String MOVEMENT_LABEL = "Movement";
	private static final String SERVICES_LABEL = "Services";
	private static final String EVENTS_LABEL = "Events";
	
	private static final String MAIN_TAB_XPATH = "//*[@id='LiParties']";
	private static final String CARGO_TAB_XPATH = "//*[@id='LiCargoDetails']/a";
	private static final String MOVEMENT_TAB_XPATH = "//*[@id='LiRouting']";
	private static final String SERVICES_TAB_XPATH = "//*[@id='LiServices']";
	private static final String EVENTS_TAB_XPATH = "//*[@id='LiEvents']";
	
	private static final String CREATE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnCreate']";
	private static final String PRECONFIRM_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnPreConfirm']";
	
	private static final String JOB_HEADER_COLLAPSER_XPATH = "//*[@id='divHeaderExpandOrColl']/span/i";
	private static final String PLACE_OF_RECEIPT_CODE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAglPlcOfRecCode']";
	private static final String PLACE_OF_DELIVERY_CODE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAglPlcOfDelCode']";
	private static final String ORIGIN_BRANCH_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtOrgBranchCode']";
	private static final String DESTINATION_BRANCH_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtDestBranchCode']";
	private static final String PORT_OF_LOADING_XPATH ="//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtPOLCode']";
	private static final String PORT_OF_DISCHARGE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtPODCode']";
	
	private static final String PARTIES_COLLAPSER_XPATH = "//*[@id='divPartyExpandOrColl']/span/i";
	private static final String ADD_PARTIES_XPATH = "//*[@id='btnAddParties']";
	private static final String SHIPPER_XPATH = "//*[@id='1_PartyRow']";
	private static final String CONSIGNEE_XPATH = "//*[@id='2_PartyRow']";
	private static final String NOTIFY_PARTY_XPATH = "//*[@id='3_PartyRow']";
	private static final String THIRD_PARTY_XPATH = "//*[@id='4_PartyRow']";
	private static final String SHIPPER_MOVEMENT_XPATH = "//*[@id='1_PartyRow']/descendant::select[1]";
	private static final String CONSIGNEE_MOVEMENT_XPATH = "//*[@id='2_PartyRow']/descendant::select[1]";
	private static final String THIRD_PARTY_MOVEMENT_XPATH = "//*[@id='4_PartyRow']/descendant::select[1]";
	
	private static final String LINKS_COLLAPSER_XPATH = "//*[@id='divLinksExpandOrColl']/span/i";

	private static final String CUSTOMER_REQUIREMENTS_COLLAPSER_XPATH = "//*[@id='divCustReqExpandOrColl']/span/i";
	private static final String INVOICE_VALUE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtInvoiceValue']";
	private static final String INVOICE_CURRENCY_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtInvoiceCurrencyCode']";
	private static final String CARGO_AVAILABLE_DATE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtCargoAvailableDate']";
	private static final String VOLUMETRIC_RATIO_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtVolumetricRatio']";
	private static final String NUMBER_OF_EURO_PALLETS_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtNoOfEuroPallets']";
	
	private static final String PACKAGES_CARGO_TAB_XPATH = "//*[@href='#PackageDetailsTab']";
	private static final String UNITS_CARGO_TAB_XPATH = "//*[@href='#UnitDetailsTab']";
	private static final String TREE_VIEW_CARGO_TAB_XPATH = "//*[@href='#TreeViewTab']";
	
	private static final String UNIT_DETAILS_GRID_XPATH = "//table[@id='UnitDetailsListGrid']";
	private static final String ADD_UNITS_XPATH = "//*[@data-original-title='Add / View Units']";
	private static final String SAVE_UNITS_XPATH = "//*[@data-original-title='Save Unit']";
	
	private static final String UNITS_REQUESTED_XPATH = "//input[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_ItemHierarchyMain1_UnitDetailsFr1_txtDummyUnitNoOfRequest']";
	private static final String ADD_UNITS_DIALOG_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_ItemHierarchyMain1_UnitDetailsFr1_btnAddUnitDetails']";
	private static final String CONTINUE_DIALOG_XPATH = "//*[@id='btnUnitContinue']";
	
	private static final String PLAN_ROUTE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnAddRoute']";
	private static final String PLAN_ROUTE_IFRAME_XPATH = "//*[contains(@id,'fancybox-frame')]";
	private static final String PLAN_ROUTE_CLOSE_XPATH = "//*[contains(@class,'fancybox-close')]";
	private static final String PLAN_ROUTE_FIRST_SCHEDULE_XPATH = "//*[@id='rdbSupplierGridMain_1']";
	private static final String PLAN_ROUTE_APPLY_MAIN_CARRIAGE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpRouteSearchFr1_RouteSearchFr1_btnApplyMainCarr']";
	private static final String PLAN_ROUTE_SAVE_MAIN_CARRIAGE_XPATH = "//*[@id='btnSaveVesselMainCarriage']";
//	private static final String CREATE_MAIN_CARRIAGE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpRouteSearchFr1_RouteSearchFr1_btnCreateMainCarr']";
//	private static final String CREATE_MAIN_CARRIAGE_PORT_OF_LOADING_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpRouteSearchFr1_RouteSearchFr1_txtMSOriginCode']";
//	private static final String CREATE_MAIN_CARRIAGE_PORT_OF_DISCHARGE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpRouteSearchFr1_RouteSearchFr1_txtMSDestinationCode']";
//	private static final String CREATE_MAIN_CARRIAGE_CARRIER_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpRouteSearchFr1_RouteSearchFr1_txtMSCarrier']";
//	private static final String CREATE_MAIN_CARRIAGE_DOC_CUT_OFF_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpRouteSearchFr1_RouteSearchFr1_txtCarrDocCutOff']";
//	private static final String CREATE_MAIN_CARRIAGE_CARGO_CUT_OFF_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpRouteSearchFr1_RouteSearchFr1_txtCarrCargoCutOff']";
//	private static final String CREATE_MAIN_CARRIAGE_ETD_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpRouteSearchFr1_RouteSearchFr1_txtCarrCargoCutOff']";
//	private static final String CREATE_MAIN_CARRIAGE_ETA_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpRouteSearchFr1_RouteSearchFr1_txtMSEstmtdArrvl']";
//	private static final String CREATE_MAIN_CARRIAGE_APPLY_MAIN_CARRIAGE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpRouteSearchFr1_RouteSearchFr1_btnToSaveManualSchdleRoute']";
	
	private static final String CARRIER_BOOKING_XPATH = "//a[text()='Carrier Booking']";
	
	public UIDropdown product = new UIDropdown("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpProduct']");
	public UIDropdown productType = new UIDropdown("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpProductType']");
	public UIDropdown incoterms = new UIDropdown("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpTerms']");
	public UITextField incotermsLocation = new UITextField("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtTermsLocation']");
	
	public UIDropdown referenceType = new UIDropdown("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpAgilityRefType']");
	public UIDropdown referenceOwner = new UIDropdown("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpReferenceOwner']");
	public UITextField referenceValue = new UITextField("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAgilityRefValue']");
	
	public UICheckbox requireSeaquest = new UICheckbox("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_ChkDocumentType1']");
	public UICheckbox requireFCR = new UICheckbox("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_ChkDocumentType2']");
	public UICheckbox requireFCT = new UICheckbox("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_ChkDocumentType3']");
	public UIDropdown requiredSeaquestType = new UIDropdown("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_drpCustomerReqBLType']");
	public UICheckbox requireLetterOfCredit = new UICheckbox("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_chkLC']");
	public UICheckbox requireInsurance = new UICheckbox("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_chkLC']");
	
	public UIDropdown originCustomsClearanceBy = new UIDropdown("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_drpOriginClearanceBy']");
	public UITextField originCustomsClearanceByName = new UITextField("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtOriginLocation']");
	public UIDropdown destinationCustomsClearanceBy = new UIDropdown("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_drpDestClearanceBy']");
	public UITextField destinationCustomsClearanceByName = new UITextField("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtDestLocation']");
	public UIDropdown mblType = new UIDropdown("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtMBLType']");
	public UIDropdown mblTerms = new UIDropdown("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtMBLTerms']");
	public UITextField euroPalletReferences = new UITextField("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtEuroPalletReference']");
	
	public UIDropdown measurementSystem = new UIDropdown("//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_ItemHierarchyMain1_drpMeasurementSystem']");
	
	public UIDropdown unitType = new UIDropdown("//select[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_ItemHierarchyMain1_UnitDetailsFr1_drpUnitType']");
	
	// Cargo Tab
	private String cargoTab;
	private UIPackage[] packages;
	private UIUnit[] units;
	
	public UIJob(UIDriver uiDriver) {
		this.uiDriver = uiDriver;
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////
	// Page and Tab Navigation
	/////////////////////////////////////////////////////////////////////////////////
	
	public void openJob() {
		
	}
	
	public void blankJob() {
		uiDriver.startBlankJob("Ocean Freight", "FCL (NVOCC)");
	}
	
	public void create() {
		//TODO Check status and act accordingly
		
		uiDriver.click(CREATE_XPATH);
	}
	
	public void preconfirm() {
		//TODO Check status and act accordingly
		
		uiDriver.click(PRECONFIRM_XPATH);
	}
	
	// TODO
//	public String getTab() {
//		return tab;
//	}
	
	public void setTab(String tab) {
		this.openJob();

		// if (this.getTab() == tab) { return; }
		String xpathToClick = "";
		
		switch (tab) {
			case MAIN_LABEL:
				xpathToClick = MAIN_TAB_XPATH;
				break;
			case CARGO_LABEL:
				xpathToClick = CARGO_TAB_XPATH;
				break;
			case MOVEMENT_LABEL:
				xpathToClick = MOVEMENT_TAB_XPATH;
				break;
			case SERVICES_LABEL:
				xpathToClick = SERVICES_TAB_XPATH;
				break;
			case EVENTS_LABEL:
				xpathToClick = EVENTS_TAB_XPATH;
				break;
			default:
				return;
		} // switch
		
		uiDriver.clickAndWaitForClass(xpathToClick, "active");
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////
	// Job Header
	/////////////////////////////////////////////////////////////////////////////////
	
	public boolean isJobHeaderExpanded() {
		setTab(MAIN_LABEL);
		return uiDriver.hasClass(JOB_HEADER_COLLAPSER_XPATH, "icon-chevron-up");
	}
	
	public String getPlaceOfReceipt() {
		this.setTab(MAIN_LABEL);
		return uiDriver.getText(PLACE_OF_RECEIPT_CODE_XPATH);
	}
	
	public void setPlaceOfReceipt(String placeOfReceipt) {
		this.setTab(MAIN_LABEL);
		uiDriver.enterText(PLACE_OF_RECEIPT_CODE_XPATH, placeOfReceipt);
		uiDriver.pressTab(PLACE_OF_RECEIPT_CODE_XPATH);
	}
	
	public String getPlaceOfDelivery() {
		this.setTab(MAIN_LABEL);
		return uiDriver.getText(PLACE_OF_DELIVERY_CODE_XPATH);
	}
	
	public void setPlaceOfDelivery(String placeOfDelivery) {
		this.setTab(MAIN_LABEL);
		uiDriver.enterText(PLACE_OF_DELIVERY_CODE_XPATH, placeOfDelivery);
		uiDriver.pressTab(PLACE_OF_DELIVERY_CODE_XPATH);
	}
	
	public String getOriginBranch() {
		this.setTab(MAIN_LABEL);
		return uiDriver.getText(ORIGIN_BRANCH_XPATH);
	}
	
	public void setOriginBranch(String originBranch) {
		//TODO
	}
	
	public String getDestinationBranch() {
		this.setTab(MAIN_LABEL);
		return uiDriver.getText(DESTINATION_BRANCH_XPATH);
	}
	
	public void setDestinationBranch(String destinationBranch) {
		this.setTab(MAIN_LABEL);
		//TODO
	}

	public String getPortOfLoading() {
		this.setTab(MAIN_LABEL);
		return uiDriver.getText(PORT_OF_LOADING_XPATH);
	}
	
	public void setPortOfLoading(String portOfLoading) {
		//TODO
	}
	
	public String getPortOfDischarge() {
		this.setTab(MAIN_LABEL);
		return uiDriver.getText(PORT_OF_DISCHARGE_XPATH);
	}
	
	public void setPortOfDischage(String portOfDischarge) {
		//TODO
	}
	

	/////////////////////////////////////////////////////////////////////////////////
	// Main Tab
	/////////////////////////////////////////////////////////////////////////////////
	
	
	/////////////////////////////////////////////////////////////////////////////////
	// Parties
	/////////////////////////////////////////////////////////////////////////////////
	
	public boolean isPartiesExpanded() {
		setTab(MAIN_LABEL);
		return uiDriver.hasClass(PARTIES_COLLAPSER_XPATH, "icon-chevron-up");
	}
	
	public boolean isAdditionalPartiesExpanded() {
		setTab(MAIN_LABEL);
		return uiDriver.hasClass(ADD_PARTIES_XPATH, "icon-collapse-alt");
	}
	
	public void setAdditionalPartiesExpanded(boolean isExpanded) {
		setTab(MAIN_LABEL);
		if (isAdditionalPartiesExpanded() == isExpanded) { return; }
		if (isExpanded) {
			uiDriver.clickAndWaitForClass(ADD_PARTIES_XPATH, "icon-collapse-alt");
		}
		else {
			uiDriver.clickAndWaitForClass(ADD_PARTIES_XPATH, "icon-expand-alt");
		}
	}
	
	public String getShipper() {
		setTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getName(SHIPPER_XPATH);
	}
	
	public void setShipper(String shipperName) {
		this.setTab(MAIN_LABEL);
		FOCiSTester.stakeholder.set(SHIPPER_XPATH, shipperName);
	}
	
	public String getConsignee() {
		setTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getName(CONSIGNEE_XPATH);
	}
	
	public void setConsignee(String consigneeName) {
		this.setTab(MAIN_LABEL);
		FOCiSTester.stakeholder.set(CONSIGNEE_XPATH, consigneeName);
	}
	
	public String getNotifyParty() {
		setTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getName(NOTIFY_PARTY_XPATH);
	}
	
	public void setNotifyParty(String notifyPartyName) {
		this.setTab(MAIN_LABEL);
		setAdditionalPartiesExpanded(true);
		FOCiSTester.stakeholder.set(NOTIFY_PARTY_XPATH, notifyPartyName);
	}
	
	public String getThirdParty() {
		setTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getName(THIRD_PARTY_XPATH);
	}
	
	public void setThirdParty(String thirdPartyName) {
		setTab(MAIN_LABEL);
		setAdditionalPartiesExpanded(true);
		FOCiSTester.stakeholder.set(THIRD_PARTY_XPATH, thirdPartyName);
	} // setThirdParty
	
	public String getShipperMovement() {
		setTab(MAIN_LABEL);
		return uiDriver.getValue(SHIPPER_MOVEMENT_XPATH);
	} // getShipperMovement
	
	public void setShipperMovement(String shipperMovement) {
		setTab(MAIN_LABEL);
		uiDriver.setDropdown(SHIPPER_MOVEMENT_XPATH, shipperMovement);
	} // setShipperMovement
	
	public String getShipperBillToParty() {
		setTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getBillToParty(SHIPPER_XPATH);
	}
	
	public void setShipperBillToParty() {
		setTab(MAIN_LABEL);
		//TODO
	}
	
	public String getShipperBillingParty() {
		setTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getBillingParty(SHIPPER_XPATH);
	}
	
	public String getConsigneeMovement() {
		setTab(MAIN_LABEL);
		return uiDriver.getValue(CONSIGNEE_MOVEMENT_XPATH);
	} // getConsigneeMovement

	public void setConsigneeMovement(String consigneeMovement) {
		setTab(MAIN_LABEL);
		uiDriver.setDropdown(CONSIGNEE_MOVEMENT_XPATH, consigneeMovement);
	} // setConsigneemovement

	public String getConsigneeBillToParty() {
		setTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getBillToParty(CONSIGNEE_XPATH);
	}
	
	public void setConsigneeBillToParty() {
		setTab(MAIN_LABEL);
	}
	
	public String getConsigneeBillingParty() {
		setTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getBillingParty(CONSIGNEE_XPATH);
	}
	
	public String getThirdPartyMovement() {
		setTab(MAIN_LABEL);
		setAdditionalPartiesExpanded(true);
		return uiDriver.getValue(THIRD_PARTY_MOVEMENT_XPATH);
	} // getThirdPartyMovement

	public void setThirdPartyMovement(String thirdPartyMovement) {
		setTab(MAIN_LABEL);
		setAdditionalPartiesExpanded(true);
		uiDriver.setDropdown(THIRD_PARTY_MOVEMENT_XPATH, thirdPartyMovement);
	} // setThirdPartyMovement
	
	public String getThirdPartyBillToParty() {
		setTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getBillToParty(THIRD_PARTY_XPATH);
	}
	
	public String getThirdPartyBillingParty() {
		setTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getBillingParty(THIRD_PARTY_XPATH);
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////
	// Links
	/////////////////////////////////////////////////////////////////////////////////
	
	public boolean isLinksExpanded() {
		setTab(MAIN_LABEL);
		return uiDriver.hasClass(LINKS_COLLAPSER_XPATH, "icon-chevron-up");
	}
	
	public void setLinksExpanded(boolean isExpanded) {
		setTab(MAIN_LABEL);
		if (isLinksExpanded() == isExpanded) { return; }
		if (isExpanded) {
			uiDriver.clickAndWaitForClass(LINKS_COLLAPSER_XPATH, "icon-chevron-up");
		}
		else {
			uiDriver.clickAndWaitForClass(LINKS_COLLAPSER_XPATH, "icon-chevron-down");
		}
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////
	// Customer Requirements
	/////////////////////////////////////////////////////////////////////////////////
	
	public boolean isCustomerRequirementsExpanded() {
		setTab(MAIN_LABEL);
		return uiDriver.hasClass(CUSTOMER_REQUIREMENTS_COLLAPSER_XPATH, "icon-chevron-up");
	}

	public String getInvoiceValue() {
		setTab(MAIN_LABEL);
		return uiDriver.getText(INVOICE_VALUE_XPATH);
	}
	
	public String getInvoiceCurrency() {
		setTab(MAIN_LABEL);
		return uiDriver.getText(INVOICE_CURRENCY_XPATH);
	}

	public String getCargoAvailableDate() {
		setTab(MAIN_LABEL);
		return uiDriver.getText(CARGO_AVAILABLE_DATE_XPATH);
	}
	
	public String getVolumetricRatio() {
		setTab(MAIN_LABEL);
		return uiDriver.getNumericText(VOLUMETRIC_RATIO_XPATH);
	}
	
	public String getNumberOfEuroPallets() {
		setTab(MAIN_LABEL);
		return uiDriver.getText(NUMBER_OF_EURO_PALLETS_XPATH);
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	// Cargo Tab
	/////////////////////////////////////////////////////////////////////////////////
	
	public UIPackage[] getPackages() {
		return packages;
	}
	
	public void setPackages(UIPackage[] packages) {
		this.setTab(CARGO_LABEL);
		this.packages = packages;
	}
	
	public UIUnit[] getUnits() {
		return units;
	}
	
	public void setUnits(UIUnit[] units) {
		this.setTab(CARGO_LABEL);
		this.units = units;
	}
	
	public String getCargoTab() {
		return cargoTab;
	}
	
	public void openCargoTab(String cargoTab) {
		this.openJob();
		this.setTab("Cargo");
		
		if (this.getCargoTab() == cargoTab) { return; }
		
		String xpathToClick = "";
		switch (cargoTab) {
			case "Packages":
				xpathToClick = PACKAGES_CARGO_TAB_XPATH;
				break;
			case "Units":
				xpathToClick = UNITS_CARGO_TAB_XPATH;
				break;
			case "Tree View":
				xpathToClick = TREE_VIEW_CARGO_TAB_XPATH;
				break;
			default:
				return;
		} // switch
		
		uiDriver.clickAndWaitForClass(xpathToClick, "active");
		this.cargoTab = cargoTab;
	}
	
	public void addUnit() { addUnits(1, "20' DC"); }
	public void addUnit(String unitType) { addUnits(1, unitType); }
	public void addUnits(int numUnits) { addUnits(numUnits, "20' DC"); }
	public void addUnits(int numUnits, String unitType) {
		this.openCargoTab("Units");
		
		uiDriver.clickAndWaitForElement(ADD_UNITS_XPATH, UNITS_REQUESTED_XPATH);
		uiDriver.enterText(UNITS_REQUESTED_XPATH, String.valueOf(numUnits));
		this.unitType.set(unitType);
		uiDriver.click(ADD_UNITS_DIALOG_XPATH);
		uiDriver.click(CONTINUE_DIALOG_XPATH);
		
	}
	
	public void setUnit(int unitNum, String unitNumber, double grossWeight, double netWeight, double volume, String sealingParty, String sealNumber, boolean isShipperOwned) {
		this.openCargoTab("Units");
		
		String unitXpath = getUnitXpath(unitNum);
		
		uiDriver.click(unitXpath + "/descendant::div[@title='Edit Unit']");
		uiDriver.enterText(unitXpath + "/descendant::input[@name='UnitNumber']", unitNumber);
		
		switch (measurementSystem.get()) {
			case "Metric":
				uiDriver.enterText(unitXpath + "/descendant::input[@name='MainMGrossWeight']", String.valueOf(grossWeight));
				uiDriver.enterText(unitXpath + "/descendant::input[@name='MainMNetWeight']", String.valueOf(netWeight));
				uiDriver.enterText(unitXpath + "/descendant::input[@name='MainMVolumeCBM']", String.valueOf(volume));
				break;
			case "Imperial":
				uiDriver.enterText(unitXpath + "/descendant::input[@name='MainGrossWeight']", String.valueOf(grossWeight));
				uiDriver.enterText(unitXpath + "/descendant::input[@name='MainNetWeight']", String.valueOf(netWeight));
				uiDriver.enterText(unitXpath + "/descendant::input[@name='MainVolumeCBM']", String.valueOf(volume));
				break;
			default:
				return;
		} // switch

		uiDriver.setDropdown(unitXpath + "/descendant::select[@name='SealingParty']", sealingParty);
		uiDriver.enterText(unitXpath + "/descendant::input[@name='SealNumber']", sealNumber);
		uiDriver.setCheckbox(unitXpath + "/descendant::input[@name='IsShipperOwnedContainer']", isShipperOwned);
		
		uiDriver.click(SAVE_UNITS_XPATH);
	}
	
	public String getUnitXpath(int unitNum) {
		return UNIT_DETAILS_GRID_XPATH + "/descendant::tr[" + (unitNum+1) + "]";
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////
	// Movement
	/////////////////////////////////////////////////////////////////////////////////
	
	public void setMainCarriage() {
		setTab(MOVEMENT_LABEL);
		uiDriver.click(PLAN_ROUTE_XPATH);
		uiDriver.selectFrame(PLAN_ROUTE_IFRAME_XPATH);
		uiDriver.click(PLAN_ROUTE_FIRST_SCHEDULE_XPATH);
		uiDriver.click(PLAN_ROUTE_APPLY_MAIN_CARRIAGE_XPATH);
		uiDriver.click(PLAN_ROUTE_SAVE_MAIN_CARRIAGE_XPATH);
		uiDriver.selectRootFrame();
		uiDriver.click(PLAN_ROUTE_CLOSE_XPATH);
		
		
//		uiDriver.click(CREATE_MAIN_CARRIAGE_XPATH);
//		uiDriver.enterText(CREATE_MAIN_CARRIAGE_PORT_OF_LOADING_XPATH, "INNSA");
//		uiDriver.pressTab(CREATE_MAIN_CARRIAGE_PORT_OF_LOADING_XPATH);
//		uiDriver.enterText(CREATE_MAIN_CARRIAGE_PORT_OF_DISCHARGE_XPATH, "GBFXT");
//		uiDriver.pressTab(CREATE_MAIN_CARRIAGE_PORT_OF_DISCHARGE_XPATH);
//		uiDriver.enterText(CREATE_MAIN_CARRIAGE_CARRIER_XPATH, "Maersk Line");
//		uiDriver.pressTab(CREATE_MAIN_CARRIAGE_CARRIER_XPATH);
//		uiDriver.enterText(CREATE_MAIN_CARRIAGE_DOC_CUT_OFF_XPATH, "20-Jan-2016 09:24");
//		uiDriver.enterText(CREATE_MAIN_CARRIAGE_CARGO_CUT_OFF_XPATH, "20-Jan-2016 09:24");
//		uiDriver.enterText(CREATE_MAIN_CARRIAGE_ETD_XPATH, "21-Jan-2016 09:24");
//		uiDriver.enterText(CREATE_MAIN_CARRIAGE_ETA_XPATH, "22-Jan-2016 09:24");
//		uiDriver.click(CREATE_MAIN_CARRIAGE_APPLY_MAIN_CARRIAGE_XPATH);
	}
	
	public void openCarrierBooking() {
		setTab(SERVICES_LABEL);
		uiDriver.clickAndOpenWindow(CARRIER_BOOKING_XPATH);
	}
}
