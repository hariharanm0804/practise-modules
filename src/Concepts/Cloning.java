package Concepts;

/**
 * Shallow Copy
 * Deep Copy
 * Cloning
 * 
 * @author Hariharan
 *
 */
class Abc implements Cloneable {
	int a;
	int b;
	
	@Override
	public String toString() {
		return "Abc [a=" + a + ", b=" + b + "]";
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
		Abc abc = new Abc();
		abc.a = 5;
		abc.b = 8;
		
		// Shallow Copy is changed value of abc bcz same value with 2 reference
//		Abc abc1 = abc;
//		abc1.a = 10;
//		abc1.b = 16;
		
		// Deep Copy is creating new object with different value
//		Abc abc1 = new Abc();
//		abc1.a = 10;
//		abc1.b = 16;
		
		
		// Cloning combine of deep and shallow copy
		Abc abc1 = (Abc) abc.clone();
		abc1.a = 10;
		abc1.b = 16;
		
		System.out.println(abc);
		System.out.println(abc1);
	}
}
