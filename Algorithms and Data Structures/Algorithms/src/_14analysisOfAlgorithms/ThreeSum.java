package _14analysisOfAlgorithms;
// Given N distinct integers, how many triples sum to exactly zero
public class ThreeSum {
	public static int count(int[] a) {
		int N = a.length;
		int count = 0;
		for (int i=0; i<N;i++)
			for (int j = i+1; j<N;j++)
				for(int k = j+1;k<N;k++)
					if (a[i] + a[j] + a[k] == 0)
						count++;
		return count;
	}
	public static void main(String[] args) {
	int[] a = {30,-40,10};//outputs 1
	int[] b = {30,-20,-10};//outputs 1
	int[] c = {10,-10,20,-20}; //outputs 0
	int[] d = {-10,10}; // outputs 0
		System.out.println(count(a));
		System.out.println(count(b));
		System.out.println(count(c));
		System.out.println(count(d));
	}

}
