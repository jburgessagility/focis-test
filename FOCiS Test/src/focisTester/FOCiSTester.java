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
	
	protected static UIDriver uiDriver2;
	
	private String testCategory;
	private int testCount;
	private int passCount;
	private int failCount;
	
	public static UITemplateSearch templateSearch;
	public static UIJob job;
	public static UIUser user;
	public static UINavBar navBar;
	public static UIPartiesStakeholder stakeholder;
	public static UILocation location;
	public static UICarrierBooking carrierBooking;
	
	public FOCiSTester(HashMap<String, String> args) {
		FOCiSTester.args = args;
		uiDriver = new UIDriver(args);
		uiDriver2 = uiDriver;
		
		templateSearch = new UITemplateSearch(uiDriver);
		job = new UIJob(uiDriver);
		user = new UIUser(uiDriver);
		navBar = new UINavBar(uiDriver);
		stakeholder = new UIPartiesStakeholder(uiDriver);
		carrierBooking = new UICarrierBooking(uiDriver);
		testCount = 0;
		passCount = 0;
		failCount = 0;
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
	
	public void setTestCategory(String testCategory) { this.testCategory = testCategory; }
	
	public boolean test(String name, Object a, Object b) {
		testCount++;
		boolean result = a.equals(b);
		if (result) { 
			passCount++;
			System.out.println(testCount+" PASS : "+testCategory+" - "+name);
		} 
		else { 
			failCount++; 
			System.out.println(testCount+" FAIL : "+testCategory+" - "+name);
		}
		System.out.println("a="+a+", b="+b);
		return result;
	}

	public void printResults() {
		System.out.println("Count: "+testCount+", Pass: "+passCount+", Fail: "+failCount);
	}
}
