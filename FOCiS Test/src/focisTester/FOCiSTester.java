package focisTester;

import java.util.HashMap;

/**
 * 
 * @author JBurgess
 *
 */
public class FOCiSTester {

	private static HashMap<String, String> args;
	private UIDriver uiDriver;
	
	public static UIJob job;
	public static UIUser user;
	public static UIStakeholder stakeholder;
	
	public FOCiSTester(HashMap<String, String> args) {
		FOCiSTester.args = args;
		uiDriver = new UIDriver(args);
		
		job = new UIJob(uiDriver);
		stakeholder = new UIStakeholder(uiDriver);
		//user = new UIUser(uiDriver);
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	// Getters
	/////////////////////////////////////////////////////////////////////////////////
	public static String getURL() { return args.get("url"); }
	public String getDefaultUser() { return args.get("defaultUser"); }
	public String getDefaultPassword() { return args.get("defaultPassword"); }
	public String getBrowser() { return args.get("browser"); }
	public String getBrowserVersion() { return args.get("browserVersion"); }
	public String getIEPath() { return args.get("iePath"); }
	
	
	public boolean test(String name, Object a, Object b) {
		boolean result = (a == b);
		output(name, result);
		return result;
	}
	
	private void output(String name, boolean result) {
		if (result) { 
			System.out.println(name+": Pass");
		} else { 
			System.out.println(name+": Fail"); 
		}
	}
}
