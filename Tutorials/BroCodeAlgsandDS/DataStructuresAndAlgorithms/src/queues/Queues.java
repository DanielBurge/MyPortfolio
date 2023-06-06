package queues;
import java.util.*;
public class Queues {
	public static void main(String[] args) {
		
		// Queue = FIFO data structure. First-In First-Out
		//  	   A collection designed for holding elements prior to processing 
		// 			Linear data structure
		//			add = enqueue, offer()
		//			remove= dequeue, poll()
		//
		//	Where are queues useful?
		// 1. Keyboard Buffer (letters should appear on the screen that they are pressed
		// 2. Printer queue
		// 3. used in LinkedList, PriorityQues, Breadth-first search
		Queue<String> queue = new LinkedList<String>();
		//System.out.println(queue.isEmpty());
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		//System.out.println(queue.peek());
		//queue.poll();
		//queue.element();
		//System.out.println(queue.isEmpty);
		//System.out.println(queue.size());
		//System.out.println(queue.contains("Harold");
		//System.out.println(queue);
		
		
		
	}

}
