package moes;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HeavyJobTestcase {
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
  public void testHeavyJobTestcase(WebDriver driver) throws Exception {
//  public void testHeavyJobTestcase() throws Exception {
	  String s ="";
	while(true){
	try{
	s=driver.getCurrentUrl();	
    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_lbParentItem > span")).click();
    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_rptSubMenu_ctl01_lbParentItem > span")).click();
    driver.findElement(By.id("MainSearchOrders")).clear();
    driver.findElement(By.id("MainSearchOrders")).sendKeys("100001910",Keys.ENTER);   
//    moes.analyse(driver.findElement(By.xpath("//tr[@id='2706']/td[21]/div/div/span")));
    int a = moes.analyse(driver.findElement(By.xpath("//tr[@id='2706']/td[21]/div/div/span")),"Heavy Job Load");
    //moes.analyse(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAdvancedSearchLs1_AdvancedSearchLs1_btnOrderOpen")));
    System.out.println("sucess heavy job ");
    break;
   	}catch(org.openqa.selenium.remote.UnreachableBrowserException | org.openqa.selenium.UnhandledAlertException | org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException | org.openqa.selenium.StaleElementReferenceException e){System.out.println("err heavy job");driver.get(moes.bburl);
   	driver.get(s);}}
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
