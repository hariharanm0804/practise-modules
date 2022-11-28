package Concepts.Interview;

public class NestedClass {
	
	int value;
	
	NestedClass(int val){
		System.out.println("value with:" + val*10);
	}
   
	class Sample{
		int nestValue;
		Sample(int nestVal){
			System.out.println("nestValue with:" + nestVal*20);
		}
	}
	public static void main(String[] args) {
		NestedClass nc = new NestedClass(20);
		Sample s = nc.new Sample(20);
	}
}
