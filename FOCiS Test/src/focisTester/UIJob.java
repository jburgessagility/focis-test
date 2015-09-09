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
	
	private static final String PRODUCT_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpProduct']";
	private static final String PRODUCT_TYPE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpProductType']";
	private static final String PLACE_OF_RECEIPT_CODE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAglPlcOfRecCode']";
	private static final String PLACE_OF_RECEIPT_NAME_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtPlaceOfReceipt']";
	private static final String PLACE_OF_DELIVERY_CODE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAglPlcOfDelCode']";
	private static final String PLACE_OF_DELIVERY_NAME_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtPlaceOfDelivery']";
	private static final String ORIGIN_BRANCH_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtOrgBranchCode']";
	private static final String DESTINATION_BRANCH_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtDestBranchCode']";
	private static final String PORT_OF_LOADING_XPATH ="//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtPOLCode']";
	private static final String PORT_OF_DISCHARGE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtPODCode']";
	private static final String INCOTERMS_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpTerms']";
	private static final String INCOTERMS_LOCATION_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtTermsLocation']";
	
	private static final String SHIPPER_XPATH = "//*[@id='1_PartyRow']";
	private static final String CONSIGNEE_XPATH = "//*[@id='2_PartyRow']";
	private static final String NOTIFY_PARTY_XPATH = "//*[@id='3_PartyRow']";
	private static final String THIRD_PARTY_XPATH = "//*[@id='4_PartyRow']";
	private static final String SHIPPER_MOVEMENT_XPATH = "//*[@id='1_PartyRow']/descendant::select[1]";
	private static final String CONSIGNEE_MOVEMENT_XPATH = "//*[@id='2_PartyRow']/descendant::select[1]";

	private static final String REQUIRE_SQSTBL_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_ChkDocumentType1']";
	private static final String REQUIRE_FCR_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_ChkDocumentType2']";
	private static final String REQUIRE_FCT_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_ChkDocumentType3']";
	private static final String REQUIRED_SEAQUEST_TYPE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_drpCustomerReqBLType']";
	private static final String INVOICE_VALUE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtInvoiceValue']";
	private static final String INVOICE_CURRENCY_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtInvoiceCurrencyCode']";
	private static final String REQUIRE_LETTER_OF_CREDIT_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_chkLC']";
	private static final String REQUIRE_INSURANCE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_chkLC']";
	private static final String ORIGIN_CUSTOMS_CLEARANCE_BY_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_drpOriginClearanceBy']";
	private static final String ORIGIN_CUSTOMS_CLEARANCE_BY_NAME_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtOriginLocation']";
	private static final String DESTINATION_CUSTOMS_CLEARANCE_BY_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_drpDestClearanceBy']";
	private static final String DESTINATION_CUSTOMS_CLEARANCE_BY_NAME_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtDestLocation']";
	private static final String CARGO_AVAILABLE_DATE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtCargoAvailableDate']";
	private static final String MBL_TYPE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtMBLType']";
	private static final String MBL_TERMS_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtMBLTerms']";
	private static final String VOLUMETRIC_RATIO_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtVolumetricRatio']";
	private static final String NUMBER_OF_EURO_PALLETS_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtNoOfEuroPallets']";
	private static final String EURO_PALLET_REFERENCES_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtEuroPalletReference']";
	
	private static final String MEASUREMENT_SYSTEM_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_ItemHierarchyMain1_drpMeasurementSystem']";
	private static final String PACKAGES_CARGO_TAB_XPATH = "//*[@href='#PackageDetailsTab']";
	private static final String UNITS_CARGO_TAB_XPATH = "//*[@href='#UnitDetailsTab']";
	private static final String TREE_VIEW_CARGO_TAB_XPATH = "//*[@href='#TreeViewTab']";
	
	private static final String UNIT_DETAILS_GRID_XPATH = "//table[@id='UnitDetailsListGrid']";
	private static final String ADD_UNITS_XPATH = "//*[@data-original-title='Add / View Units']";
	private static final String SAVE_UNITS_XPATH = "//*[@data-original-title='Save Unit']";
	
	private static final String UNITS_REQUESTED_XPATH = "//input[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_ItemHierarchyMain1_UnitDetailsFr1_txtDummyUnitNoOfRequest']";
	private static final String UNIT_TYPE_XPATH = "//select[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_ItemHierarchyMain1_UnitDetailsFr1_drpUnitType']";
	private static final String ADD_UNITS_DIALOG_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_ItemHierarchyMain1_UnitDetailsFr1_btnAddUnitDetails']";
	private static final String CONTINUE_DIALOG_XPATH = "//*[@id='btnUnitContinue']";
	
	
	private static final String PLAN_ROUTE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnAddRoute']";

	// Cargo Tab
	private String cargoTab;
	private String measurementSystem;
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
	
	// TODO
//	public String getTab() {
//		return tab;
//	}
	
	public void openTab(String tab) {
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
	
	public String getProduct() {
		this.openTab(MAIN_LABEL);
		return uiDriver.getValue(PRODUCT_XPATH);
	}
	
	public void setProduct(String product) {
		this.openTab(MAIN_LABEL);
		uiDriver.setDropdown(PRODUCT_XPATH, product);
	}
	
	public String getProductType() {
		this.openTab(MAIN_LABEL);
		return uiDriver.getValue(PRODUCT_TYPE_XPATH);
	}
	
	public void setProductType(String productType) {
		this.openTab(MAIN_LABEL);
		uiDriver.setDropdown(PRODUCT_TYPE_XPATH, productType);
	}
	
	public String getPlaceOfReceipt() {
		this.openTab(MAIN_LABEL);
		return uiDriver.getText(PLACE_OF_RECEIPT_CODE_XPATH);
	}
	
	public void setPlaceOfReceipt(String placeOfReceipt) {
		this.openTab(MAIN_LABEL);
		//TODO
	}
	
	public String getPlaceOfDelivery() {
		this.openTab(MAIN_LABEL);
		return uiDriver.getText(PLACE_OF_DELIVERY_CODE_XPATH);
	}
	
	public void setPlaceOfDelivery(String placeOfDelivery) {
		this.openTab(MAIN_LABEL);
		//TODO
	}
	
	public String getOriginBranch() {
		this.openTab(MAIN_LABEL);
		return uiDriver.getText(ORIGIN_BRANCH_XPATH);
	}
	
	public void setOriginBranch(String originBranch) {
		//TODO
	}
	
	public String getDestinationBranch() {
		this.openTab(MAIN_LABEL);
		return uiDriver.getText(DESTINATION_BRANCH_XPATH);
	}
	
	public void setDestinationBranch(String destinationBranch) {
		this.openTab(MAIN_LABEL);
		//TODO
	}

	public String getPortOfLoading() {
		this.openTab(MAIN_LABEL);
		return uiDriver.getText(PORT_OF_LOADING_XPATH);
	}
	
	public void setPortOfLoading(String portOfLoading) {
		//TODO
	}
	
	public String getPortOfDischarge() {
		this.openTab(MAIN_LABEL);
		return uiDriver.getText(PORT_OF_DISCHARGE_XPATH);
	}
	
	public void setPortOfDischage(String portOfDischarge) {
		//TODO
	}
	
	public String getIncoterms() {
		this.openTab(MAIN_LABEL);
		return uiDriver.getValue(INCOTERMS_XPATH);
	}
	
	public void setIncoterms(String incoterms) {
		this.openTab(MAIN_LABEL);
		uiDriver.setDropdown(INCOTERMS_XPATH, incoterms);
	}
	
	public String getIncotermsLocation() {
		this.openTab(MAIN_LABEL);
		return uiDriver.getText(INCOTERMS_LOCATION_XPATH);
	}
	
	public void setIncotermsLocation(String incotermsLocation) {
		this.openTab(MAIN_LABEL);
		uiDriver.enterText(INCOTERMS_LOCATION_XPATH, incotermsLocation);
	}
	

	/////////////////////////////////////////////////////////////////////////////////
	// Main Tab
	/////////////////////////////////////////////////////////////////////////////////
	
	public String getShipper() {
		openTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getName(SHIPPER_XPATH);
	}
	
	public void setShipper(String shipperName) {
		this.openTab(MAIN_LABEL);
		FOCiSTester.stakeholder.set(SHIPPER_XPATH, shipperName);
	}
	
	public String getConsignee() {
		openTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getName(CONSIGNEE_XPATH);
	}
	
	public void setConsignee(String consigneeName) {
		this.openTab(MAIN_LABEL);
		FOCiSTester.stakeholder.set(CONSIGNEE_XPATH, consigneeName);
	}
	
	public String getNotifyParty() {
		openTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getName(NOTIFY_PARTY_XPATH);
	}
	
	public void setNotifyParty(String notifyPartyName) {
		this.openTab(MAIN_LABEL);
		FOCiSTester.stakeholder.set(NOTIFY_PARTY_XPATH, notifyPartyName);
	}
	
	public String getThirdParty() {
		openTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getName(THIRD_PARTY_XPATH);
	}
	
	public void setThirdParty(String thirdPartyName) {
		openTab(MAIN_LABEL);
		FOCiSTester.stakeholder.set(THIRD_PARTY_XPATH, thirdPartyName);
	} // setThirdParty
	
	public String getShipperMovement() {
		openTab(MAIN_LABEL);
		return uiDriver.getValue(SHIPPER_MOVEMENT_XPATH);
	} // getShipperMovement
	
	public void setShipperMovement(String shipperMovement) {
		openTab(MAIN_LABEL);
		uiDriver.setDropdown(SHIPPER_MOVEMENT_XPATH, shipperMovement);
	} // setShipperMovement
	
	public String getShipperBillToParty() {
		openTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getBillToParty(SHIPPER_XPATH);
	}
	
	public void setShipperBillToParty() {
		openTab(MAIN_LABEL);
		//TODO
	}
	
	public String getShipperBillingParty() {
		openTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getBillingParty(SHIPPER_XPATH);
	}
	
	public String getConsigneeMovement() {
		openTab(MAIN_LABEL);
		return uiDriver.getValue(CONSIGNEE_MOVEMENT_XPATH);
	} // getConsigneeMovement

	public void setConsigneeMovement(String consigneeMovement) {
		openTab(MAIN_LABEL);
		uiDriver.setDropdown(CONSIGNEE_MOVEMENT_XPATH, consigneeMovement);
	} // setConsigneemovement

	public String getConsigneeBillToParty() {
		openTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getBillToParty(CONSIGNEE_XPATH);
	}
	
	public void setConsigneeBillToParty() {
		openTab(MAIN_LABEL);
	}
	
	public String getConsigneeBillingParty() {
		openTab(MAIN_LABEL);
		return FOCiSTester.stakeholder.getBillingParty(CONSIGNEE_XPATH);
	}
	
	// TODO
//	public String getThirdPartyMovement() {
//		return uiDriver.getText(THIRD_PARTY_MOVEMENT_XPATH);
//	} // getThirdPartyMovement
//
//	public void setThirdPartyMovement(String thirdPartyMovement) {
//		openTab(MAIN);
//		uiDriver.setDropdown(CONSIGNEE_MOVEMENT_XPATH, thirdPartyMovement);
//	} // setThirdPartyMovement
	
	public boolean getRequireSQSTBL() {
		openTab(MAIN_LABEL);
		return uiDriver.getCheckboxValue(REQUIRE_SQSTBL_XPATH);
	} // getRequireSQSTBL
	
	public void setRequireSQSTBL(boolean requireSQSTBL) {
		openTab(MAIN_LABEL);
		uiDriver.setCheckbox(REQUIRE_SQSTBL_XPATH, requireSQSTBL);
	} // setRequireSQSTBL
	
	public boolean getRequireFCR() {
		openTab(MAIN_LABEL);
		return uiDriver.getCheckboxValue(REQUIRE_FCR_XPATH);
	} // getRequireFCR
	
	public void setRequireFCR(boolean requireFCR) {
		openTab(MAIN_LABEL);
		uiDriver.setCheckbox(REQUIRE_FCR_XPATH, requireFCR);
	} // setRequireFCR
	
	public boolean getRequireFCT() {
		openTab(MAIN_LABEL);
		return uiDriver.getCheckboxValue(REQUIRE_FCT_XPATH);
	} // getRequireFCT
	
	public void setRequireFCT(boolean requireFCT) {
		openTab(MAIN_LABEL);
		uiDriver.setCheckbox(REQUIRE_FCT_XPATH, requireFCT);
	} // setRequireFCT
	
	public String getRequiredSeaquestType() {
		openTab(MAIN_LABEL);
		return uiDriver.getValue(REQUIRED_SEAQUEST_TYPE_XPATH);
	} // getRequiredSeaquestType
	
	public String getInvoiceValue() {
		openTab(MAIN_LABEL);
		return uiDriver.getText(INVOICE_VALUE_XPATH);
	}
	
	public String getInvoiceCurrency() {
		openTab(MAIN_LABEL);
		return uiDriver.getText(INVOICE_CURRENCY_XPATH);
	}
	
	public boolean getRequireLetterOfCredit() {
		openTab(MAIN_LABEL);
		return uiDriver.getCheckboxValue(REQUIRE_LETTER_OF_CREDIT_XPATH);
	}
	
	public boolean getRequireInsurance() {
		openTab(MAIN_LABEL);
		return uiDriver.getCheckboxValue(REQUIRE_INSURANCE_XPATH);
	}
	
	public String getOriginCustomsClearanceBy() {
		openTab(MAIN_LABEL);
		return uiDriver.getValue(ORIGIN_CUSTOMS_CLEARANCE_BY_XPATH);
	}
	
	public String getOriginCustomsClearanceByName() {
		openTab(MAIN_LABEL);
		return uiDriver.getText(ORIGIN_CUSTOMS_CLEARANCE_BY_NAME_XPATH);
	}
	
	public String getDestinationCustomsClearanceBy() {
		openTab(MAIN_LABEL);
		return uiDriver.getValue(DESTINATION_CUSTOMS_CLEARANCE_BY_XPATH);
	}
	
	public String getDestinationCustomsClearanceByName() {
		openTab(MAIN_LABEL);
		return uiDriver.getText(DESTINATION_CUSTOMS_CLEARANCE_BY_NAME_XPATH);
	}
	
	public String getCargoAvailableDate() {
		openTab(MAIN_LABEL);
		return uiDriver.getText(CARGO_AVAILABLE_DATE_XPATH);
	}
	
	public String getMBLType() {
		openTab(MAIN_LABEL);
		return uiDriver.getValue(MBL_TYPE_XPATH);
	}
	
	public String getMBLTerms() {
		openTab(MAIN_LABEL);
		return uiDriver.getValue(MBL_TERMS_XPATH);
	}
	
	public String getVolumetricRatio() {
		openTab(MAIN_LABEL);
		return uiDriver.getValue(VOLUMETRIC_RATIO_XPATH);
	}
	
	public String getNumberOfEuroPallets() {
		openTab(MAIN_LABEL);
		return uiDriver.getText(NUMBER_OF_EURO_PALLETS_XPATH);
	}
	
	public String getEuroPalletReferences() {
		openTab(MAIN_LABEL);
		return uiDriver.getText(EURO_PALLET_REFERENCES_XPATH);
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	// Cargo Tab
	/////////////////////////////////////////////////////////////////////////////////
	
	public String getMeasurementSystem() {
		return measurementSystem;
	}
	
	public void setMeasurementSystem(String measurementSystem) {
		this.openTab(CARGO_LABEL);
		uiDriver.setDropdown(MEASUREMENT_SYSTEM_XPATH, measurementSystem);
		this.measurementSystem = measurementSystem;
	}
	
	public UIPackage[] getPackages() {
		return packages;
	}
	
	public void setPackages(UIPackage[] packages) {
		this.openTab(CARGO_LABEL);
		this.packages = packages;
	}
	
	public UIUnit[] getUnits() {
		return units;
	}
	
	public void setUnits(UIUnit[] units) {
		this.openTab(CARGO_LABEL);
		this.units = units;
	}
	
	public String getCargoTab() {
		return cargoTab;
	}
	
	public void openCargoTab(String cargoTab) {
		this.openJob();
		this.openTab("Cargo");
		
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
		uiDriver.setDropdown(UNIT_TYPE_XPATH, unitType);
		uiDriver.click(ADD_UNITS_DIALOG_XPATH);
		uiDriver.click(CONTINUE_DIALOG_XPATH);
		
	}
	
	public void setUnit(int unitNum, String unitNumber, double grossWeight, double netWeight, double volume, String sealingParty, String sealNumber, boolean isShipperOwned) {
		this.openCargoTab("Units");
		
		String unitXpath = getUnitXpath(unitNum);
		
		uiDriver.click(unitXpath + "/descendant::div[@title='Edit Unit']");
		uiDriver.enterText(unitXpath + "/descendant::input[@name='UnitNumber']", unitNumber);
		
		switch (getMeasurementSystem()) {
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
}
