/**
 * The prime factors of 13195 are 5,7,13, and 29.
 * What is the largest prime factor of 600851475143
 * @author dburg
 *
 */
public class LargestPrimeFactor{
public static int largestPrimeFactor(long number) { 
	int i; 
	
	for (i = 2; i <= number; i++) { 
		if (number % i == 0) {
			number /= i; 
			i--; } }
		
	return  i; }


		
	
	public static void main(String[] args) {
	System.out.println(LargestPrimeFactor.largestPrimeFactor(600851475143l));
		
	}

}
