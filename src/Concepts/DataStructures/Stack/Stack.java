package Concepts.DataStructures.Stack;

public class Stack {
     int stack[] = new int[5];
     int top = 0;
     
     void push(int data) {
    	 stack[top] = data;
    	 top++;
     }
     
     int pop() {
    	 int data;
    	 top--;
    	 data = stack[top];
    	 stack[top] = 0;
    	 return data;
    	 
     }
     
     int peek() {
    	 int data;
    	 data = stack[top-1];
    	 return data;
    	 
     }
     
     void show() {
    	 for(int i: stack) {
    		 System.out.print(i + " ");
    	 }
     }
}
