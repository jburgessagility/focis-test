package workflowRunner;

import java.io.File;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkflowRunner {

	public static UIDriver uiDriver = new UIDriver();
	
	public static void main(String[] args) {
		
		
		/////////////////////////////////////////////////////////////////////////////////
		// Driver Setup
		/////////////////////////////////////////////////////////////////////////////////
		
		File file = new File("C:\\Users\\JBurgess\\Desktop\\IEDriverServer\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver = new InternetExplorerDriver();
//		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		uiDriver.setup(driver, wait);
		
		
		/////////////////////////////////////////////////////////////////////////////////
		// Workflow
		/////////////////////////////////////////////////////////////////////////////////
		
		UIJob job = new UIJob();
		job.blankJob();
		
		job.setShipper("AIA Engineering Limited");
		job.setShipperMovement("Door to CY (Point of Loading)");
		job.setConsignee("Presspart Manufacturing Ltd");
		job.setConsigneeMovement("CY (Point of Loading) to Door");
		job.setRequireFCR(true);

		job.setMeasurementSystem("Imperial");
		job.addUnits(4, "20' DC");
		job.setUnit(1, "MSCU1234566", 12.5, 4.2, 1.2, "Shipper", "Hi Janaki!", false);
		job.setUnit(2, "MSCU2345672", 14.2, 3.1, 4.6, "Shipper", "Hi Praveen!", false);
		job.setUnit(3, "MSCU3456789", 22.5, 4.2, 2.2, "Shipper", "Hi Ashwath!", false);
		job.setUnit(4, "MSCU4567895", 122.52, 120.2, 4.2, "Shipper", "Hi Phani!", false);
			
	} // main
} // WorkflowRunner
