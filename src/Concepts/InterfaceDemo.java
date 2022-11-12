package Concepts;


/**
 * Interface -> only allowed to declare the methods
 * we can default methods to define methods in interface from java 1.8
 * Multiple inheritance we can achieve in interface using override the method
 * 
 * @author Hariharan
 *
 */
interface College{
	void getInfo();
	default void show() { // can be override
		System.out.println("Info show the applicant");
	}
}

class Stud implements College{

	@Override
	public void getInfo() {
		System.out.println("Name: Hariharan, Type:Student, regno: 2000");
	}
	
}

class Staff implements College{

	@Override
	public void getInfo() {
		System.out.println("Name: Saravanan, Type:Staff, regno: 100");
		
	}
	
}
public class InterfaceDemo {
   public static void main(String[] args) {
	   College c = new  Stud();
	   College c1 = new  College() { // Anonyms class
		   public void getInfo() {
				System.out.println("Name: Saravanan, Type:Staff, regno: 100");
				
			}
	   };
	   c1.getInfo();
	   c1.show();
}
}
