package stacks;
import java.util.Stack;

public class Stacks {
	public static void main(String[] args) {
		//stack = LIFO data structure. last in first out
		// 			stores objects into a sort of "vertical tower"
		//			push() to add to the top
		// 			pop() to remove from the top
		
		Stack<String> stack = new Stack<String>();
		
		//System.out.println(stack.empty());
		
		stack.push("MineCraft");
		stack.push("OverWatch");
		stack.push("Borderlands");
		stack.push("NBA 2K");
		// uses of stacks?
		// 1. undo/redo features in text editors
		// 2. moving back/forward through browser history
		// 3. backtracking algorithms (maze, file directories)
		// 4. calling functions (call stack)
		
		
		
		
		//String myFavGame = stack.pop(); // assigns the pop to a variable rather than the entire stack 
				
		//System.out.println(stack.peek());// top of stack
		//System.out.println(myFavGame);
		//System.out.println(stack.search("Borderlands"));// searches the actual value not index
		//for(int i = 0; i<10000000;i++) {
			
	//		stack.push("Fallout76");
	//	}
		
		
		
		
	}

}
