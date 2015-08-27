package ivan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ivan {

	public static void main(String[] args) throws Exception {
		System.out.println("start");
        switch (1) {
            case 1:  
        		ivan1 a = new ivan1();
        		a.setUp();
        		a.testIvan1();
        		a.tearDown();
        		break;
            case 2:  
            	ivankill as = new ivankill();
        		as.setUp();
        		as.testivankill();
        		 break;
            case 3:  
            	ocean c= new ocean();
        		c.setUp();
        		c.testOceanfreightSzenario();
        		break;
        }
	}
	public static void enterdata(String b, WebElement a, WebDriver driver){
		a.click();
		
		BufferedWriter out = null;
		String text =b+"";
		try  
		{
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
		    FileWriter fstream = new FileWriter(System.getProperty("user.home") + "\\Desktop\\"+"ivan"+dateFormat.format(date)+".csv",true);
		    out = new BufferedWriter(fstream);
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
		}}

}
