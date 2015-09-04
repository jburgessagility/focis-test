package workflowRunner;

public class UIJob extends UIModel {
	
	private static final String MAIN = "Main";
	private static final String CARGO = "Cargo";
	private static final String MOVEMENT = "Movement";
	private static final String SERVICES = "Services";
	private static final String EVENTS = "Events";
	
	private static final String MAIN_TAB_XPATH = "//*[@id='LiParties']";
	private static final String CARGO_TAB_XPATH = "//*[@id='LiCargoDetails']/a";
	private static final String MOVEMENT_TAB_XPATH = "//*[@id='LiRouting']";
	private static final String SERVICES_TAB_XPATH = "//*[@id='LiServices']";
	private static final String EVENTS_TAB_XPATH = "//*[@id='LiEvents']";
	
	private static final String PRODUCT_XPATH = "//*[id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpProduct']";
	private static final String PRODUCT_TYPE_XPATH = "//*[id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpProductType']";
	private static final String PLACE_OF_RECEIPT_CODE_ID = "PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAglPlcOfRecCode";
	private static final String PLACE_OF_RECEIPT_NAME_ID = "PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtPlaceOfReceipt";
	private static final String PLACE_OF_DELIVERY_CODE_ID = "PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAglPlcOfDelCode";
	private static final String PLACE_OF_DELIVERY_NAME_ID = "PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtPlaceOfDelivery";
	private static final String ORIGIN_BRANCH_CODE_ID = "PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtOrgBranchCode";
	private static final String DESTINATION_BRANCH_CODE_ID = "PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtDestBranchCode";
	private static final String REQUIRE_SQSTBL_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_ChkDocumentType1']";
	private static final String REQUIRE_FCR_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_ChkDocumentType2']";
	private static final String REQUIRE_FCT_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_ChkDocumentType3']";
	private static final String SHIPPER_XPATH = "//*[@id='1_PartyRow']";
	private static final String CONSIGNEE_XPATH = "//*[@id='2_PartyRow']";
	private static final String NOTIFY_PARTY_XPATH = "//*[@id='3_PartyRow']";
	private static final String THIRD_PARTY_XPATH = "//*[@id='4_PartyRow']";
	private static final String SHIPPER_MOVEMENT_XPATH = "//*[@id='1_PartyRow']/descendant::select[1]";
	private static final String CONSIGNEE_MOVEMENT_XPATH = "//*[@id='2_PartyRow']/descendant::select[1]";
	
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
	
	// Header
	private String placeOfReceipt;
	private String placeOfDelivery;
	private String incoterms;
	private String incotermsLocation;
	private String tab;
	
	// Main Tab
	private UIStakeholder shipper = new UIStakeholder();
	private UIStakeholder consignee = new UIStakeholder();
	private UIStakeholder notifyParty = new UIStakeholder();
	private UIStakeholder thirdParty = new UIStakeholder();
	private String shipperMovement;
	private String consigneeMovement;
	private String thirdPartyMovement;
	
	private boolean requireSQSTBL;
	private boolean requireFCR;
	private boolean requireFCT;
	
	// Cargo Tab
	private String cargoTab;
	private String measurementSystem;
	private UIPackage[] packages;
	private UIUnit[] units;
	
	
	/////////////////////////////////////////////////////////////////////////////////
	// Page and Tab Navigation
	/////////////////////////////////////////////////////////////////////////////////
	
	public void openJob() {
		
	}
	
	public void blankJob() {
//		uiDriver.setup(driver, wait);
		uiDriver.startBlankJob("Ocean Freight", "FCL (NVOCC)");
	}
	
	public String getTab() {
		return tab;
	}
	
	public void openTab(String tab) {
		this.openJob();

		if (this.getTab() == tab) { return; }
		String xpathToClick = "";
		
		switch (tab) {
			case "Main":
				xpathToClick = MAIN_TAB_XPATH;
				break;
			case "Cargo":
				xpathToClick = CARGO_TAB_XPATH;
				break;
			case "Movement":
				xpathToClick = MOVEMENT_TAB_XPATH;
				break;
			case "Services":
				xpathToClick = SERVICES_TAB_XPATH;
				break;
			case "Events":
				xpathToClick = EVENTS_TAB_XPATH;
				break;
			default:
				return;
		} // switch
		
		uiDriver.clickAndWaitForClass(xpathToClick, "active");
		this.tab = tab;
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////
	// Job Header
	/////////////////////////////////////////////////////////////////////////////////
	
	public String getProduct() {
		this.openJob();
		return uiDriver.getText(PRODUCT_XPATH);
	}
	
	public void setProduct(String product) {
		this.openJob();
		uiDriver.setDropdown(PRODUCT_XPATH, product);
	}
	
	public String getProductType() {
		this.openJob();
		return uiDriver.getText(PRODUCT_TYPE_XPATH);
	}
	
	public void setProductType(String productType) {
		this.openJob();
		uiDriver.setDropdown(PRODUCT_TYPE_XPATH, productType);
	}
	
	public String getPlaceOfReceipt() {
		return placeOfReceipt;
	}
	
	public void setPlaceOfReceipt(String placeOfReceipt) {
		this.openJob();
		this.placeOfReceipt = placeOfReceipt;
	}
	
	public String getPlaceOfDelivery() {
		return placeOfDelivery;
	}
	
	public void setPlaceOfDelivery(String placeOfDelivery) {
		this.openJob();
		this.placeOfDelivery = placeOfDelivery;
	}
	
	public String getIncoterms() {
		return incoterms;
	}
	
	public void setIncoterms(String incoterms) {
		this.openJob();
//		new Select(this.driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpTerms"))).selectByVisibleText(incoterms);
		this.incoterms = incoterms;
	}
	
	public String getIncotermsLocation() {
		return incotermsLocation;
	}
	
	public void setIncotermsLocation(String incotermsLocation) {
		this.openJob();
//		driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtTermsLocation")).sendKeys(incotermsLocation);
		this.incotermsLocation = incotermsLocation;
	}
	

	/////////////////////////////////////////////////////////////////////////////////
	// Main Tab
	/////////////////////////////////////////////////////////////////////////////////
	
	public UIStakeholder getShipper() {
		return shipper;
	}
	
	public void setShipper(String shipperName) {
		this.openTab(MAIN);
		shipper.set(SHIPPER_XPATH, shipperName);
	}
	
	public UIStakeholder getConsignee() {
		return consignee;
	}
	
	public void setConsignee(String consigneeName) {
		this.openTab(MAIN);
		consignee.set(CONSIGNEE_XPATH, consigneeName);
	}
	
	public UIStakeholder getNotifyParty() {
		return notifyParty;
	}
	
	public void setNotifyParty(String notifyPartyName) {
		this.openTab(MAIN);
		notifyParty.set(NOTIFY_PARTY_XPATH, notifyPartyName);
	}
	
	public UIStakeholder getThirdParty() {
		return thirdParty;
	}
	
	public void setThirdParty(String thirdPartyName) {
		this.openTab(MAIN);
		thirdParty.set(THIRD_PARTY_XPATH, thirdPartyName);
	} // setThirdParty
	
	public String getShipperMovement() {
		return shipperMovement;
	} // getShipperMovement
	
	public void setShipperMovement(String shipperMovement) {
		openTab(MAIN);
		uiDriver.setDropdown(SHIPPER_MOVEMENT_XPATH, shipperMovement);
		this.shipperMovement = shipperMovement;
	} // setShipperMovement
	
	public String getConsigneeMovement() {
		return consigneeMovement;
	} // getConsigneeMovement

	public void setConsigneeMovement(String consigneeMovement) {
		openTab(MAIN);
		uiDriver.setDropdown(CONSIGNEE_MOVEMENT_XPATH, consigneeMovement);
		this.consigneeMovement = consigneeMovement;
	} // setConsigneemovement

	public String getThirdPartyMovement() {
		return thirdPartyMovement;
	} // getThirdPartyMovement

	public void setThirdPartyMovement(String thirdPartyMovement) {
		openTab(MAIN);
		uiDriver.setDropdown(CONSIGNEE_MOVEMENT_XPATH, thirdPartyMovement);
		this.thirdPartyMovement = thirdPartyMovement;
	} // setThirdPartyMovement
	
	public boolean getRequireSQSTBL() {
		return requireSQSTBL;
	} // getRequireSQSTBL
	
	public void setRequireSQSTBL(boolean requireSQSTBL) {
		openTab(MAIN);
		uiDriver.setCheckbox(REQUIRE_SQSTBL_XPATH, requireSQSTBL);
		this.requireSQSTBL = requireSQSTBL;
	} // setRequireSQSTBL
	
	public boolean getRequireFCR() {
		return requireFCR;
	} // getRequireFCR
	
	public void setRequireFCR(boolean requireFCR) {
		openTab(MAIN);
		uiDriver.setCheckbox(REQUIRE_FCR_XPATH, requireFCR);
		this.requireFCR = requireFCR;
	} // setRequireFCR
	
	public boolean getRequireFCT() {
		return requireFCT;
	} // getRequireFCT
	
	public void setRequireFCT(boolean requireFCT) {
		openTab(MAIN);
		uiDriver.setCheckbox(REQUIRE_FCT_XPATH, requireFCT);
		this.requireFCT = requireFCT;
	} // setRequireFCT
	
	
	/////////////////////////////////////////////////////////////////////////////////
	// Cargo Tab
	/////////////////////////////////////////////////////////////////////////////////
	
	public String getMeasurementSystem() {
		return measurementSystem;
	}
	
	public void setMeasurementSystem(String measurementSystem) {
		this.openTab(CARGO);
		uiDriver.setDropdown(MEASUREMENT_SYSTEM_XPATH, measurementSystem);
		this.measurementSystem = measurementSystem;
	}
	
	public UIPackage[] getPackages() {
		return packages;
	}
	
	public void setPackages(UIPackage[] packages) {
		this.openTab(CARGO);
		this.packages = packages;
	}
	
	public UIUnit[] getUnits() {
		return units;
	}
	
	public void setUnits(UIUnit[] units) {
		this.openTab(CARGO);
		this.units = units;
	}
	
	public String getCargoTab() {
		return cargoTab;
	}
	
	public void openCargoTab(String cargoTab) {
		this.openJob();
		this.openTab("Cargo");
		
		if (this.getCargoTab() == tab) { return; }
		
		String xpathToClick = "";
		switch (tab) {
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
