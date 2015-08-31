package workflowRunner;

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
	private WebDriver driver = new InternetExplorerDriver();
	private WebDriverWait wait = new WebDriverWait(driver, 30);
	static String Name = "Ocean Freight Workflow";
	private Timer timer;
	
	public void run(int laps) {
		
		timer = new Timer();
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		for (int i = 0; i < laps; i++) {
			
			System.out.println("Starting lap "+(i+1));
			String startingURL = "";
			
			timer.setMode("Load login page");
			
			while (true) {
				try {
					driver.get(WorkflowRunner.bburl);
					break;
				} catch (org.openqa.selenium.UnhandledAlertException e) {
					acceptAlerts();
					System.out.println("Error: " + e);
				}
			}
			wait.until(ExpectedConditions.elementToBeClickable((By.id("Login1_UserName"))));
		  
		  timer.setMode("Populate login page");
		  driver.findElement(By.id("Login1_UserName")).sendKeys(WorkflowRunner.accname);
		  driver.findElement(By.id("Login1_Password")).clear();
		  driver.findElement(By.id("Login1_Password")).sendKeys("q");
		  
		  timer.setMode("Load home page");
		  driver.findElement(By.id("Login1_LoginButton")).click();
			
	  	while(true) {
	  		try { 
	  			startingURL = driver.getCurrentUrl();		
	  			driver.get(WorkflowRunner.bburl);
	  			
	  			timer.setMode("Load template search");
			    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_lbParentItem > span")).click();
			    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_rptSubMenu_ctl03_lbParentItem > span")).click();
			    wait.until(ExpectedConditions.elementToBeClickable(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_drpProduct")));
			    
			    timer.setMode("Populate template search");
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_drpProduct"))).selectByVisibleText("Ocean Freight");
			    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_drpProductType"))).selectByVisibleText("FCL (NVOCC)");
			    
			    timer.setMode("Create blank job");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_btnCreateBooking")).click();
			    break;
	  		} 
	  		catch(org.openqa.selenium.UnhandledAlertException | org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException | org.openqa.selenium.remote.UnreachableBrowserException e ) {	
	  			System.out.println("Error: " + e);
	  			acceptAlerts();
	  			driver.get(startingURL);
	  			timer.retryMode();
	  		}
	  	}
	    while(true) {
	  		try {
			  	startingURL = driver.getCurrentUrl();		
			  	
			  	timer.setMode("Populate job header");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAglPlcOfRecCode")).sendKeys("inbom",Keys.TAB,Keys.TAB);
			    wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtPlaceOfReceipt"), "Mumbai (ex Bombay)"));
			    acceptAlerts();
			    
			    timer.setMode("Initiate job");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnCreate")).click();
			    break;
	  		} 
	  		catch(org.openqa.selenium.UnhandledAlertException | org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException | org.openqa.selenium.remote.UnreachableBrowserException e) {
	  			System.out.println("Error: " + e);
	  			acceptAlerts();
	  			driver.get(startingURL);
	  			timer.retryMode();
	  		}		
	  	}
	    while(true) {
	  		try {
	  			startingURL = driver.getCurrentUrl();
	  			
	  			timer.setMode("Populate main tab");
	  			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[10]")));
			    driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
			    driver.findElement(By.id("gs_StakeholderName")).sendKeys("aia");
			    driver.findElement(By.linkText("AIA Engineering Limited")).click();
			    new Select(driver.findElement(By.id("1_AgMovementTypeId"))).selectByVisibleText("Door to Door");
			    
			    timer.setMode("Preconfirm job");
			    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnPreConfirm")).click();
			    break;
	  		} 
	  		catch(org.openqa.selenium.UnhandledAlertException | org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException | org.openqa.selenium.remote.UnreachableBrowserException e ) {
	  			System.out.println("Error: " + e);
	  			acceptAlerts();
	  			driver.get(startingURL);
	  			timer.retryMode();
	  		}		
	  	}

	    timer.setMode("Log out");
  		driver.findElement(By.xpath("//div[@id='pnlheader']/div[2]/ul/li[5]/a/i")).click();		
			acceptAlerts();
			
	    
	    if (i != laps - 1) { timer.lap("Load login page"); };
	    
			System.out.println("Finished lap "+(i+1));
		}
	
		timer.stop();
	}

	public boolean acceptAlerts() 
	{ 
		while (true) {
	    try 
	    { 
	        driver.switchTo().alert().accept(); 
	        System.out.println("Accepted an alert");
	    }   // try 
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   // catch 
		}
	} 
	
}
