package tutorial1;
// Classes blueprint for object
// private only accessible in this class


public class Dog {
	protected static int count = 0;
	protected String name;
	protected int age;
	
	
	
	public Dog(String name, int age) {
		// this referencing to private attributes
		this.name = name;
		this.age = age;
		Dog.count +=1;
		//Dog.display();
	}
	// static methods for just when dont want instance or attributes
	public static void display() {
		System.out.println("I am a dog");
	}
	public void speak() {
		System.out.println(" I am " + this.name + " and I am " + this.age + "  years old");
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
