package moes;
import ie.*;


import java.util.regex.Pattern;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileSystemView;

import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class moes {

	
	
	public static String bburl = "http://10.138.77.88:222/";
	public static String page = "DEV";
	public static String accname = "jburgess";
	public static LinkedList<Long> datas = new LinkedList<Long>();
	public static String MAC;
	public static final String savedir="\\Desktop\\agilityBASEL\\";
	public static final String savedir2="\\Desktop\\attachi\\";
	public static void main(String[] args) {
		if(new File(System.getProperty("user.home")+savedir).mkdir());
		MAC=getMAC();
		
		
					
				System.out.println(args[0]);
				  int max=1;
				  synchron[] a = new synchron[max];
//				  
				  for(int i =0; i<max; i++){
					  a[i]=new synchron(i%4,0,args[0]);
					  a[i].start();
				  }
				  
				  

				  
		
//			      synchron R1 = new synchron(1);
//			      R1.start();
//			      synchron R2 = new synchron(2);
//			      R2.start();
//			      synchron R3 = new synchron(3);
//			      R3.start();
//			      synchron R4 = new synchron(4);
//			      R4.start();
//			      synchron R5 = new synchron(4);
//			      R4.start();
//			      synchron R = new synchron(4);
//			      R4.start();
		
		
//			    JFrame frame = new JFrame("");
//			    findpath panel = new findpath();
//			    frame.addWindowListener(
//			      new WindowAdapter() {
//			        public void windowClosing(WindowEvent e) {
//			          System.exit(0);
//			          }
//			        }
//			      );
//			    frame.getContentPane().add(panel,"Center");
//			    frame.setSize(panel.getPreferredSize());
//			    frame.setVisible(true);
//			    System.out.println(findpath.choosertitle.toString());
		
//		JFileChooser chooser = new JFileChooser();
//		chooser.setCurrentDirectory(new java.io.File("."));
//		chooser.setDialogTitle("select folder");
//		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//		chooser.setAcceptAllFileFilterUsed(false);
		
		
//		FileSystemView filesys = FileSystemView.getFileSystemView();
//		File[] roots = filesys.getRoots();
		
		/// ------------------- uncomment until END -------------------
		
//		WebDriver driver = new FirefoxDriver();
		
//		<-----------------------------------Chrome-------------------------------------->
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\astuder\\Desktop\\chormemaster\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		<--------------------------------------------------------------------------->
		
		
//		File file = new File("C:\\Program Files\\Internet Explorer\\iexplore.exe");
		
//		<-----------------------------------IE-------------------------------------->
//		File file = new File("C:\\Users\\astuder\\Desktop\\IEDriverServer.exe");
//		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
//		WebDriver driver = new InternetExplorerDriver();
//		<------------------------------------------------------------------------->
		
//		System.setProperty("--port=<portNumber>", file.getAbsolutePath());
//		DesiredCapabilities capabilitiesIE = DesiredCapabilities.internetExplorer();
//		capabilitiesIE.setCapability( InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//		WebDriver driver = new InternetExplorerDriver(capabilitiesIE);
//		
		
//		WebDriver driver = new InternetExplorerDriver();
		//WebDriver driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	    driver.get(moes.bburl + "/login.aspx?ReturnUrl=%2f");
//	    driver.findElement(By.id("Login1_UserName")).clear();
//	    driver.findElement(By.id("Login1_UserName")).sendKeys(accname);
//	    driver.findElement(By.id("Login1_Password")).clear();
//	    driver.findElement(By.id("Login1_Password")).sendKeys("q");
//	    driver.findElement(By.id("Login1_LoginButton")).click();
//	    TIMER ast = new TIMER(driver);
////	    
	    
	    //driver.switchTo().alert().accept();

		
//		TIMER a = new TIMER();
//		a.time = System.currentTimeMillis(); 
//	    IWait<IWebDriver> wait = new OpenQA.Selenium.Support.UI.WebDriverWait(driver, TimeSpan.FromSeconds(30.00));
//
//	    wait.Until(driver1 => ((IJavaScriptExecutor)driver).ExecuteScript("return document.readyState").Equals("complete")
	    
//	    comment From here to down.
//		
////		testJob testjob = new testJob();
//		HeavyJobTestcase s = new HeavyJobTestcase();
//		TestcaseLightJob d = new TestcaseLightJob();
//		TestcaseInitiate ee = new TestcaseInitiate();
////		PreconfirmedTestcase f = new PreconfirmedTestcase();
//		NewFromTemplate k = new NewFromTemplate();
//		//moes a= new moes();
//		//enterdata("Blank Job; Initiate Job; Preconfirm Job; Open Light Job; Open Heavy Job; Create Job From Template \n\r");
//		
//		
//		for(int i =0; i<100; i++){
//		try {
////			testjob.setUp();
////			testjob.start();
////			testjob.tearDown();
////			s.setUp();
////			s.testHeavyJobTestcase();
////			s.tearDown();
////			d.setUp();
////			d.testCaseLightJob();
////			d.tearDown();
////			System.out.println("fuck the matrix");
//
//
//			ee.testCaseInitiate(driver); // 3 in 1
//			//testjob.start(driver);
//			//f.testPreconfirmedTestcase(driver);
//			d.testCaseLightJob(driver);
//			s.testHeavyJobTestcase(driver);
//			k.testNewFromTemplate(driver);
//			
//			
//			
////			enterdata(" \n\r");
//			System.out.println("lap"+i);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
//		driver.quit();
//		System.out.println("finished");
//	    try {
//	        HeavyJobTestcaseIE s = new HeavyJobTestcaseIE();
//		    s.testHeavyJobTestcaseIE(driver);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
	

	}
	
	
	public static int analyse(WebElement driver, String test){
		long time= System.currentTimeMillis();
//		System.out.println(time);
		driver.click();
		enterdata(test+";"+(accname+";"+TIMER.browsername+";"+TIMER.browserversion+";"+(System.currentTimeMillis()-time))+"\n");
//		enterdata(test+";"+(accname+";"+(System.currentTimeMillis()-time))+"\n");
//		System.out.println(System.currentTimeMillis());
		return 2;
	}
	
	public static int analyse2(WebElement driver){
		long time= System.currentTimeMillis();
		driver.click();
		moes.datas.add(System.currentTimeMillis()-time);
		return 2;
	}
	
	public static void enterdata(String a){
		BufferedWriter out = null;
		String text =a;
		try  
		{
			
			//FileWriter fstream = new FileWriter(moes.filesys.getHomeDirectory();+"\\cases\\"+TIMER.dates+".csv",true);
		    FileWriter fstream = new FileWriter(System.getProperty("user.home") + savedir+System.getProperty("user.name")+MAC+TIMER.dates+".csv",true);
//		    FileWriter fstream = new FileWriter(System.getProperty("user.home") + "\\Desktop\\"+System.getProperty("user.name")+TIMER.dates+".csv",true);
		    out = new BufferedWriter(fstream);
//		    text+="\n";
		    out.write(text);
		}
		catch (IOException e)
		{
		    System.err.println("Error: " + e.getMessage());
		}
		finally
		{
		    if(out != null) {
		        try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		}
	}
	
	
	public static void enterlistdata(){
		BufferedWriter out = null;
		String text="";
		try  
		{
		    FileWriter fstream = new FileWriter("C:\\Users\\astuder\\Desktop\\latest.txt", true); //true tells to append data.
		    out = new BufferedWriter(fstream);
		    while(!moes.datas.isEmpty()){
		    	text+=datas.pop()+";";
		    } 
		    text+="\n";
		    out.write(text);
		}
		catch (IOException e)
		{
		    System.err.println("Error: " + e.getMessage());
		}
		finally
		{
		    if(out != null) {
		        try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		}
	}
	
	public static String getMAC(){
		InetAddress ip;
		StringBuilder sb = new StringBuilder();
		try {
				
			ip = InetAddress.getLocalHost();
			System.out.println("Current IP address : " + ip.getHostAddress());
			NetworkInterface network = NetworkInterface.getByInetAddress(ip);
			byte[] mac = network.getHardwareAddress();
			for (int i = 0; i < mac.length; i++) {
				sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
			}
			System.out.println("Current MAC address : " +sb.toString());
			return sb.toString();
			} catch (UnknownHostException  | SocketException e) {
			e.printStackTrace();
			return "unknown";
			}
	}
	

}
