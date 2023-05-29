package parttwo;
import java.util.*;

public class Arrays{
	public static void main(String[] args) {
		// ArrayList = a resizeable array.
		// 			   Elements can be added and removed after compilation phase 
		//			   store reference data types
			ArrayList<String> food = new ArrayList<String>();
			
			food.add("pizza");
			food.add("brocolli");
			food.add("hotdog");
			
			food.set(0, "sushi");
			food.remove(2);
			food.clear();
			
			for(int i=0;i<food.size();i++) {
				System.out.print(food.get(i));
			}
			
					 
		
	}

}
