package beta;

import org.apache.logging.log4j.*;

public class Demo1 {
	
	private static  Logger  Log=LogManager.getLogger(Demo1.class.getName());
 public static void main(String[] args) {
	
	 Log.debug("i am debugging");
	 
		 Log.info(" object is present");
		 Log.debug("object is present");
		 Log.error("object is not  present");
		 Log.fatal("this is fatal");
	 
}
}
