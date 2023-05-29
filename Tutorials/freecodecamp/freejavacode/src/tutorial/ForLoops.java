package tutorial;
import java.util.Scanner;

public class ForLoops {
	public static void main(String[] args) {
	int[] arr = {1,5,7,3,4,5};
	String[] names = new String[5];
	Scanner sc = new Scanner(System.in);
	// for each loop of arr of numbers and the count 
	int count = 0;
		for(int element:arr) {
			System.out.println(element + " " + count);
			count++;
		}
		// input for names
		for(int i = 0; i<names.length; i++) {
			System.out.print("Input: ");
			String input = sc.nextLine();
			names[i] = input;
		}
		// list of names
		for (String n:names) {
			System.out.println(n.equals("tim"));
			break; // break when Tim occurs
		
		}
		// for loop to search for specific number in the array
		for(int i = 0; i< arr.length; i++) {
			if (arr[i] == 5) {
				System.out.println("Found a 5! at index " + i);
			}
			
		}
		
	}
}
