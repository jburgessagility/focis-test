package workflowRunner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.LinkedList;
import org.openqa.selenium.*;

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
	public static void main(String[] args) {
		if(new File(System.getProperty("user.home")+savedir).mkdir());
		//MAC=getMAC();
		

		Workflow workflow = new Workflow();
		workflow.run(2);


	}
	
	public static void analyse(WebElement driver, String test){

		long time= System.currentTimeMillis();
		driver.click();
		enterdata(test+";"+(accname+";"+"Firefox"+";"+"39"+";"+(System.currentTimeMillis()-time))+"\n");

	}
	
	public static int analyse2(WebElement driver){
		long time= System.currentTimeMillis();
		driver.click();
		WorkflowRunner.datas.add(System.currentTimeMillis()-time);
		return 2;
	}
	
	public static void enterdata(String a){
		String date = "2015-08-31";
		BufferedWriter out = null;
		String text =a;
		try  
		{
			
		    FileWriter fstream = new FileWriter(System.getProperty("user.home") + savedir+System.getProperty("user.name")+MAC+date+".csv",true);
		    out = new BufferedWriter(fstream);
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
	    while(!WorkflowRunner.datas.isEmpty()){
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
	      try {	out.close(); } 
	      catch (IOException e) {	e.printStackTrace(); }
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
