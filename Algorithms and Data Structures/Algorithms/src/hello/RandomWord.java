package hello;
import java.util.*;

public class RandomWord {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] array = new String[2];		
		
		System.out.println("Enter your array");
		
		for(int i = 0; i< array.length;i++) {
			array[i] = s.nextLine();
			
		}
		//for(String y:array) {
		//	System.out.println(y);
		//}
		shuffle(array);
		
		//System.out.print("This is array at index 0: " + array[0]);
		
	}
	
	

	public static void shuffle(String array[]) {
		
		
		int n = array.length;
		for(int i = 0;i<n; i++ ) {
			//choose index between [0,i]
			int r = (int) (Math.random()* (i+1));
			String swap = array[r];
			array[r] = array[i];
			array[i] = swap;
			
		}
		System.out.println("You shuffled : " + array[0]);
	}
}
