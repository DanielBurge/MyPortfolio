package tutorial;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
	public static void main(String[] args) {
		// Tree maps are ordered 
		// also Tree maps the key value must be the same i.e Strings in first parameter.
		Map m = new TreeMap();
		m.put("tim", 5);
		m.put("joe", "x");
		m.put("a","b");
		System.out.println(m);
	}

}
