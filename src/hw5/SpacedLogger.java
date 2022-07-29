package hw5;

public class SpacedLogger implements Logger {

	@Override
	public void log(String message) {
		
		StringBuilder spaces = new StringBuilder();
		
	
		for (int i = 0; i < message.length(); i++) { 
		
			spaces.append(message.charAt(i));
			spaces.append(" ");	      
		}
		
		System.out.println(spaces.toString()); 
	}

	@Override
	public void error(String message) {
		System.out.print("ERROR: ");
        log(message);
	}

}
