package Concepts;

/**
 * Method declaration with abstract keyword
 * @author Hariharan
 *
 */
abstract class Human{
	abstract void eat();
	abstract void walk();
}

class Men extends Human{ // Concreate

	@Override
	void eat() {
		System.out.println(" We can Eat");
		
	}

	@Override
	void walk() {
        System.out.println(" We can Walk");		
	}
	
}
public class AbstractDemo {
  public static void main(String[] args) {
	 Men m = new Men();
	 m.eat();
}
}
