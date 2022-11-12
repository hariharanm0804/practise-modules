package Concepts.Java8;

/**
 * 
 * Types of interface
 * 
 * 1.Normal
 * 2.Single abstract method - Funtional Interface <- Lamda Expression <- Scala
 * 3.Marker interface
 * 
 * @author Hariharan
 *
 */
@FunctionalInterface
interface Abc{
	void show();
}

public class FunctionInterfaceDemo {
   public static void main(String[] args) {
	   Abc a = () -> System.out.println("Show");
	   a.show();
  }
}
