package Concepts.Interview;

public class SingletonClass {
	private static SingletonClass obj; // Lazy Instantiation
	
	private static SingletonClass obj1 = new SingletonClass(); // Eager Instantiation
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() {
		if(obj == null) {
			obj = new SingletonClass();// Lazy Instantiation
		}
		return obj;
	}
	
	void show() {
		System.out.println("Show Method Called");
	}
}
