package Concepts.Java8;


/**
 * Static method can be define in interface from java1.8
 * 
 * @author Hariharan
 *
 */
interface Demo{
	int num = 8; // interface variable acted as final variable can't be used sub class
	void show();
	static void abc() { // static method
		System.out.println("ABC Printed");
	}
}
class B implements Demo{

	@Override
	public void show() {
		int a = num+1;
		System.out.println(a + " show");
	}
	
	static void abc() {
		System.out.println("Child ABC");
	}
}
public class StaticInterface {
    public static void main(String[] args) {
		Demo b = new B();
		Demo.abc();
		b.show();
	}
}
