package Concepts;


/**
 * Wrapper Class
 * 
 * Autoboxing and auto unboxing
 * @author Hariharan
 *
 */
public class WrapperDemo {
	
    public static void main(String[] args) {
		
    	int i = 5;
    	Integer ii = new Integer(i); // Boxing - Wrapping
    	
    	int j = ii.intValue(); // unboxing - unwrapping
    	
    	Integer value  = i; // AutoBoxing
    	
    	int k = value; // auto unboxing
	}
} 
