package Concepts.Java8;


import java.util.*;
import java.io.*;

public class ImmutableListDemo {
	
	public static void main(String[] args) {
		 System.out.println(System.getProperty("java.runtime.version"));
		 List<String> list = List.of("Hari", "Haran");
		 System.out.println(list);
//		 list.add("Sri");
//		 System.out.println(list);
		 
		 List<String> list1 = Collections.unmodifiableList(list);
		 System.out.println("List 1" + list1);
		 list1.add("Sri");
		 System.out.println(list);
	}

}
