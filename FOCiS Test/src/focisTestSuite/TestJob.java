package focisTestSuite;

import focisTester.FOCiSTester;
import focisTester.UIJob;

public class TestJob {

	private static final String[] PRODUCT_OPTIONS = {
		"Select",
		"Air Freight",
		"NA",
		"Ocean Freight"
	};
	private static final String[] PRODUCT_TYPE_OPTIONS = {
		"Select",
		"Breakbulk (Freight Management)",
		"Breakbulk (NVOCC)",
		"FCL (Freight Management)",
		"FCL (NVOCC)",
		"LCL (NVOCC)"
	};
	private static final String[] INCOTERMS_OPTIONS = { 
		"Select",
		"FOB - Free On Board",
		"DDU - Delivered Duty Unpaid",
		"CFR - Cost and Freight",
		"CIF - Cost, Insurance and Freight",
		"CIP - Carriage and Insurance Paid To",
		"CPT - Carriage Paid To",
		"DAP - Delivered at Place",
		"DAT - Delivered at Terminal",
		"DDP - Delivered Duty Paid",
		"EXW - EX Works",
		"FAS - Free Alongside Ship",
		"FCA - Free Carrier"
	};
	private static final String[] MOVEMENT_TYPE_OPTIONS = {
		"None",
		"CY (Point of Discharge) to Door",
		"CY (Point of Loading) to Door",
		"CY to CY",
		"Door to CY (Point of Discharge)",
		"Door to CY (Point of Loading)",
		"Door to Door"
	};
	private static final String[] REFERENCE_TYPE_OPTIONS = { 
		"Select", 
		"Origin Collection", 
		"Origin Delivery", 
		"Sales Order", 
		"Commercial Invoice", 
		"Packing List", 
		"Purchase Order", 
		"Shippers Letter of Instructions",
		"Dispatch",
		"Destination Collection",
		"Destination Delivery",
		"Other" 
	}; 
	private static final String[] REFERENCE_OWNER_OPTIONS = {
		"Select",
		"Shipper",
		"Consignee",
		"Notify Party",
		"Third Party",
		"Other"
	};
	private static final String[] REQUIRED_SEAQUEST_TYPE_OPTIONS = {
		"Select",
		"Original",
		"Express"
	};
	private static final String[] ORIGIN_CUSTOMS_CLEARANCE_BY_OPTIONS = {
		"Select",
		"Agility",
		"Shipper",
		"Agility Nominated Broker",
		"Shipper’s Nominated Broker"
	};
	private static final String[] DESTINATION_CUSTOMS_CLEARANCE_BY_OPTIONS = {
		"Select",
		"Agility",
		"Consignee",
		"Agility Nominated Broker",
		"Consignee’s Nominated Broker"
	};
	private static final String[] MBL_TERMS_OPTIONS = { 
		"Select", 
		"Prepaid", 
		"Collect" 
	};
	private static final String[] MBL_TYPE_OPTIONS = { 
		"Select", 
		"Express", 
		"Original" 
	};
	
	public static void run(FOCiSTester ft) {
		
		ft.setTestCategory("Job");
		
		UIJob job = FOCiSTester.job;
		
		job.blankJob();
		
		// Job Header
		ft.test("Job Header default is Expanded State", job.isJobHeaderExpanded(), true);
		
		ft.test("Product default is Ocean Freight", job.product.get(), "Ocean Freight");
		TestMacros.testDropdown(ft, job.product, "Product", "Product", PRODUCT_OPTIONS, true, true);
		
		ft.test("Product Type default is FCL (NVOCC)", job.productType.get(), "FCL (NVOCC)");
		TestMacros.testDropdown(ft, job.productType, "Product Type", "Product Type", PRODUCT_TYPE_OPTIONS, true, true);
		
		ft.test("Place of Receipt default is (blank)", job.getPlaceOfReceipt(), "");
		ft.test("Place of Delivery default is (blank)", job.getPlaceOfDelivery(), "");
		ft.test("Origin Branch default is (blank)", job.getOriginBranch(), "");
		ft.test("Destination Branch default is (blank)", job.getDestinationBranch(), "");
		ft.test("Port of Loading default is (blank)", job.getPortOfLoading(), "");
		ft.test("Port of Discharge default is (blank)", job.getPortOfDischarge(), "");
		
		ft.test("Incoterms default is Select", job.incoterms.get(), "Select");
		TestMacros.testDropdown(ft, job.incoterms, "Incoterms", "INCOTERM", INCOTERMS_OPTIONS, true, true);
		ft.test("Incoterms Location default is (blank)", job.incotermsLocation.get(), "");
		
		// Main Tab
		
		// Parties
		ft.test("Parties default is Expanded State", job.isPartiesExpanded(), true);
		ft.test("Additional Parties default is Collapsed State", job.isAdditionalPartiesExpanded(), false);
		job.setAdditionalPartiesExpanded(true);
		
		ft.test("Shipper default is (blank)", job.getShipper(), "");
		ft.test("Shipper Movement Type default is None", job.shipperMovementType.get(), "None");
		TestMacros.testDropdown(ft, job.shipperMovementType, "Shipper Movement Type", null, MOVEMENT_TYPE_OPTIONS, true, true);
		ft.test("Shipper Bill To Party default is (blank)", job.getShipperBillToParty(), "");
		ft.test("Shipper Billing Party default is Select", job.getShipperBillingParty(), "Select");
		
		ft.test("Consignee default is (blank)", job.getConsignee(), "");
		ft.test("Consignee Movement Type default is None", job.consigneeMovementType.get(), "None");
		TestMacros.testDropdown(ft, job.consigneeMovementType, "Consignee Movement Type", null, MOVEMENT_TYPE_OPTIONS, true, true);
		ft.test("Consignee Bill To Party default is (blank)", job.getConsigneeBillToParty(), "");
		ft.test("Consignee Billing Party default is Select", job.getConsigneeBillingParty(), "Select");

		ft.test("Notify Party", job.getNotifyParty(), "");
		
		ft.test("Third Party default is (blank)", job.getThirdParty(), "");
		ft.test("Third Party Movement Type default is None", job.thirdPartyMovementType.get(), "None");
		TestMacros.testDropdown(ft, job.thirdPartyMovementType, "Third Party Movement Type", null, MOVEMENT_TYPE_OPTIONS, true, true);
		ft.test("Third Party Bill To Party default is (blank)", job.getThirdPartyBillToParty(), "");
		ft.test("Third Party Billing Party default is Select", job.getThirdPartyBillingParty(), "Select");
		
		// Links
		ft.test("Links default is Expanded State", job.isLinksExpanded(), true);
		
		ft.test("Reference Type default is Select", job.referenceType.get(), "Select");
		TestMacros.testDropdown(ft, job.referenceType, "Reference Type", "Type", REFERENCE_TYPE_OPTIONS, true, true);
		
		ft.test("Reference Owner default is Select", job.referenceOwner.get(), "Select");
		TestMacros.testDropdown(ft, job.referenceOwner, "Reference Owner", "Owner", REFERENCE_OWNER_OPTIONS, true, true);
		
		ft.test("Reference Value", job.referenceValue.get(), "");
		
		//ft.test("References", job.getNumReferences(), 0);
		
		// Customer Requirements
		ft.test("Customer Requirements default is Expanded State", job.isCustomerRequirementsExpanded(), true);
		ft.test("Require Seaquest default is Checked", job.requireSeaquest.get(), true);
		ft.test("Require FCR default is Unchecked", job.requireFCR.get(), false);
		ft.test("Require FCT default is Unchecked", job.requireFCT.get(), false);
		ft.test("Required Seaquest Type default is Select", job.requiredSeaquestType.get(), "Select");
		TestMacros.testDropdown(ft, job.requiredSeaquestType, "Required Seaquest Type", "Required Seaquest Type", REQUIRED_SEAQUEST_TYPE_OPTIONS, true, true);
		ft.test("Invoice Value default is (blank)", job.getInvoiceValue(), "");
		ft.test("Invoice Currency default is (blank)", job.getInvoiceCurrency(), "");
		ft.test("Require Letter of Credit default is Unchecked", job.requireLetterOfCredit.get(), false);
		ft.test("Require Insurance default is Unchecked", job.requireInsurance.get(), false);
		ft.test("Origin Customs Clearance By default is Select", job.originCustomsClearanceBy.get(), "Select");
		TestMacros.testDropdown(ft, job.originCustomsClearanceBy, "Origin Customs Clearance By", "Origin Customs Clearance By", ORIGIN_CUSTOMS_CLEARANCE_BY_OPTIONS, true, true);
		ft.test("Origin Customs Clearance By Name default is (blank)", job.originCustomsClearanceByName.get(), "");
		ft.test("Destination Customs Clearance By default is Select", job.destinationCustomsClearanceBy.get(), "Select");
		TestMacros.testDropdown(ft, job.destinationCustomsClearanceBy, "Destination Customs Clearance By", "Destination Customs Clearance By", DESTINATION_CUSTOMS_CLEARANCE_BY_OPTIONS, true, true);
		ft.test("Destination Customs Clearance By Name default is (blank)", job.destinationCustomsClearanceByName.get(), "");
		ft.test("Cargo Available Date default is (blank)", job.getCargoAvailableDate(), "");
		
		ft.test("MBL Type default is Select", job.mblType.get(), "Select");
		TestMacros.testDropdown(ft, job.mblType, "MBL Type", "MBL Type", MBL_TYPE_OPTIONS, true, true);
		
		ft.test("MBL Terms", job.mblTerms.get(), "Select");
		TestMacros.testDropdown(ft, job.mblTerms, "MBL Terms", "MBL Terms", MBL_TERMS_OPTIONS, true, true);
		
		ft.test("Volumetric Ratio default is 1000", job.volumetricRatio.get(), "1000");
		TestMacros.testNumericField(ft, job.volumetricRatio, "Volumetric Ratio", "Volumetric Ratio", true, true);
		ft.test("Number of Euro Pallets default is (blank)", job.numberOfEuroPallets.get(), "");
		TestMacros.testNumericField(ft, job.numberOfEuroPallets, "Number of Euro Pallets", "Number of Euro Pallets", true, true);
		ft.test("Euro Pallet References default is (blank)", job.euroPalletReferences.get(), "");
		TestMacros.testTextField(ft, job.euroPalletReferences, "Euro Pallet References", "Euro Pallet References", true, true);
		
	}
}
