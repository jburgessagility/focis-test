package workflowRunner;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Workflow {
	private WebDriver driver;
	
	
	private WebDriverWait wait;
	static String Name = "Ocean Freight Workflow";
	private Timer timer;
	
	public void run(int numLaps) {
		File file = new File("C:\\Users\\JBurgess\\Desktop\\IEDriverServer\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		driver = new InternetExplorerDriver();
		wait = new WebDriverWait(driver, 30);
		
		timer = new Timer();
	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
		for (int i = 0; i < numLaps; i++) {
			
			System.out.println("----------------- Lap "+(i+1) + " -----------------");
			String startingURL = "";
			
			timer.setMode("Load Login Page");
			
			while (true) {
				try {
					driver.get(WorkflowRunner.bburl);
					break;
				} // try 
				catch (org.openqa.selenium.UnhandledAlertException e) {
					acceptAlerts();
					System.out.println("Error: " + e);
				} // catch
			} // while
			wait.until(ExpectedConditions.elementToBeClickable((By.id("Login1_UserName"))));
		  
		  timer.setMode("Populate Login Page");
		  driver.findElement(By.id("Login1_UserName")).sendKeys(WorkflowRunner.accname);
		  driver.findElement(By.id("Login1_Password")).clear();
		  driver.findElement(By.id("Login1_Password")).sendKeys("q",Keys.ENTER);
		  
		  timer.setMode("Load Home Page");
		  driver.findElement(By.id("Login1_LoginButton")).click();
			
	  	while(true) {
	  		try { 
	  			startingURL = driver.getCurrentUrl();		
	  			driver.get(WorkflowRunner.bburl);
	  			
	  			wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_lbParentItem > span"))));
	  			timer.setMode("Load Template Search");
			    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_lbParentItem > span")).click();
			    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_rptSubMenu_ctl03_lbParentItem > span")).click();
			    wait.until(ExpectedConditions.elementToBeClickable(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_drpProduct")));
			    
			    timer.setMode("Populate Template Search");
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_drpProduct"))).selectByVisibleText("Ocean Freight");
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_drpProductType"))).selectByVisibleText("FCL (NVOCC)");
			    
			    timer.setMode("Create Blank Job");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_btnCreateBooking")).click();
			    break;
	  		} // try
	  		catch(org.openqa.selenium.UnhandledAlertException | org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException | org.openqa.selenium.remote.UnreachableBrowserException e ) {	
	  			System.out.println("Error: " + e);
	  			acceptAlerts();
	  			driver.get(startingURL);
	  			timer.retryMode();
	  		} // catch
	  	} // while
	    while(true) {
	  		try {
			  	startingURL = driver.getCurrentUrl();		
			  	
			  	timer.setMode("Populate Job Header");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAglPlcOfRecCode")).sendKeys("inbom",Keys.TAB,Keys.TAB);
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAglPlcOfDelCode")).sendKeys("gblon",Keys.TAB,Keys.TAB);
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpTerms"))).selectByVisibleText("FOB - Free On Board");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtTermsLocation")).sendKeys("Nhava Sheva");
			    
			    wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtPlaceOfReceipt"), "Mumbai (ex Bombay)"));
			    wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtPlaceOfDelivery"), "London"));
			    acceptAlerts();
			    
			    timer.setMode("Initiate Job");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnCreate")).click();
			    break;
	  		} // try
	  		catch(org.openqa.selenium.UnhandledAlertException | org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException | org.openqa.selenium.remote.UnreachableBrowserException e) {
	  			System.out.println("Error: " + e);
	  			acceptAlerts();
	  			driver.get(startingURL);
	  			timer.retryMode();
	  		}	// catch	
	  	} // while
	    while(true) {
	  		try {
	  			startingURL = driver.getCurrentUrl();
	  			
	  			timer.setMode("Populate Main Tab");
	  			
	  			// Shipper
	  			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[10]")));
			    driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
			    driver.findElement(By.id("gs_StakeholderName")).sendKeys("aia");
			    driver.findElement(By.linkText("AIA Engineering Limited")).click();
			    new Select(driver.findElement(By.id("1_AgMovementTypeId"))).selectByVisibleText("Door to CY (Point of Loading)");

			    // Consignee
			    driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
			    driver.findElement(By.id("gs_StakeholderName")).sendKeys("press");
			    driver.findElement(By.linkText("Presspart Manufacturing Ltd")).click();
			    new Select(driver.findElement(By.id("2_AgMovementTypeId"))).selectByVisibleText("CY (Point of Loading) to Door");
			    
			    // References
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpAgilityRefType"))).selectByVisibleText("Shipper");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAgilityRefValue")).sendKeys("shipper ref");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnAddAgilityReferences")).click();
			    
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpAgilityRefType"))).selectByVisibleText("Consignee");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAgilityRefValue")).sendKeys("consignee ref");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnAddAgilityReferences")).click();
			    
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpAgilityRefType"))).selectByVisibleText("Notify Party");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAgilityRefValue")).sendKeys("notify party ref");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnAddAgilityReferences")).click();
			    
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpAgilityRefType"))).selectByVisibleText("Collection");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAgilityRefValue")).sendKeys("collection ref");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnAddAgilityReferences")).click();
			    
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpAgilityRefType"))).selectByVisibleText("Delivery");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAgilityRefValue")).sendKeys("delivery ref");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnAddAgilityReferences")).click();
			    
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpAgilityRefType"))).selectByVisibleText("Final Agent");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAgilityRefValue")).sendKeys("final agent ref");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnAddAgilityReferences")).click();
			    
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpAgilityRefType"))).selectByVisibleText("Letter of Credit");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAgilityRefValue")).sendKeys("letter of credit ref");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnAddAgilityReferences")).click();
			    
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpAgilityRefType"))).selectByVisibleText("Euro Pallet");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAgilityRefValue")).sendKeys("euro pallet ref");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnAddAgilityReferences")).click();
			    
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpAgilityRefType"))).selectByVisibleText("Purchase Order");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAgilityRefValue")).sendKeys("purchase order ref");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnAddAgilityReferences")).click();
			    
			    // Customer requirements
			    while (!driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_ChkDocumentType2")).isSelected()) {
			    	driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_ChkDocumentType2")).click();	
			    }			    
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_ChkDocumentType3")).click();
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_drpCustomerReqBLType"))).selectByVisibleText("Original");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtInvoiceValue")).sendKeys("123");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtInvoiceCurrency_btnPopup")).click();
			    driver.findElement(By.linkText("UAE Dirham")).click();
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_chkLC")).click();
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_chkInsuranceReq")).click();
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_drpOriginClearanceBy"))).selectByVisibleText("Agility");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtOriginLocation")).sendKeys("agility origin");
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_drpDestClearanceBy"))).selectByVisibleText("Agility");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtDestLocation")).sendKeys("agility destination");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtCargoAvailableDate")).sendKeys("01-Jan-2015");
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtMBLType"))).selectByVisibleText("Original");
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtMBLTerms"))).selectByVisibleText("Prepaid");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtNoOfEuroPallets")).sendKeys("99");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_BookingAddlDetailsFr1_txtEuroPalletReference")).sendKeys("euro pallet refs");
			    
			    timer.setMode("Preconfirm Job");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnPreConfirm")).click();
			    break;
	  		} // try 
	  		catch(org.openqa.selenium.UnhandledAlertException | org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException | org.openqa.selenium.remote.UnreachableBrowserException e ) {
	  			System.out.println("Error: " + e);
	  			acceptAlerts();
	  			driver.get(startingURL);
	  			timer.retryMode();
	  		}	// catch	
	  	} // while

	    timer.setMode("Load Logout Page");
  		//driver.findElement(By.xpath("//div[@id='pnlheader']/div[2]/ul/li[5]/a/i")).click();		
  		driver.findElement(By.className("logout")).click();
			acceptAlerts();
			
	    
	    if (i != numLaps - 1) { timer.lap("Load Login Page"); };
	    
			System.out.println("\n");
		} // for
	
		timer.stop();
	} // run

	public boolean acceptAlerts() { 
		while (true) {
	    try { 
	        driver.switchTo().alert().accept(); 
	        System.out.println("Accepted an alert");
	    } // try 
	    catch (NoAlertPresentException Ex) { 
	        return false; 
	    } // catch 
		} // while
	} // acceptAlerts
	
} // Workflow
