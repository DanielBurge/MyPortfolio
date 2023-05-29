package tutorial;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Collections {
	public static void main(String[] args) {
		// Collections don't have set amount like arrays. Also faster than arrays
		// Hashset no set order.
		//TreeSet ordered
		Set<Integer> t = new HashSet<Integer>();
		t.add(5);
		t.add(7);
		t.add(9);
		t.add(5);
		t.add(-8);
		t.remove(9);// removes one element
		t.clear();// removes the entire set
		t.size();// the size of the array
		
		boolean x = t.contains(5);
		System.out.println(x);
		System.out.println(t);
	}

}
