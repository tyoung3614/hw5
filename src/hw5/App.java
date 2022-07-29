package hw5;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger logger = new AsteriskLogger();
	
		logger.log("Hello");
		logger.error("Hello");
		
		SpacedLogger spacer = new SpacedLogger();
	
		spacer.log("Hello");
		spacer.error("Hello");
	
	}

}
