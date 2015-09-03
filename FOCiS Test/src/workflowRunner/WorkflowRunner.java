package workflowRunner;

import java.io.File;
import java.util.LinkedList;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkflowRunner {
	
	public static String bburl = "http://10.138.77.88:222/";
	public static String page = "DEV";
	public static String accname = "jburgess";
	public String browserName = "Firefox";
	public String browserVersion = "39";
	public static LinkedList<Long> datas = new LinkedList<Long>();
	public static String MAC;
	public static final String savedir="\\Desktop\\agilityBASEL\\";
	public static final String savedir2="\\Desktop\\attachi\\";
	public static UIDriver uiDriver = new UIDriver();
	
	public static void main(String[] args) {
		if(new File(System.getProperty("user.home")+savedir).mkdir());
		

//		Workflow workflow = new Workflow();
//		workflow.run(10);
		
		File file = new File("C:\\Users\\JBurgess\\Desktop\\IEDriverServer\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver = new InternetExplorerDriver();
//		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		uiDriver.setup(driver, wait);
		
		
		Job job = new Job();
		
		job.blankJob();
//		job.setShipper("AIA Engineering Limited");
//		job.setShipperMovement("Door to CY (Point of Loading)");
//		job.setConsignee("Presspart Manufacturing Ltd");
//		job.setConsigneeMovement("CY (Point of Loading) to Door");
//		job.setRequireFCR(true);

		//job.setMeasurementSystem("Imperial");
		job.addUnits(4, "20' DC");
		job.setUnit(1, "MSCU1234566", 12.5, 4.2, 1.2, "Shipper", "1234", false);
	
	} // main
} // WorkflowRunner
