package Concepts;

class SubCalc{
	
	int number;
	
	/**
	 * Constructor
	 * 
	 * 1. Member Method
	 * 2. It is used to allocate Memory
	 * 3. Don't have return type
	 * 4. Default Constructor
	 */
	public SubCalc(){
		number=20;
	}
	
	public SubCalc(int num){
		number=num;
	}
	
	public SubCalc(double number){
		this.number=(int)number; // current object or instance
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		
		SubCalc sub = new SubCalc(); // knows something and does something
		
		SubCalc sub1 = new SubCalc(50);
		
		SubCalc sub2 = new SubCalc(100.20);
		
		System.out.println(sub.number);
		System.out.println(sub1.number);
		System.out.println(sub2.number);
		System.out.println("s"+(100 +100));
	}
}
