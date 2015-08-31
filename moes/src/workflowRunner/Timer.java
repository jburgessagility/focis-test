////////////////////////////////////////////////////////////////////////////////////////////////
// Timer
// Keeps track of how much time the browser spends where and doing what
////////////////////////////////////////////////////////////////////////////////////////////////

package workflowRunner;

public class Timer {

  // Properties
	private boolean isOn;
	private long base;
  private String mode;  
  private long modeBase;
  private String log;
 
  
  // Getters
  public boolean on() { return isOn; };
  public String mode() { return mode; }
  public String log() { return log; }
  public long time() { return System.currentTimeMillis() - base; }
  public long modeTime()  {return System.currentTimeMillis() - modeBase; }
 
  
  // Methods
  public void start(String newMode) {
  	
  	if (!isOn) { 
  		log = "Mode;Time\n";	
  		} else {
  		setMode(newMode);
  		
  	}
  	mode = newMode;
  	base = System.currentTimeMillis();
  	modeBase = base;
  	isOn = true;
  	
  }	
  
  public void setMode(String newMode) {
  	
  	if (mode == newMode) { return; }
  	if (!isOn) {
  		log = "Mode;Time\n";	
    	mode = newMode;
    	base = System.currentTimeMillis();
    	modeBase = base;
    	isOn = true;
    	return;
  	}
  	log += mode + ";" + (System.currentTimeMillis() - modeBase) + "\n";
  	mode = newMode;
  	modeBase = System.currentTimeMillis();
  	System.out.println("Total workflow time: "+time());
  	System.out.println(log);
  
  }
  
  public void lap(String newMode) {
  	
  	if (!isOn) { return; }
  	log += mode + ";" + (System.currentTimeMillis() - modeBase) + "\n";
  	log += "Workflow;" + (System.currentTimeMillis() - base) + "\n";
  	mode = newMode;
  	base = System.currentTimeMillis();
  	
  }
  
  public void stop() {
  	
  	if (!isOn) { return; }
  	log += mode + ";" + (System.currentTimeMillis() - modeBase) + "\n";
  	log += "Workflow;" + (System.currentTimeMillis() - base) + "\n";
  	isOn = false;
  	
  }
  
}
