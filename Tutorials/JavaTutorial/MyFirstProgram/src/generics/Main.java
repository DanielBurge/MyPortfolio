package generics;

public class Main {
	public static void main(String[]args) {
		
		//MyIntegerClass myInt = new MyIntegerClass(1);
		//MyDoubleClass myDouble = new MyDoubleClass(3.14);
		//MyCharacterClass myChar = new MyCharacterClass('@');
		//MyStringClass myString = new MyStringClass("Hello");
		
		MyGeneric<Integer,Double> myInt = new MyGeneric<>(1,2.5);
		MyGeneric<Double,Double> myDouble = new MyGeneric<>(3.14,3.33);
		MyGeneric<Character,Integer> myChar = new MyGeneric<>('@',5);
		MyGeneric<String,Character> myString = new MyGeneric<>("Hello",'@');
		
		
		
		System.out.println(myInt.getValueofX());
		System.out.println(myDouble.getValueofY());
		System.out.println(myChar.getValueofX());
		System.out.println(myString.getValueofY());
		//Integer[] intArray = {1,2,3,4,5};
		//Double[] doubleArray = {5.5,4.4,3.3,2.2,1.1};
		//Character[] charArray= {'H', 'E', 'L', 'L', 'O'};
		//String[] stringArray = {"B","Y","E"};
		
		//displayArray(intArray);
		//displayArray(doubleArray);
		//displayArray(charArray);
		//displayArray(stringArray);
	}	
		public static <Thing> void displayArray(Thing[] array) {
			for(Thing x: array) {
				System.out.print(x+ " ");
			}
			System.out.println();
		}
			
	}

	
	
	


