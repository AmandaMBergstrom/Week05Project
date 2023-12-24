package loggerproject;


	public interface Logger {
		
	
		
	 void log(String message);

	 void error(String errormessage); 
	

    public static void log(String[] args) {
        AsteriskLogger log = new AsteriskLogger();
        log.log("Hello");
        log.error("ERROR: "); }

	void main(String[] args);
		   
   
		    
}

