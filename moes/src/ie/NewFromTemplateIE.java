package ie;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import workflowRunner.WorkflowRunner;
public class NewFromTemplateIE {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://focissit.agility.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testNewFromTemplateIE(WebDriver driver) throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, 3);
		while(true){
			try{  
//	  public void testNewFromTemplate() throws Exception {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_lbParentItem > i.nav-arrow.icon-chevron-down")));
    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_lbParentItem > i.nav-arrow.icon-chevron-down")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_rptSubMenu_ctl03_lbParentItem")));
    driver.findElement(By.id("PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_rptSubMenu_ctl03_lbParentItem")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='100000023']/td[18]/div/div/span")));
    WorkflowRunner.analyse(driver.findElement(By.xpath("//tr[@id='100000023']/td[18]/div/div/span")),"Create Job From Template");
    System.out.println("sucess new Form Template");
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_btnCreateJobFromTemplate")));
    //int i = moes.analyse(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_btnCreateJobFromTemplate")));
    break;
			}catch(org.openqa.selenium.UnhandledAlertException | org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException | org.openqa.selenium.StaleElementReferenceException  e ){System.out.println("err nft");driver.get(WorkflowRunner.bburl);}}
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
