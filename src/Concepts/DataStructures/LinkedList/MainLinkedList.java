package Concepts.DataStructures.LinkedList;

public class MainLinkedList {
      public static void main(String[] args) {
		  LinkedList l = new LinkedList();
		  l.insert(20);
		  l.insert(58);
		  l.insert(25);
		  l.show();
		  System.out.println();
		  l.insertAt(30);
		  l.show();
	}
}
