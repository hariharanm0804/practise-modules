package Concepts.Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;

/**
 * (a+b) valid
    	((a+b+c) invalid
    	({a+b+c)} invalid
 * @author Hariharan
 *
 */
public class ValidExpression {
	public static void main(String[] args) {
    	String str = "({a+b+c})";
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
	    			if(!Pattern.matches("[a-zA-z+]", String.valueOf(str.charAt(i)))){
	    				 stack.push(str.charAt(i));
	    			}
	    		}
    		}
    	if(stack.empty()) {
    		System.out.println("Its valid");
    	}else {
    		System.out.println("Its invalid");
    	}
    	
	}
}
