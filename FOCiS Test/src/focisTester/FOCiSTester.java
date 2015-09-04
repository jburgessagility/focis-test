package focisTester;

import java.util.HashMap;

/**
 * 
 * @author JBurgess
 *
 */
public class FOCiSTester {

	private HashMap<String, String> args;
	private UIDriver uiDriver;
	
	public static UIJob job;
	public static UIUser user;
	public static UIStakeholder stakeholder;
	
	public FOCiSTester(HashMap<String, String> args) {
		this.args = args;
		uiDriver = new UIDriver(args);
		
		job = new UIJob(uiDriver);
		stakeholder = new UIStakeholder(uiDriver);
		//user = new UIUser(uiDriver);
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	// Getters
	/////////////////////////////////////////////////////////////////////////////////
	public String getURL() { return args.get("url"); }
	public String getDefaultUser() { return args.get("defaultUser"); }
	public String getDefaultPassword() { return args.get("defaultPassword"); }
	public String getBrowser() { return args.get("browser"); }
	public String getBrowserVersion() { return args.get("browserVersion"); }
	public String getIEPath() { return args.get("iePath"); }
}
