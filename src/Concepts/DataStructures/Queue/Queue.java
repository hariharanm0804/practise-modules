package Concepts.DataStructures.Queue;

public class Queue {
      
	int queue[] = new int[5];
	int front = 0;
	int end = 0;
	int size = 0;
	
	void enqueue(int data) {
		queue[end] = data;
		end++;
		size++;
	}
	
	int dequeue() {
		int data = queue[front];
		front++;
		size--;
		return data;
		
	}
	
	void show() {
		
		for(int q=0;q< size;q++) {
			System.out.print(queue[front+q] + " ");
		}
		System.out.println();
		for(int q: queue) {
			System.out.print(q + " ");
		}
	}
}
