import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class D5_P26_logger
{
	static Logger Log = Logger.getLogger(D5_P26_logger.class.getName());

	public static void main(String[] args) 
	{
		Log.setLevel(Level.ALL);	
		Log.info("Test Started...");
		Log.info("Test is under Execution");
		Log.info("Test is Over....");
		Log.debug("program is under execution");
		Log.fatal("Error");
		Log.error("There is an error in the program");
		
	}

}
