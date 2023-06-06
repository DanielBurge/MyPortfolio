package _14analysisOfAlgorithms;

public class TwoSum {
	
	public static int count(int[] a) {
		int count = 0;
		int N = a.length;
		for(int i=0; i<N;i++){
			for(int j=i+1;j<N;j++) {
				if(a[i]+a[j]==0) {
					
				}
			
			}
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] a = {1,-1,0,0,3,-3,-2};
		int[] b = {-1,1};
		System.out.print(count(b));
		
	}

}
