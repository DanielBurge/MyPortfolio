package parttwo;
import java.util.*;
public class TwoDArrays {
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("pasta");
		drinksList.add("garlic bread");
		drinksList.add("donuts");
		
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);

		System.out.println(groceryList.get(2).get(1));
		System.out.println(bakeryList.get(0));
	}
}
