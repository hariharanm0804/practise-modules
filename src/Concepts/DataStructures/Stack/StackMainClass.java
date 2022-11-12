package Concepts.DataStructures.Stack;

public class StackMainClass {
     public static void main(String[] args) {
		 Stack s = new Stack();
		 s.push(5);
		 s.push(20);
		 s.push(40);
		 s.show();
		 System.out.println();
		 System.out.println(s.pop());
		 s.show();
		 System.out.println();
		 System.out.println(s.peek());
		 
	}
}
