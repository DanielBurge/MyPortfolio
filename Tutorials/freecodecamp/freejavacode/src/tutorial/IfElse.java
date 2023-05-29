package tutorial;
import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =  sc.nextLine();
		
		if(s.equals("tim")) {
			System.out.println("You typed tim");
			
		}
		// can have as many else if
		// if multiple else if with same result prints first condition
		else if(s.equals("hello")) {
			System.out.print("Hi!");
			
		}
		// don't need else but is for everything but the else and else ifs
		else {
			System.out.println("Print");
			
		}
		
	}

}
