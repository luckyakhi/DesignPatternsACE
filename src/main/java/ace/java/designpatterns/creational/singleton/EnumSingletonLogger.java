package ace.java.designpatterns.creational.singleton;

import ace.java.designpatterns.creational.ace.java.design.patterns.common.Logger;

/**
 * Safe Against Mulithreading,Serialization and Reflection
 * Problem is that it is eager and no way to handle initialization failures
 */
public enum EnumSingletonLogger implements Logger {
	logger;
	public void log(String message){
		System.out.println(message);
	}
}