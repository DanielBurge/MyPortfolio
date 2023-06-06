package _14analysisOfAlgorithms;

public class BinarySearch {
	
	public static int binarySearch(int[] a, int key) {
		int lo = 0, hi = a.length-1;
		while(lo <= hi) {
			int mid = lo + (hi-lo) /2;
			if(key < a[mid]) {
				// if key is smaller ignore right half
				hi = mid -1;
			}
			//
			else if (key > a[mid]) { 
				// if key is greater than mid then ignore left half
				lo = mid +1;
				}
			else {
				// if element is present at the middle int mid = lo + (hi-lo)/2
				return mid;
			
			
				}
			
			}
				return -1;
								}
	public static void main(String[] arg) {
		int[]a = {21,2,31,43,54};
		
		System.out.println(binarySearch(a,54));
		
	}



}
