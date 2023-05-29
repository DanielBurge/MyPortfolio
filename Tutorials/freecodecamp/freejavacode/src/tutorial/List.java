package tutorial;
import java.util.ArrayList;
import java.util.Set;
public class List {
	public static void main(String[] args) {
		//Lists slower than arrays
		ArrayList<Integer> t = new ArrayList<Integer>();
		t.add(19);
		t.add(2);
		t.add(3);
		t.add(5);
		t.add(7);
		t.get(0);
		t.set(1, 5);// change existing index
		t.subList(1,3);
		
		System.out.println(t.subList(1, 4));
	
	}

}
