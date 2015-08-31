package moes;

public class Workflow {
	
	static String Name = "Ocean Freight Workflow";
	private Timer timer;
	private Recorder recorder;
	
	public void run(int laps) {
		
		for (int i = 0; i < laps; i++) {
			timer = new Timer();
			
			timer.start("Login");
			// Setup
			
			
			timer.setMode("Template Search");
			// step 1
			// validation 1
			// validation 2
			
			timer.setMode("New Job");
			// step 2
			// validation 3
			
			timer.setMode("Initiated Job");
			// step 3
			
			timer.setMode("Logout");
			
			if (i != laps - 1) { timer.lap("Login"); };
			
		}
		
		
		
		timer.stop();
		
		recorder.write(timer.log());
		
	}
	
}
