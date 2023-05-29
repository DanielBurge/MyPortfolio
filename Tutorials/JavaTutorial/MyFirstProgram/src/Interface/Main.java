package Interface;

public class Main {
	public static void main(String[] args) {
		// interface = a template that can be applied to a class.
		//				similar to inheritance
		//
		//
		
		Rabbit rabbit = new Rabbit();
		
		rabbit.flee();
		
		Hawk hawk = new Hawk();
		hawk.hunt();
		
		Fish fish = new Fish();
		fish.flee();
		fish.hunt();
	}

}
