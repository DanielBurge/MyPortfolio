
public class SumSquareDifferences {
	public static long sumOfNSquares(int N){
		   // This is the standard mathematical formula I learnt in grade 10
		    return (long) (N*(N+1)*(2*N+1))/6;
		}
		public static long squareofSum(int N){
		   // Another standard mathematical formula. I took a square of it
		    return (long) Math.pow( (N * N+1) /2, 2);
		}

		public static void main(String [] args){
		    System.out.println(Math.abs(sumOfNSquares(100) - squareofSum(100)));
		}

}
