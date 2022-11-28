package Concepts.Interview;

class OverloadClass{
//	void m1(String s) {
//		System.out.println("String m1 is called");
//	}
	
	void m1(Object o) {
		System.out.println("Object m1 is called");
	}
	
	void m1(Integer i) {
		System.out.println("Integer m1 is called");
	}
}

public class MethodOverloading {
   public static void main(String[] args) {
	  OverloadClass over = new OverloadClass();
	  over.m1(null);
   }
}
