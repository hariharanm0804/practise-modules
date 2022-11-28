package Concepts.Interview;


class AB{
	AB(){
		System.out.println("Instance of A");
	}
	void run() {
		System.out.println("A is run method");
	}
}
class BC extends AB{
	BC(){
		System.out.println("Instance of B");
	}
	void run() {
	  System.out.println("B is run method");	
	}
}
public class Example {
	public static void main(String[] args) {
		BC b = new BC();
		b.run();
		AB bc = new BC();
		bc.run();
	}
   
}
