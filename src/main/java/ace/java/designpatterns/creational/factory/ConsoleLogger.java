package ace.java.designpatterns.creational.factory;


import ace.java.designpatterns.creational.common.Logger;

public class ConsoleLogger implements Logger {
	

	public ConsoleLogger() {
		super();
	}


	@Override
	public void log(String message) {
		System.out.println("Logging to console");
	}

}
