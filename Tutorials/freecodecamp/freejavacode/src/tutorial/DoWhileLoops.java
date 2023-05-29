package tutorial;
import java.util.Scanner;

public class DoWhileLoops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		do {
			System.out.print("Type a number: ");
			x = sc.nextInt();
			
		} while(x !=10);
	}

}
