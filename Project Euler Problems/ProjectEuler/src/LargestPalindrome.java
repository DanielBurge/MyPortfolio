
public class LargestPalindrome {
	private static long reversed(long number) {
	long reversed = 0;
	long reduced;
	
	while(number > 0) {
		reduced  = number % 10;
		reversed = (reversed *10) +  reduced;
		number /=10;
	}
		return reversed;
		
	}
	
	private static boolean isPalindrome(long number) {
		return reversed(number) ==  number;
	}
	
	private static long largestPalindrome(long a, long b) {
		long result = 0;
		long largest = 0;
		for(long x = a; x>=0; x--) {
			for(long y = b; y>=0; y--){
				result = y*x;
				if(isPalindrome(result))
					largest = Math.max(largest, result);
			}
			}
		return largest;
	}
	public static void main(String[] args) {
		System.out.println(largestPalindrome(999,999));
	}
}

	


