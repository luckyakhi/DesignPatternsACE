package ace.java.designpatterns.creational.singleton;

import ace.java.designpatterns.creational.ace.java.design.patterns.common.Logger;

import java.io.Serializable;

public class DoubleCheckThreadSafeLazySingletonLogger implements Logger,Serializable {
	
	private volatile  static DoubleCheckThreadSafeLazySingletonLogger instance=null;
	private volatile static int instanceCount;
	
	public static DoubleCheckThreadSafeLazySingletonLogger getInstance(){
		if(instance == null){
			synchronized (DoubleCheckThreadSafeLazySingletonLogger.class) {
				if(instance == null){
					instance = new DoubleCheckThreadSafeLazySingletonLogger();
					instanceCount++;
				}
			}
		}
		return instance;
	}
	
	public static int getInstanceCount(){
		return instanceCount;
	}
	
	@Override
	public void log(String message) {
		System.out.println(message);
	}

	public Object readResolve(){
		return instance;
	}
	
	
	
	private DoubleCheckThreadSafeLazySingletonLogger() {};

}
