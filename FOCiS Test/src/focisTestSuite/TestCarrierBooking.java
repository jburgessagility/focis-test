package focisTestSuite;

import focisTester.FOCiSTester;
import focisTester.UICarrierBooking;
import focisTester.UIJob;

public class TestCarrierBooking {

	public static void run(FOCiSTester ft) {
		
		ft.setTestCategory("Carrier Booking");
		
		UIJob job = FOCiSTester.job;
		UICarrierBooking cb = FOCiSTester.carrierBooking;
		
		// Set up job
		job.blankJob();
		job.create();
		job.placeOfReceipt.setByCode("INBOM");
		job.placeOfDelivery.setByCode("GBLON");
		job.setShipper("AIA Engineering Limited");
		job.shipperMovementType.set("Door to Door");
		job.mblTerms.set("Original");
		job.addUnits(1, "20' DC");
		job.preconfirm();
		job.setMainCarriage();
		job.openCarrierBooking();
		
		// Check defaults from minimal job information
		
		//cb.setCarrierContractNo("hello");
		ft.test("MBL Terms Defaults from Job", cb.mblTerms.get(), "Original");
		ft.test("MBL Terms Has 3 Options", cb.mblTerms.getOptions().length, 3);
		ft.test("MBL Terms Option 1 is Select", cb.mblTerms.getOptions()[0], "Select");
		ft.test("MBL Terms Option 2 is Express", cb.mblTerms.getOptions()[1], "Express");
		ft.test("MBL Terms Option 3 is Original", cb.mblTerms.getOptions()[2], "Original");
		cb.save();
		cb.request();
		cb.print();
		cb.closePrintDialog();
	}
}
