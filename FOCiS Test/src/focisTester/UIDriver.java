package focisTester;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIDriver {

	private static final String USERNAME_XPATH = "//*[@id='Login1_UserName']";
	private static final String PASSWORD_XPATH = "//*[@id='Login1_Password']";
	private static final String PRODUCT_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_drpProduct']";
	private static final String PRODUCT_TYPE_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_drpProductType']";
	private static final String CREATE_BUTTON_XPATH = "//*[@id='PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_btnCreateBooking']";
	
	private WebDriver driver;
	private WebDriverWait wait;
	private Timer timer = new Timer();
	private HashMap<String, String> args;
	
	public void setup(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	} // setup
	
	public UIDriver(HashMap<String, String> args) {
		
		this.args = args;
		
		switch (this.args.get("browser")) {
			case "firefox":
				driver = new FirefoxDriver();
				break;
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "internetExplorer":
			default: 
				File file = new File(this.args.get("iePath"));
				System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
				driver = new InternetExplorerDriver(); 
		}
		wait = new WebDriverWait(driver, 30);
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	// Common navigation macros
	/////////////////////////////////////////////////////////////////////////////////
	
	public void login() {
		
		timer.setMode("Load Login Page");
		driver.get(args.get("url"));
		
		timer.setMode("Populate Login Page");
		
		driver.findElement(By.xpath(USERNAME_XPATH)).sendKeys("jburgess");
	  driver.findElement(By.xpath(PASSWORD_XPATH)).clear();
	  driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("q");
	  
	  timer.setMode("Load Home Page");
	  driver.findElement(By.id("Login1_LoginButton")).click();
	  
	} // login
	
	public void openTemplateSearch() {
		
		timer.setMode("Load Template Search");
		click("//a[@id='PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_lbParentItem']/span");
		click("//a[@id='PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_rptSubMenu_ctl03_lbParentItem']/span");
		//driver.findElement(By.xpath("//a[@id='PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_lbParentItem']/span")).click();
	  //driver.findElement(By.xpath("//a[@id='PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_rptSubMenu_ctl03_lbParentItem']/span")).click();
	  wait.until(ExpectedConditions.elementToBeClickable(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_drpProduct")));
	  
	} // openTemplateSearch
	
	public void startBlankJob(String product, String productType) {
		login();
		
		openTemplateSearch();
		
		timer.setMode("Populate Template Search");
		setDropdown(PRODUCT_XPATH, "Ocean Freight");
		setDropdown(PRODUCT_TYPE_XPATH, "FCL (NVOCC)");
		
		timer.setMode("Create Blank Job");
		clickAndWaitForElement(CREATE_BUTTON_XPATH, "//*[@id='1_PartyRow']");
  } // startBlankJob
	
	
	
	/////////////////////////////////////////////////////////////////////////////////
	// Safe navigation methods
	/////////////////////////////////////////////////////////////////////////////////
	
	public void navigateTo(String url) {
		while (true) {
			try {
				driver.get(url);
				break;
			}
			catch (Exception e) {
				//System.out.println(e);
			}
		}
	}
	
	public void selectFrame(String xpath) {
		while (true) {
			try {
				driver.switchTo().frame(driver.findElement(By.xpath(xpath)));
				break;
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public void selectRootFrame() {
		while (true) {
			try {
				driver.switchTo().parentFrame();
				break;
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
//	public void selectNewWindow() {
//		while (true) {
//			try {
//				for(String winHandle : driver.getWindowHandles()) {
//					System.out.println(winHandle);
//			    driver.switchTo().window(winHandle);
//				}
//				break;
//			}
//			catch (Exception e) {
//				System.out.println(e);
//			}
//		}
//	}
	
	public String getText(String xpath) {
		while (true) {
			try {
				return driver.findElement(By.xpath(xpath)).getText();
			}
			catch (Exception e) {
				//System.out.println(e);
			}
		}
	}
	
	public boolean hasClass(String xpath, String classToCheck) {
		while (true) {
			try {
				return driver.findElement(By.xpath(xpath)).getAttribute("class").contains(classToCheck);
			}
			catch (Exception e) {
				//System.out.println(e);
			}
		}
	}
	
	public String getNumericText(String xpath) {
		while (true) {
			try {
				return driver.findElement(By.xpath(xpath)).getAttribute("value");
			}
			catch (Exception e) {
				//System.out.println(e);
			}
		}
	}
	
	public String getValue(String xpath) {
		while (true) {
			try {
				return new Select(driver.findElement(By.xpath(xpath))).getFirstSelectedOption().getText();
			}
			catch (Exception e) {
				//System.out.println(e);
			}
		}
	}
	
	public void enterText(String xpath, String text) {
		while (true) {
			try {
				driver.findElement(By.xpath(xpath)).clear();
				driver.findElement(By.xpath(xpath)).sendKeys(text);
				break;
			}
			catch (Exception e) {
				//System.out.println(e);
			}
		}
		finishLoading();
	}
	
	public void pressTab(String xpath) {
		while (true) {
			try {
				driver.findElement(By.xpath(xpath)).sendKeys(Keys.TAB);
				break;
			}
			catch (Exception e) {
				//System.out.println(e);
			}
		}
		finishLoading();
	}
	
	public void clearText(String xpath) {
		while (true) {
			try {
				driver.findElement(By.xpath(xpath)).clear();
				break;
			}
			catch (Exception e) {
				//System.out.println(e);
			}
		}
		finishLoading();
	}

	public void click(String xpath) {
		while (true) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		finishLoading(); 
	}
	
	public boolean getCheckboxValue(String xpath) {
		while (true) {
			try {
    			return driver.findElement(By.xpath(xpath)).isSelected();
			}
			catch (Exception e) {
				//System.out.println(e);
			} // catch
		} // while
	} // setCheckbox
	
	public void setCheckbox(String xpath, boolean status) {
		while (true) {
			try {
				while (driver.findElement(By.xpath(xpath)).isSelected() != status) {
    			driver.findElement(By.xpath(xpath)).click();	
    		}	// while
				break;
			}
			catch (Exception e) {
				//System.out.println(e);
			}
		}
		finishLoading(); 
	} // setCheckbox
	
	public boolean isEditable(String xpath) {
		while (true) {
			try {
    			return driver.findElement(By.xpath(xpath)).isEnabled();
			}
			catch (Exception e) {
				//System.out.println(e);
			} // catch
		} // while
	}
	
	public boolean isVisible(String xpath) {
		while (true) {
			try {
    			return driver.findElement(By.xpath(xpath)).isDisplayed();
			}
			catch (Exception e) {
				//System.out.println(e);
			} // catch
		} // while
	} // isVisible
	
	public void setDropdown(String xpath, String selection) {
		while (true) {
			try {
				new Select(driver.findElement(By.xpath(xpath))).selectByVisibleText(selection);
				break;
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}

		finishLoading(); 
	} // setDropdown
	
	public String[] getDropdownOptions(String xpath) {
		while (true) {
			try {
				List<WebElement> list = new Select(driver.findElement(By.xpath(xpath))).getOptions();
				String[] options = new String[list.size()];
				for (int i = 0; i < list.size(); i++) {
					options[i] = list.get(i).getText();
				}
				return options;
			} catch (Exception e) {
			}
		}
	}
	
	public void clickAndOpenWindow(String xpath) {
		while (true) {
			try {
				while(driver.getWindowHandles().size() == 1) {
					driver.findElement(By.xpath(xpath)).click();
				}
				for(String winHandle : driver.getWindowHandles()) {
					//System.out.println(winHandle);
			    driver.switchTo().window(winHandle);
				}
				break;
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public void clickAndWaitForElement(String xpathToClick, String xpathToWait) {
		//System.out.println("xpathToClick: "+xpathToClick+", xpathToWait: "+xpathToWait);
		while (true) {
    	try {
    		driver.findElement(By.xpath(xpathToClick)).click();	
    		while (driver.findElement(By.xpath(xpathToWait)).getAttribute("display") == "none") {
    			driver.findElement(By.xpath(xpathToClick)).click();	
    		}
    		break;
    	} // try
    	catch (Exception e) {
    		//System.out.println(e);
    	} // catch
    } // while
		finishLoading(); 
	}
	
	public void clickAndWaitForText(String xpathToClick, String xpathToWait, String textToWait) {
		while (true) {
			try {
				if (driver.findElement(By.xpath(xpathToWait)).getText() != textToWait) {
					driver.findElement(By.xpath(xpathToClick)).click();
				} // if
				break;
			} // try
			catch (Exception e) {
				//System.out.println(e);
			} // catch
		} // while
		finishLoading(); 
	} // clickAndWaitForText
	
	public void clickAndWaitForClass(String xpathToClick, String classToWait) { clickAndWaitForClass(xpathToClick, xpathToClick, classToWait); }
	public void clickAndWaitForClass(String xpathToClick, String xpathToWait, String classToWait) {
		while (true) {
			try {
				if (!driver.findElement(By.xpath(xpathToWait)).getAttribute("class").contains(classToWait)) {
					driver.findElement(By.xpath(xpathToClick)).click();
				} // if
				break;
			} // try
			catch (Exception e) {
				//System.out.println(e);
			} // catch
		} // while
		finishLoading(); 
	} // clickAndWaitForClass
	
	public void finishLoading() {
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='load_AgilityReferencesGrid']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='load_GeneratedDocumentGrid']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='load_ToolsGridLs']")));
		
	} // finishLoading
	
	
} // UIDriver
