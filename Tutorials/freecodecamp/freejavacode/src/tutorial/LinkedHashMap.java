package tutorial;
import java.util.HashMap;
import java.util.Map;
public class LinkedHashMap {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("tim", 5);
		m.put("joe","x");
		m.put("a","b");
		m.containsValue("b");
		
		m.clear();
		m.isEmpty();
		
		System.out.println(m.values());
	}

}
