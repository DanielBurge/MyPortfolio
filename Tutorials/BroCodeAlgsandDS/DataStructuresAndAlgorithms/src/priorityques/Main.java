package priorityques;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		//Priority Queue = A FIFO data structure that serves elements
		// 				   with the highest priorities first
		//					before elements with lower priority
			
		Queue<String> queue = new PriorityQueue<>();
		
		queue.offer("B");
		queue.offer("C");
		queue.offer("A");
		queue.offer("F");
		queue.offer("D");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
