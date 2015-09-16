package focisTestSuite;

import focisTester.FOCiSTester;
import focisTester.UIJob;

public class TestJob {

	public static void run(FOCiSTester ft) {
		
		ft.setTestCategory("Job");
		
		UIJob job = FOCiSTester.job;
		
		//TODO Set up user/branch/schedule
		
		job.blankJob();
		
		// Job Header
		
		
		ft.test("Job Header Expanded State", job.isJobHeaderExpanded(), true);
		
		ft.test("Product", job.getProduct(), "Ocean Freight");
		ft.test("Product Type", job.getProductType(), "FCL (NVOCC)");
		ft.test("Place of Receipt", job.getPlaceOfReceipt(), "");
		ft.test("Place of Delivery", job.getPlaceOfDelivery(), "");
		ft.test("Origin Branch", job.getOriginBranch(), "");
		ft.test("Destination Branch", job.getDestinationBranch(), "");
		ft.test("Port of Loading", job.getPortOfLoading(), "");
		ft.test("Port of Discharge", job.getPortOfDischarge(), "");
		ft.test("Incoterms", job.getIncoterms(), "Select");
		ft.test("Incoterms Location", job.getIncotermsLocation(), "");
		
		// Main Tab
		
		// Parties
		ft.test("Parties Expanded State", job.isPartiesExpanded(), true);
		ft.test("Additional Parties Expanded State", job.isAdditionalPartiesExpanded(), false);
		
		ft.test("Shipper", job.getShipper(), "");
		ft.test("Shipper Movement Type", job.getShipperMovement(), "None");
		ft.test("Shipper Bill To Party", job.getShipperBillToParty(), "");
		ft.test("Shipper Billing Party", job.getShipperBillingParty(), "Select");
		
		ft.test("Consignee", job.getConsignee(), "");
		ft.test("Consignee Movement Type", job.getConsigneeMovement(), "None");
		ft.test("Consignee Bill To Party", job.getConsigneeBillToParty(), "");
		ft.test("Consignee Billing Party", job.getConsigneeBillingParty(), "Select");

		ft.test("Notify Party", job.getNotifyParty(), "");
		
		ft.test("Third Party", job.getThirdParty(), "");
		ft.test("Third Party Movement Type", job.getThirdPartyMovement(), "None");
		ft.test("Third Party Bill To Party", job.getThirdPartyBillToParty(), "");
		ft.test("Third Party Billing Party", job.getThirdPartyBillingParty(), "Select");
		
		// Links
		ft.test("Links Expanded State", job.isLinksExpanded(), true);
		ft.test("Reference Type", job.referenceType.get(), "Select");
		ft.test("Reference Type Has 12 Options", job.referenceType.getOptions().length, 12);
		ft.test("Reference Type Option 1 is Select", job.referenceType.getOptions()[0], "Select");
		ft.test("Reference Type Option 2 is Origin Collection", job.referenceType.getOptions()[1], "Origin Collection");
		ft.test("Reference Type Option 3 is Origin Delivery", job.referenceType.getOptions()[2], "Origin Delivery");
		ft.test("Reference Type Option 4 is Sales Order", job.referenceType.getOptions()[3], "Sales Order");
		ft.test("Reference Type Option 5 is Commercial Invoice", job.referenceType.getOptions()[4], "Commercial Invoice");
		ft.test("Reference Type Option 6 is Packing List", job.referenceType.getOptions()[5], "Packing List");
		ft.test("Reference Type Option 7 is Purchase Order", job.referenceType.getOptions()[6], "Purchase Order");
		ft.test("Reference Type Option 8 is Shippers Letter of Instructions", job.referenceType.getOptions()[7], "Shippers Letter of Instructions");
		ft.test("Reference Type Option 9 is Dispatch", job.referenceType.getOptions()[8], "Dispatch");
		ft.test("Reference Type Option 10 is Destination Collection", job.referenceType.getOptions()[9], "Destination Collection");
		ft.test("Reference Type Option 11 is Destination Delivery", job.referenceType.getOptions()[10], "Destination Delivery");
		ft.test("Reference Type Option 12 is Other", job.referenceType.getOptions()[11], "Other");
		ft.test("Reference Owner Has 6 Options", job.referenceOwner.getOptions().length, 6);
		ft.test("Reference Owner Option 1 is Select", job.referenceOwner.getOptions()[0], "Select");
		ft.test("Reference Owner Option 2 is Shipper", job.referenceOwner.getOptions()[1], "Shipper");
		ft.test("Reference Owner Option 3 is Consignee", job.referenceOwner.getOptions()[2], "Consignee");
		ft.test("Reference Owner Option 4 is Notify Party", job.referenceOwner.getOptions()[3], "Notify Party");
		ft.test("Reference Owner Option 5 is Third Party", job.referenceOwner.getOptions()[4], "Third Party");
		ft.test("Reference Owner Option 6 is Other", job.referenceOwner.getOptions()[5], "Other");
		ft.test("Reference Value", job.referenceValue.get(), "");
		
		//ft.test("References", job.getNumReferences(), 0);
		
		// Customer Requirements
		ft.test("Customer Requirements Expanded State", job.isCustomerRequirementsExpanded(), true);
		ft.test("Require Seaquest", job.getRequireSQSTBL(), true);
		ft.test("Require FCR", job.getRequireFCR(), false);
		ft.test("Require FCT", job.getRequireFCT(), false);
		ft.test("Required Seaquest Type", job.getRequiredSeaquestType(), "Select");
		ft.test("Invoice Value", job.getInvoiceValue(), "");
		ft.test("Invoice Currency", job.getInvoiceCurrency(), "");
		ft.test("Require Letter of Credit", job.getRequireLetterOfCredit(), false);
		ft.test("Require Insurance", job.getRequireInsurance(), false);
		ft.test("Origin Customs Clearance By", job.getOriginCustomsClearanceBy(), "Select");
		ft.test("Origin Customs Clearance By Name", job.getOriginCustomsClearanceByName(), "");
		ft.test("Destination Customs Clearance By", job.getDestinationCustomsClearanceBy(), "Select");
		ft.test("Destination Customs Clearance By Name", job.getDestinationCustomsClearanceByName(), "");
		ft.test("Cargo Available Date", job.getCargoAvailableDate(), "");
		ft.test("MBL Type", job.mblType.get(), "Select");
		ft.test("MBL Type Has 3 Options", job.mblType.getOptions().length, 3);
		ft.test("MBL Type Option 1 is Select", job.mblType.getOptions()[0], "Select");
		ft.test("MBL Type Option 2 is Express", job.mblType.getOptions()[1], "Express");
		ft.test("MBL Type Option 3 is Original", job.mblType.getOptions()[2], "Original");
		ft.test("MBL Terms", job.mblTerms.get(), "Select");
		ft.test("MBL Terms Has 3 Options", job.mblTerms.getOptions().length, 3);
		ft.test("MBL Terms Option 1 is Select", job.mblTerms.getOptions()[0], "Select");
		ft.test("MBL Terms Option 2 is Prepaid", job.mblTerms.getOptions()[1], "Prepaid");
		ft.test("MBL Terms Option 3 is Collect", job.mblTerms.getOptions()[2], "Collect");
		
		
		ft.test("Volumetric Ratio", job.getVolumetricRatio(), "1000");
		ft.test("Number of Euro Pallets", job.getNumberOfEuroPallets(), "");
		ft.test("Euro Pallet References", job.getEuroPalletReferences(), "");
		
		
		//TODO Tear down user/branch/schedule/job
	}
}
