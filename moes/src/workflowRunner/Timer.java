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
  		log = "";
    	mode = newMode;
    	base = System.currentTimeMillis();
    	modeBase = base;
    	isOn = true;
    	return;
  	}
  	log += mode + ";" + (System.currentTimeMillis() - modeBase) + "\n";
  	
  	System.out.println(mode + ";" + (System.currentTimeMillis() - modeBase));
  	
  	mode = newMode;
  	modeBase = System.currentTimeMillis();

  }
  
  public void lap(String newMode) {
  	
  	if (!isOn) { return; }
  	log += mode + ";" + (System.currentTimeMillis() - modeBase) + "\n";
  	log += "Workflow;" + (System.currentTimeMillis() - base) + "\n";
  	
  	System.out.println(mode + ";" + (System.currentTimeMillis() - modeBase));
  	System.out.println("Total workflow;" + (System.currentTimeMillis() - base));
  	
  	mode = newMode;
  	base = System.currentTimeMillis();
  	
  }
  
  public void stop() {
  	
  	if (!isOn) { return; }
  	log += mode + ";" + (System.currentTimeMillis() - modeBase) + "\n";
  	log += "Workflow;" + (System.currentTimeMillis() - base) + "\n";
  	log = "Mode;Time\n" + log;	
  	System.out.println(mode + ";" + (System.currentTimeMillis() - modeBase));
  	System.out.println("Workflow;" + (System.currentTimeMillis() - base));
  	
  	
  	
  	isOn = false;
  	
  	
  }
  
  public void retryMode() {
  	long modeTime = System.currentTimeMillis() - modeBase;
  	base += modeTime;
  	modeBase += modeTime;
  }
  
}
