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
  private int modeCount;
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
  		modeCount = 1;	
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
    	modeCount = 1;
    	return;
  	}
  	log += modeCount + ";" + mode + ";" + (System.currentTimeMillis() - modeBase) + "\n";
  	
  	printMode();
  	
  	mode = newMode;
  	modeCount++;
  	modeBase = System.currentTimeMillis();

  }
  
  public void lap(String newMode) {
  	
  	if (!isOn) { return; }
  	log += modeCount + ";" + mode + ";" + (System.currentTimeMillis() - modeBase) + "\n";
  	log += "0;Workflow;" + (System.currentTimeMillis() - base) + "\n";
  	
  	printMode();
  	System.out.println("Total workflow " + (System.currentTimeMillis() - base));
  	
  	mode = newMode;
  	modeCount = 1;
  	base = System.currentTimeMillis();
  	
  }
  
  public void stop() {
  	
  	if (!isOn) { return; }
  	log += mode + ";" + (System.currentTimeMillis() - modeBase) + "\n";
  	log += "Workflow;" + (System.currentTimeMillis() - base) + "\n";
  	log = "Mode;Time\n" + log;	
  	printMode();
  	
  	System.out.println("Workflow " + (System.currentTimeMillis() - base));
  	System.out.format(" %3s %-29s %,5.1f%n", "   ", "Total Workflow", (float) (System.currentTimeMillis() - base) / 1000);
  	
  	
  	isOn = false;
  	
  	
  }
  
  public void retryMode() {
  	long modeTime = System.currentTimeMillis() - modeBase;
  	base += modeTime;
  	modeBase += modeTime;
  }
  
  private void printMode() {
  	System.out.format(" %03d %-29s %,5.1f%n", modeCount, mode, (float) (System.currentTimeMillis() - modeBase) / 1000);
  }
  
}
