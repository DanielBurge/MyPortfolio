package tutorial1;

public class Main {
	public static void main(String[] args) {
		Dog Fendi = new Dog("Fendi",3);
		Fendi.speak();
	int x = Fendi.getAge();
	System.out.println(x);
	Fendi.setAge(10);
	Fendi.speak();
	
	Cat tim = new Cat("tim",18,100);
	tim.speak();
		Dog tim1 = new Dog("tim", 9);
		Dog bill = new Dog("bill", 10);
		System.out.println(Dog.count);
	}

}
