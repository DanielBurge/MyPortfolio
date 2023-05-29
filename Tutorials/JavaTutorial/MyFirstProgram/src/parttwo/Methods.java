package parttwo;

public class Methods {
	
	public static void main(String[] args) {
		
		// method = a block of code that is executed whenever it is called upon
		
		String name = "Bro";
		hello(name, 28);
		int z = add(5,7);
		System.out.println(z);
		}
	
	static void hello(String n, int age) {
		System.out.println("Hello " +  n + " I am " +  age + " years old");
	}
	
	static int add(int x, int y) {
		
		int z = x+ y;
		return z;
	}

}
