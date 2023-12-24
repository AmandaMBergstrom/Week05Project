package loggerproject;

public class App {
	  public static void main(String[] args) {
	       
	  Logger asteriskLogger = new AsteriskLogger();
	  Logger spacedLogger = new SpacedLogger();

	        
	  asteriskLogger.log("Hello");
	  asteriskLogger.error("Hello");
	  	System.out.println(); 
	  	 spacedLogger.log("HELLO WORLD");
		  spacedLogger.error("HELLO TO THE WORLD");
	  }

}
