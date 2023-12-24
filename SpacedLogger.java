package loggerproject;

public class SpacedLogger implements Logger {

	@Override
	 public void log(String message) {
        String spacedMessage = String.join(" ", message.split(""));
        System.out.println(spacedMessage);
    }

	  @Override
	    public void error(String errorMessage) {
	        String spacedError = String.join(" ", errorMessage.split(""));
	        System.out.println("ERROR: " + spacedError);
	    }

	@Override
	public void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	
	}

