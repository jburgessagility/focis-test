package focisTestSuite;

import focisTester.FOCiSTester;
import focisTester.UIJob;

public class TestMain {

	public static void run(FOCiSTester ft) {
		UIJob job = FOCiSTester.job;
		
		job.blankJob();
		
		// Job Header
		ft.setTestCategory("Blank Job Header Values");
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
		ft.setTestCategory("Blank Job Main Values");
		
		// Parties
		ft.test("Parties Expanded State", job.isPartiesExpanded(), true);
		ft.test("Shipper", job.getShipper(), "");
		ft.test("Shipper Movement Type", job.getShipperMovement(), "None");
		ft.test("Shipper Bill To Party", job.getShipperBillToParty(), "");
		ft.test("Shipper Billing Party", job.getShipperBillingParty(), "Select");
		
		ft.test("Consignee", job.getConsignee(), "");
		ft.test("Consignee Movement Type", job.getConsigneeMovement(), "None");
		ft.test("Consignee Bill To Party", job.getConsigneeBillToParty(), "");
		ft.test("Consignee Billing Party", job.getConsigneeBillingParty(), "Select");

		//TODO Notify party
		
		//TODO Third party
		
		
		// Links
		ft.test("Links Expanded State", job.isLinksExpanded(), true);
		
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
		ft.test("MBL Type", job.getMBLType(), "Select");
		ft.test("MBL Terms", job.getMBLTerms(), "Select");
		ft.test("Volumetric Ratio", job.getVolumetricRatio(), "1000");
		ft.test("Number of Euro Pallets", job.getNumberOfEuroPallets(), "");
		ft.test("Euro Pallet References", job.getEuroPalletReferences(), "");
	}
}
