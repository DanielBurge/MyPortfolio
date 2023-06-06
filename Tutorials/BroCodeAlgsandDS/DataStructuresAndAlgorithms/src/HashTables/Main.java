package HashTables;
import java.util.*;
public class Main {
	// Hashtable = a data structure that stores unique keys to values ex<String,Integer>
	//				Each key/value pair is known as an Entry
	//				Fast insertion, look up, deletion of key/value pairs
	//				Not ideal for small data sets, great with large data sets
	
	//				hashing =  takes a key and computes an integer (formula will vary based on key & data type)
	//				In a Hashtable, we use the hash % capacity to calculate an index number
	//				
	//				key.hashCode() % capacity = index
	
	// bucket =  an indexed storage location for one or more entries
	// can store multiple Entries in case of collision (linked similarly as a LinkedList) 
	
	// Runtime complexity: Best case O(1)
	//						Worst case O(n)
	public static void main(String[] args) {
		
		Hashtable<String,String> table = new Hashtable<>(10);
		
		table.put("100", "Spongebob");
		table.put("123", "Patrick");
		table.put("321", "Sandy");
		table.put("555", "Squidward");
		table.put("777", "Gary");
	
		System.out.println(table.get(100));
		//table.remove(777);
		
		for(String key : table.keySet()) {
			System.out.println(key.hashCode() %21 + "\t" + key+ "\t"+table.get(key));
		}
		
	}

}
