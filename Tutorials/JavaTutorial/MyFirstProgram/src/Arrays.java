
public class Arrays {
	public static void main(String[] args) {
		
		//array = used to store multiple values in a single variable
		
		String[] cars = {"Camaro", "Corvette", "Tesla","BMW"};
		
		cars[0] = "Mustang";
		
		//System.out.println(cars[3]);
		
		
		String[] vehicles = new String[3];
		
		vehicles[0]= "Camaro";
		vehicles[1]= "Corvette";
		vehicles[2]= "Tesla";
		
		for(int i = 0; i<vehicles.length;i++) {
			System.out.println(cars[i]);
			
		}
	}

}
