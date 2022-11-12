package Concepts;

/**
 * Inner Class
 * 
 * Member Class
 * Static Class
 * 
 * @author Hariharan
 *
 */
class Outer{
	int i;
	
	void show() {
		System.out.println("Outer Class Executed");
	}
	
	static class Inner{
		void display() {
			System.out.println("Inner Class Executed");
		}
	}
}
public class InnerClassDemo {
	public static void main(String[] args) {
		Outer obj = new Outer();
		
		obj.show();
		
//		Outer.Inner obj2 = obj.new Inner(); // non static class
		
		Outer.Inner obj3 = new Outer.Inner(); // static class
		
		obj3.display();
	}

}
