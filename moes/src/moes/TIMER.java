package moes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TIMER {
	public static String browsername;
	public static String browserversion;
	public static String bburl = "http://focissit.agility.com/";
	public static String dates;
	TIMER(WebDriver driver){
	    Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
	    browsername = caps.getBrowserName();
	    browserversion = caps.getVersion();
	    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    Date date = new Date();
	    dates=dateFormat.format(date);
	    // System.out.println(dateFormat.format(date)); //2014/08/06 15:59:48
		
	}
	
	
}
