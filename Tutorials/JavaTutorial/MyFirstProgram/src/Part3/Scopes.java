package Part3;

public class Scopes {
	public static void main(String[] args) {
		// local = declared inside a method
		//  	   visible only to that method
		
		//global = declared outside a method, but within a class
		//			visible to all parts of a class
		
		DiceRoller diceroller = new DiceRoller();
		diceroller.roll();
		
	}

}
