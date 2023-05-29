package Part3;

public class OverloadedConstructors {
	public static void main(String[] args) {
		
		//overloaded constructors
		
		Pizza pizza = new Pizza("thick crust", "tomato", "mozarella", "pepperoni");
		
		System.out.println(pizza.bread);
		System.out.println(pizza.topping);
		System.out.println(pizza.cheese);
		System.out.println(pizza.sauce);
		System.out.println(pizza.toString());
		
		
		
		
		
	}

}
