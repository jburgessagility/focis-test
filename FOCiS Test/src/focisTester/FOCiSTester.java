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
	
	private String testCategory;
	
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
	
	public void setTestCategory(String testCategory) {
		this.testCategory = testCategory;
	}
	
	public boolean test(String name, Object a, Object b) {
		boolean result = a.equals(b);
		output(name, result);
		//System.out.println(a+" = "+b+" ?");
		return result;
	}
	
	private void output(String name, boolean result) {
		if (result) { 
			System.out.println("PASS : "+testCategory+" - "+name);
		} else { 
			System.out.println("FAIL : "+testCategory+" - "+name); 
		}
	}
}
