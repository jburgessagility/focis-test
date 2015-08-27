package chrome;
import moes.moes;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestcaseLightJobC {
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
  public void testCaseLightJobC(WebDriver driver) throws Exception {
//	  public void testCaseLightJob() throws Exception {
	while(true){
	try{  
	//driver.get(moes.bburl); 
    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_lbParentItem > span")).click();
    driver.findElement(By.id("PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_rptSubMenu_ctl01_lbParentItem")).click();
    driver.findElement(By.id("MainSearchOrders")).clear();
    driver.findElement(By.id("MainSearchOrders")).sendKeys("100001901",Keys.ENTER);  
    int a= moes.analyse(driver.findElement(By.xpath("//tr[@id='2695']/td[21]/div/div/span")),"Light Job Load");
    System.out.println("sucess light job");
    break;
	}catch(org.openqa.selenium.UnhandledAlertException | org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException | org.openqa.selenium.StaleElementReferenceException  e ){System.out.println("err light job");driver.get(moes.bburl);}
	}
    //int a = moes.analyse(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAdvancedSearchLs1_AdvancedSearchLs1_btnOrderOpen")));
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
