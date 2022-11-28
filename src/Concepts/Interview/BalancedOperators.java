package Concepts.Interview;

import java.util.Stack;

public class BalancedOperators {
	 public static void main(String[] args) {
	    	String str1 = "{ ( ) { ( [ ] ) } }";
	    	String str = str1.replace(" ", "");
	    	Stack<Character> stack = new Stack<>();
	    	for(int i=0; i<str.length(); i++) {
	    			if(str.charAt(i) == '(' || str.charAt(i) == '{' ||
		    				str.charAt(i) == '[') {
		    			stack.push(str.charAt(i));
		    		}else if((str.charAt(i) == ')' && stack.peek() == '(')
		    				|| (str.charAt(i) == '}' && stack.peek() == '{') ||
		    				(str.charAt(i) == ']' && stack.peek() == '[')) {
		    			stack.pop();
		    		}else {
		    			 stack.push(str.charAt(i));
		    		}
	    		}
	    	if(stack.empty()) {
	    		System.out.println("Its valid");
	    	}else {
	    		System.out.println("Its invalid");
	    	}
	    	
		}
}
