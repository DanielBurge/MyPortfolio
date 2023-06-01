import java.util.*;
public class OneThousandFirstPrime {
	/**
	 * By listing the first six prime numbers 2,35,7,11,13 and 16
	 * What is the 1001st prime number?
	 */
	public static boolean isPrime(long n) {
		for(long i = 2; i<n; i++) {
			if(n%i==0) 
				return false;
	
		}return true;
	}

		public static void main(String[] args) {
			//OneThousandFirstPrime p = new OneThousandFirstPrime();
			ArrayList<Long> arr = new ArrayList<Long>();
			
			for(long j=2; j<=999999;j++ ) {
				if(isPrime(j))arr.add(j);
				
			}
			long t = arr.get(10001);
			System.out.println("The prime number at 10001 is : " + t);
		}
}
