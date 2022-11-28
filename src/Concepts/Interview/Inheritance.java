package Concepts.Interview;

class A{
	A(){
		System.out.println("A Constuctor");
	}
	static void show() {
		System.out.println("Show MEthod A");
	}
}

class B extends A{
	B(){
		System.out.println("B Constructor");
	}
	static void show() {
		System.out.println("Show MEthod B");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		A a = new B();
        B.show();
	}
}
