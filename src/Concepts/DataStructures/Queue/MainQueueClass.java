package Concepts.DataStructures.Queue;

import Concepts.DataStructures.Stack.Stack;

public class MainQueueClass {
     public static void main(String[] args) {
    	 Queue s = new Queue();
		 s.enqueue(12);
		 s.enqueue(34);
		 s.enqueue(56);
		 s.enqueue(45);
		 s.show();
		 System.out.println();
		 System.out.println(s.dequeue());
		 System.out.println(s.dequeue());
		 s.show();
//		 System.out.println();
//		 System.out.println(s.peek());
	}
}
