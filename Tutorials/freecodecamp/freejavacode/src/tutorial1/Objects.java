package tutorial1;
import java.util.ArrayList;
import java.util.Scanner;

public class Objects {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.next();
		tim();
		tim("Hi!");
		tim("DJ",4);
		System.out.println(add2(6));
	}
	// void no return 
	public static void tim() {
		System.out.println("Tim!");
	}
	public static void tim(String str) {
		System.out.println(str);
	}
	public static void tim(String str, int x) {
		for (int i=0; i< x; i++) {
			System.out.print(str + " ");
		}
	}
	// no void so return value
	public static int add2(int x) {
		return x + 2;
		
		
	}

}
