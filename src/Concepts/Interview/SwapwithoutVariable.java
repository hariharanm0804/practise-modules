package Concepts.Interview;

class NumberLogic{
	void swapNumber(int a, int b) {
		System.out.println("Before Swaping A is: " + a + " B is: " + b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swaping A is: " + a + " B is: " + b);
	}
}
public class SwapwithoutVariable {
      public static void main(String[] args) {
		NumberLogic nu = new NumberLogic();
		nu.swapNumber(10, 20);
	}
}
