package Part3;
import java.util.Random;
public class DiceRoller {
	Random random;
	int number;
	
	
	DiceRoller(){
		Random random = new Random();
		int number = 0;
		roll();
	}
	void roll() {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}

}
