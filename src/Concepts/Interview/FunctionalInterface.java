package Concepts.Interview;

interface SampleInterface{
//	void show();
//	SampleConstructor sample(String s);
	
	default void printDefault() {
		System.out.println("Print Default Method Called");
	}
}

class SampleConstructor{
	SampleConstructor(String s){
		System.out.println(s);
	}
}


public class FunctionalInterface implements SampleInterface {
	void showMethod() {
		System.out.println("Show Method Called");
	}
	
	@Override
	public void printDefault() {
		System.out.println("Child Print Default");
	}
    public static void main(String[] args) {
    	
    	/**Functional Interface & Lamda Expressions*/
    	
//    	SampleInterface s1 = () -> { System.out.println("Show Called");};
//        s1.show();
        
        /**Method Reference Static Methods*/
    	
//    	SampleInterface s1= FunctionalInterface::showMethod;
//    	s1.show();
    	
    	/**Method Reference Instance Method*/
    	
//    	SampleInterface s1= new FunctionalInterface()::showMethod; or
//    	FunctionalInterface fi = new FunctionalInterface();
//    	SampleInterface s1 = fi::showMethod;
//    	s1.show();
    	
    	/**Method Reference Constructor*/
    	
//    	SampleInterface s1 = SampleConstructor::new;
//    	s1.sample("Hi Valli");
    	
    	/** Default Method*/
        SampleInterface s1 = new FunctionalInterface();
        s1.printDefault();
	}
    
    
}
