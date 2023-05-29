package tutorial3;

public class Main {
	public static void main(String[] args) {
		Car ford = new Car();
		ford.speedUp(10);
		ford.changeGear(3);
		ford.display();
		
		int x = Vehicle.math(5);
		System.out.print(x);
	}

}
