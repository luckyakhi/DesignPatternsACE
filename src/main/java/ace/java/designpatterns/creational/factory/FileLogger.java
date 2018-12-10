package ace.java.designpatterns.creational.factory;


import ace.java.designpatterns.creational.common.Logger;

public class FileLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Logging to file");
		
	}

}
