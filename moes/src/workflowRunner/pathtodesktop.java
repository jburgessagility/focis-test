package workflowRunner;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

public class pathtodesktop extends Thread {
	
	
	    public static InputStream is;
	    public static StringWriter sw;

	    pathtodesktop(InputStream is) {
	      this.is = is;
	      sw = new StringWriter();
	    }

	    public void run() {
	      try {
	        int c;
	        while ((c = is.read()) != -1)
	          sw.write(c);
	        }
	        catch (IOException e) { ; }
	      }

	    String getResult() {
	      return sw.toString();
	    }
	  }
	