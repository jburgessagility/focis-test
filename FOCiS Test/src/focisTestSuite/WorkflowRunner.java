package focisTestSuite;

import java.util.HashMap;
import focisTester.FOCiSTester;

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
//		params.put("url", "http://focissit.agility.com/");
//		params.put("url", "http://focisagile.agility.com/");
		params.put("browser", "internetExplorer");
		params.put("iePath", "C:\\Users\\JBurgess\\Desktop\\IEDriverServer\\IEDriverServer.exe");
				
		FOCiSTester ft = new FOCiSTester(params);
		
		/////////////////////////////////////////////////////////////////////////////////
		// Workflow
		/////////////////////////////////////////////////////////////////////////////////
		
//		TestJob.run(ft);
		
		TestCarrierBooking.run(ft);
		ft.printResults();
		
	} // main
} // WorkflowRunner
