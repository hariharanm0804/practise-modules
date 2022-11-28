package Concepts.Java8;

public final class ImmutableClass {
	
	final int a;
	final int b;
	
	public ImmutableClass(int value1, int value2) {
		a = value1;
		b = value2;
	}
	
	int getA(){
		return a;
	}
	
	int getB() {
		return b;
	}
}

class TestClass {
	public static void main(String[] args) {
		ImmutableClass i = new ImmutableClass(20, 30);
		System.out.println("A Value" + i.getA());
		System.out.println("B Value" + i.getB());
	}
}
