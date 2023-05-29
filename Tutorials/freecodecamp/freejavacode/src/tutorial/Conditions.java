package tutorial;
import java.util.Scanner;

public class Conditions {
	public static void main(String[] args) {
		int x = 6;
		int y = 23;
		int z = 10;
		// > < == >= <= !=(not equal)
		boolean compare = x > y && z < y;
		boolean compare1 = x > y || z < y;
		boolean compare2=(x < y && y > z)||(z + 2 < 5 || x + 7 > y);
		
		System.out.println(compare);
		System.out.println(compare1);
		System.out.println(compare2);
	}

}
