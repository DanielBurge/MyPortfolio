
public class Multiplesof3or5 {
	/**
	 * If we list all natural numbers under 10 that are multiples of 3 or 5
	 * , We get 3, 5, 6, 9. The sum of these are 23. Find the sum of all multiples of 3 and 5 below 1000. 
	 * @param args
	 */
	public static void main(String[] args) {
		int temp = 0;
		for(int i = 0; i<1000; i++) {
			if(i%3==0 || i%5==0) {
				temp = temp+ i;
			}
		}
		System.out.println(temp);
	}

}
