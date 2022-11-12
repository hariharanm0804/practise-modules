package Concepts;

final class A{ // final class
	final int DAYS;// constant final Variable
	
	A(){
		DAYS = 15;
	}
	
	final void show() { // final method
		System.out.println(" A class");
	}
}

class B extends A{
	void show() {
		System.out.println(" B class");
	}
}
public class FinalDeo {
   public static void main(String[] args) {
	  A obj = new A();
	  System.out.println(obj.DAYS);
	  obj.show();
}
} 
