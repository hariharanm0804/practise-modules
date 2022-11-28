package Concepts.Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
	String reverseString(String s){
	    char[] ch = s.toCharArray();
	    String s1 = "";
	    for(int i=ch.length-1; i>=0; i--){
	      s1= s1 + ch[i];
	    }
	    return s1;
	}
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		System.out.println(rs.reverseString("Good"));
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

		List<Integer> filterList = myList.stream().filter(list -> list.toString().startsWith("1")).collect(Collectors.toList());
		
		System.out.println(filterList);
	}
}
