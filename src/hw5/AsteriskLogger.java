package hw5;

public class AsteriskLogger implements Logger {

	public void log(String message) {
		System.out.println("***" + message + "***");

	}

	public void error(String message) {
        System.out.println("******************\n");
        System.out.println("***Error: " + message + "***\n");
        System.out.println("******************");
	}

}
