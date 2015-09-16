package focisTestSuite;

import focisTester.FOCiSTester;
import focisTester.UIJob;

public class TestJob {

	public static void run(FOCiSTester ft) {
		
		ft.setTestCategory("Job");
		
		UIJob job = FOCiSTester.job;
		
		job.blankJob();
		
		// Job Header
		ft.test("Job Header default is Expanded State", job.isJobHeaderExpanded(), true);
		
		ft.test("Product default is Ocean Freight", job.product.get(), "Ocean Freight");
		ft.test("Product Type default is FCL (NVOCC)", job.productType.get(), "FCL (NVOCC)");
		ft.test("Place of Receipt default is (blank)", job.getPlaceOfReceipt(), "");
		ft.test("Place of Delivery default is (blank)", job.getPlaceOfDelivery(), "");
		ft.test("Origin Branch default is (blank)", job.getOriginBranch(), "");
		ft.test("Destination Branch default is (blank)", job.getDestinationBranch(), "");
		ft.test("Port of Loading default is (blank)", job.getPortOfLoading(), "");
		ft.test("Port of Discharge default is (blank)", job.getPortOfDischarge(), "");
		
		ft.test("Incoterms default is Select", job.incoterms.get(), "Select");
		ft.test("Incoterms Location default is (blank)", job.incotermsLocation.get(), "");
		
		// Main Tab
		
		// Parties
		ft.test("Parties default is Expanded State", job.isPartiesExpanded(), true);
		ft.test("Additional Parties default is Collapsed State", job.isAdditionalPartiesExpanded(), false);
		
		ft.test("Shipper default is (blank)", job.getShipper(), "");
		ft.test("Shipper Movement Type default is None", job.getShipperMovement(), "None");
		ft.test("Shipper Bill To Party default is (blank)", job.getShipperBillToParty(), "");
		ft.test("Shipper Billing Party default is Select", job.getShipperBillingParty(), "Select");
		
		ft.test("Consignee default is (blank)", job.getConsignee(), "");
		ft.test("Consignee Movement Type default is None", job.getConsigneeMovement(), "None");
		ft.test("Consignee Bill To Party default is (blank)", job.getConsigneeBillToParty(), "");
		ft.test("Consignee Billing Party default is Select", job.getConsigneeBillingParty(), "Select");

		ft.test("Notify Party", job.getNotifyParty(), "");
		
		ft.test("Third Party default is (blank)", job.getThirdParty(), "");
		ft.test("Third Party Movement Type default is None", job.getThirdPartyMovement(), "None");
		ft.test("Third Party Bill To Party default is (blank)", job.getThirdPartyBillToParty(), "");
		ft.test("Third Party Billing Party default is Select", job.getThirdPartyBillingParty(), "Select");
		
		// Links
		ft.test("Links default is Expanded State", job.isLinksExpanded(), true);
		
		ft.test("Reference Type default is Select", job.referenceType.get(), "Select");
		ft.test("Reference Type has 12 options", job.referenceType.getOptions().length, 12);
		ft.test("Reference Type option 1 is Select", job.referenceType.getOptions()[0], "Select");
		ft.test("Reference Type option 2 is Origin Collection", job.referenceType.getOptions()[1], "Origin Collection");
		ft.test("Reference Type option 3 is Origin Delivery", job.referenceType.getOptions()[2], "Origin Delivery");
		ft.test("Reference Type option 4 is Sales Order", job.referenceType.getOptions()[3], "Sales Order");
		ft.test("Reference Type option 5 is Commercial Invoice", job.referenceType.getOptions()[4], "Commercial Invoice");
		ft.test("Reference Type option 6 is Packing List", job.referenceType.getOptions()[5], "Packing List");
		ft.test("Reference Type option 7 is Purchase Order", job.referenceType.getOptions()[6], "Purchase Order");
		ft.test("Reference Type option 8 is Shippers Letter of Instructions", job.referenceType.getOptions()[7], "Shippers Letter of Instructions");
		ft.test("Reference Type option 9 is Dispatch", job.referenceType.getOptions()[8], "Dispatch");
		ft.test("Reference Type option 10 is Destination Collection", job.referenceType.getOptions()[9], "Destination Collection");
		ft.test("Reference Type option 11 is Destination Delivery", job.referenceType.getOptions()[10], "Destination Delivery");
		ft.test("Reference Type option 12 is Other", job.referenceType.getOptions()[11], "Other");
		
		ft.test("Reference Owner default is Select", job.referenceOwner.get(), "Select");
		ft.test("Reference Owner has 6 options", job.referenceOwner.getOptions().length, 6);
		ft.test("Reference Owner option 1 is Select", job.referenceOwner.getOptions()[0], "Select");
		ft.test("Reference Owner option 2 is Shipper", job.referenceOwner.getOptions()[1], "Shipper");
		ft.test("Reference Owner option 3 is Consignee", job.referenceOwner.getOptions()[2], "Consignee");
		ft.test("Reference Owner option 4 is Notify Party", job.referenceOwner.getOptions()[3], "Notify Party");
		ft.test("Reference Owner option 5 is Third Party", job.referenceOwner.getOptions()[4], "Third Party");
		ft.test("Reference Owner option 6 is Other", job.referenceOwner.getOptions()[5], "Other");
		
		ft.test("Reference Value", job.referenceValue.get(), "");
		
		//ft.test("References", job.getNumReferences(), 0);
		
		// Customer Requirements
		ft.test("Customer Requirements default is Expanded State", job.isCustomerRequirementsExpanded(), true);
		ft.test("Require Seaquest default is Checked", job.requireSeaquest.get(), true);
		ft.test("Require FCR default is Unchecked", job.requireFCR.get(), false);
		ft.test("Require FCT default is Unchecked", job.requireFCT.get(), false);
		ft.test("Required Seaquest Type default is Select", job.requiredSeaquestType.get(), "Select");
		ft.test("Invoice Value default is (blank)", job.getInvoiceValue(), "");
		ft.test("Invoice Currency default is (blank)", job.getInvoiceCurrency(), "");
		ft.test("Require Letter of Credit default is Unchecked", job.requireLetterOfCredit.get(), false);
		ft.test("Require Insurance default is Unchecked", job.requireInsurance.get(), false);
		ft.test("Origin Customs Clearance By default is Select", job.originCustomsClearanceBy.get(), "Select");
		ft.test("Origin Customs Clearance By Name default is (blank)", job.originCustomsClearanceByName.get(), "");
		ft.test("Destination Customs Clearance By default is Select", job.destinationCustomsClearanceBy.get(), "Select");
		ft.test("Destination Customs Clearance By Name default is (blank)", job.destinationCustomsClearanceByName.get(), "");
		ft.test("Cargo Available Date default is (blank)", job.getCargoAvailableDate(), "");
		
		ft.test("MBL Type default is Select", job.mblType.get(), "Select");
		ft.test("MBL Type has 3 options", job.mblType.getOptions().length, 3);
		ft.test("MBL Type option 1 is Select", job.mblType.getOptions()[0], "Select");
		ft.test("MBL Type option 2 is Express", job.mblType.getOptions()[1], "Express");
		ft.test("MBL Type option 3 is Original", job.mblType.getOptions()[2], "Original");
		
		ft.test("MBL Terms", job.mblTerms.get(), "Select");
		String[] mblTerms = { "Select", "Prepaid", "Collect" };
		ft.test("MBL Terms has 3 options", job.mblTerms.getOptions().length, 3);
		ft.test("MBL Terms option 1 is Select", job.mblTerms.getOptions()[0], "Select");
		ft.test("MBL Terms option 2 is Prepaid", job.mblTerms.getOptions()[1], "Prepaid");
		ft.test("MBL Terms option 3 is Collect", job.mblTerms.getOptions()[2], "Collect");
		
		ft.test("Volumetric Ratio default is 1000", job.getVolumetricRatio(), "1000");
		ft.test("Number of Euro Pallets default is (blank)", job.getNumberOfEuroPallets(), "");
		ft.test("Euro Pallet References default is (blank)", job.euroPalletReferences.get(), "");
		
	}
}
