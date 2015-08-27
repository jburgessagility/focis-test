package moes;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchron implements Runnable  {
	
		   private Thread t;
		   private String threadName;
		   private int fall;
		   private int browser;
		   private String version ="";
		   synchron(int a, int b, String version){
			   this.fall=a;
			   this.browser=b;
			   this.version = version;
		       threadName = "~~~~~~~~~~I'm waking up....get ready~~~~~~~~~~";
		       
//		       System.out.println("Creating " +  threadName );
		   }
		   public void run() {
		      try {
		    	  WebDriver driver;
		    	  if(browser==0){
//		    		  				FirefoxBinary binary = new FirefoxBinary(new File(System.getProperty("user.home")+"\\Desktop\\Mozilla Firefox\\firefox.exe"));
		    		  				FirefoxBinary binary = new FirefoxBinary(new File(System.getProperty("user.home")+"\\Desktop\\FireFOX\\"+version+"\\firefox.exe"));
								 	FirefoxProfile profile = new FirefoxProfile();
								 	driver = new FirefoxDriver(binary, profile);
								 	System.out.println("~~~~~~~~~~~~running FOX~~~~~~~~~~~~");
		    	  }else if(browser==1){
			    		  			File file = new File("C:\\Users\\astuder\\Desktop\\IEDriverServer.exe");
						  			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
						  			driver = new InternetExplorerDriver();
						  			System.out.println("~~~~~~~~~~~~space exploration~~~~~~~~~~~~");
		    	  }else if(browser==2){	
						    		File uu = new File("C:\\Users\\astuder\\Desktop\\IEDriverServer.exe");
							  		System.setProperty("webdriver.ie.driver", uu.getAbsolutePath());
							  		driver = new InternetExplorerDriver();
							  		System.out.println("~~~~~~~~~~~~wrong Chrome~~~~~~~~~~~~");
		    	  }else {
		    		    FirefoxBinary binary = new FirefoxBinary(new File(System.getProperty("user.home")+"\\Desktop\\FireFOX\\"+version+"\\firefox.exe"));
					 	FirefoxProfile profile = new FirefoxProfile();
					 	driver = new FirefoxDriver(binary, profile);
					 	System.out.println("~~~~~~~~~~~~running FOX~~~~~~~~~~~~");
		    	  }
//		    	  System.out.println(fall);
//	                case 2:  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\astuder\\Desktop\\chormemaster\\chromedriver.exe");
//	        					driver = new ChromeDriver();
		    	    WebDriverWait wait = new WebDriverWait(driver, 20);
//		            System.out.println("Thread: " + threadName + ", " + i);
		            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    	    driver.get(moes.bburl + "/login.aspx?ReturnUrl=%2f");
		    	    wait.until(ExpectedConditions.elementToBeClickable((By.id("Login1_UserName"))));
//		    	    driver.findElement(By.id("Login1_UserName")).clear();
		    	    driver.findElement(By.id("Login1_UserName")).sendKeys(moes.accname);
		    	    driver.findElement(By.id("Login1_Password")).clear();
		    	    driver.findElement(By.id("Login1_Password")).sendKeys("q");
		    	    driver.findElement(By.id("Login1_LoginButton")).click();
		    	    TIMER ast = new TIMER(driver);
		    	    System.out.println("Browser "+browser);
		    	    System.out.println("FALL "+fall);
		    	    while(true) {
//		            String monthString;
//		    		TestcaseInitiate ee = new TestcaseInitiate();
//		    		PreconfirmedTestcase f = new PreconfirmedTestcase();
		    		
					 // 3 in 1
					//testjob.start(driver);
					//f.testPreconfirmedTestcase(driver);
					
		    		switch (browser) {
		    			case 0:
				            switch (fall) {
				            				
				                case 0:  //System.out.println("1");
				                		 TestcaseInitiate west = new TestcaseInitiate();
				                	     west.testCaseInitiate(driver);
				                         break;
				                case 1:  //System.out.println("2");
				                		 HeavyJobTestcase s = new HeavyJobTestcase();
				                		 s.testHeavyJobTestcase(driver);
				                         break;
				                case 2:  //System.out.println("3");
				                		 TestcaseLightJob d = new TestcaseLightJob();
				                		 d.testCaseLightJob(driver);
				                         break;
				                case 3:  //System.out.println("4");
				                		 NewFromTemplate k = new NewFromTemplate();
				                		 k.testNewFromTemplate(driver);
				                         break;
				            }
				            break;
				            
				       case 1:
				    	   switch (fall) {
			                case 0:  //System.out.println("5");
			                		 ie.TestcaseInitiateIE west = new ie.TestcaseInitiateIE();
			                	     west.testCaseInitiateIE(driver);
			                         break;
			                case 1:  //System.out.println("6");
			                		 ie.HeavyJobTestcaseIE s = new ie.HeavyJobTestcaseIE();
			                		 s.testHeavyJobTestcaseIE(driver);
			                         break;
			                case 2:  //System.out.println("7");
			                	 	 ie.TestcaseLightJobIE d = new ie.TestcaseLightJobIE();
			                		 d.testCaseLightJobIE(driver);
			                         break;
			                case 3:  //System.out.println("8");
			                		 ie.NewFromTemplateIE k = new ie.NewFromTemplateIE();
			                		 k.testNewFromTemplateIE(driver);
			                         break;
				       }
				    	   break;
		    		}
		            // Let the thread sleep for a while.
		            Thread.sleep(1);
		         }
		     } catch (InterruptedException e) {
		         System.out.println("Thread " +  threadName + " interrupted.");
		     } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     System.out.println("Thread " +  threadName + " exiting.");
		   }
		   
		   public void start ()
		   {
		      System.out.println("Starting " +  threadName );
		      if (t == null)
		      {
		         t = new Thread (this, threadName);
		         t.start ();
		      }
		   }

		}
