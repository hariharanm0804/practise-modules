package Concepts.Interview;

class MethodClass{
	int toggle(int a) {
		return (1-a);
	}
}
public class ToggleNumber {
	public static void main(String[] args) {
		MethodClass mc = new MethodClass();
		System.out.println("The Output is: " + mc.toggle(0));
	}

}
