package Alpha;


import org.apache.logging.log4j.*;
public class demo {

private static Logger  Log=LogManager .getLogger(demo.class.getName());
	public static void main(String[] args) {
		
		Log.debug("i am debugging");
		if(5>4) {
			Log.info(" object is present");
			Log.debug("object is present");	
			Log.fatal("this is fATAL");
			
		}
		}
			
		
		
		
		
		
		
		
		
	}

