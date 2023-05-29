package tutorial;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Maps {
	public static void main(String[] args) {
		// Key pairing value
		//HashMaps no order and cant have two existing keys but have two values
		
		Map m = new HashMap();
		m.put("tim", 5);
		m.put("joe", "x");
		m.put(11,999);
		m.put(11,998);
		
		System.out.println(m);
		System.out.println(m.get("tim"));
	}

}
