package focisTestSuite;

import java.io.File;
import java.lang.reflect.Type;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import focisTester.FOCiSTester;
import focisTester.UIJob;

public class WorkflowRunner {

	public static void main(String[] args) {
		
		
		/////////////////////////////////////////////////////////////////////////////////
		// Setup
		/////////////////////////////////////////////////////////////////////////////////
		
		HashMap<String,String> params = new HashMap<String, String>();
		
//		File json = new File(".\testparams.json");
//		Gson gson = new Gson();
//		
//		Type stringStringMap = new TypeToken<HashMap<String, String>>(){}.getType();
//		params = gson.fromJson(json, params.getClass());

		params.put("url", "http://10.138.77.88:222/");
		params.put("browser", "internetExplorer");
		params.put("iePath", "C:\\Users\\JBurgess\\Desktop\\IEDriverServer\\IEDriverServer.exe");
				
		FOCiSTester ft = new FOCiSTester(params);
		
		UIJob job = FOCiSTester.job;
		
		
		/////////////////////////////////////////////////////////////////////////////////
		// Workflow
		/////////////////////////////////////////////////////////////////////////////////
		
		TestMain.run(ft);
		
		
//		job.blankJob();
//		
//		job.setShipper("AIA Engineering Limited");
//		job.setShipperMovement("Door to CY (Point of Loading)");
//		job.setConsignee("Presspart Manufacturing Ltd");
//		job.setConsigneeMovement("CY (Point of Loading) to Door");
//		job.setRequireFCR(true);
//		
//		ft.test("FCR Set", job.getRequireFCR(), true);
//
//		job.setMeasurementSystem("Imperial");
//		job.addUnits(4, "20' DC");
//		job.setUnit(1, "MSCU1234566", 12.5, 4.2, 1.2, "Shipper", "Hi Janaki!", false);
//		job.setUnit(2, "MSCU2345672", 14.2, 3.1, 4.6, "Shipper", "Hi Praveen!", false);
//		job.setUnit(3, "MSCU3456789", 22.5, 4.2, 2.2, "Shipper", "Hi Ashwath!", false);
//		job.setUnit(4, "MSCU4567895", 122.52, 120.2, 4.2, "Shipper", "Hi Phani!", false);
		
	} // main
} // WorkflowRunner
