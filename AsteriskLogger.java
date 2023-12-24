package loggerproject;



	
	public class AsteriskLogger implements Logger {


		
	    	public void log(String message) {
	    		String decoratedMessage = "***" + message + "***";
	            System.out.println(decoratedMessage);
	        }

		@Override
		 public void error(String errorMessage) {
	        String border = "****************";
	        String decoratedMessage = "***Error: " + errorMessage + "***";
	        System.out.println(border);
	        System.out.println(decoratedMessage);
	        System.out.println(border);
		}

		@Override
		public void main(String[] args) {
			// TODO Auto-generated method stub
			
		}
		    		
		}

