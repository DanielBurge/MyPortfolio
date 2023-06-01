package quickfind;

public class QuickUnionUF {
	private int[] id;
	
	public QuickUnionUF(int N) {
		// set id of each object to itself (N array accesses)
		id = new int[N];
		for(int i = 0; i<N;i++) 
			id[i] = i;
		
	}
	private int root(int i) {
		// chase parent pointers until reach root (depth of i array accesses)
		while (i != id[i])
		i= id[i];
		return i;
		
	}
	public boolean connected(int p, int q) {
		//check if p and q have same root (depth of p and q array accesses)
		return root(p) == root(q);
	}
	public void union(int p,int q) {
		// change root of p to point to root of q (depth of p and q array accesses)
		int i = root(q);
		int j = root(q);
		id[i] = j;
	}
	
	public static void main(String[] args) {
		QuickUnionUF array = new QuickUnionUF(9);
		array.id[2] = 8;
		array.union(3, 4);
		array.union(4, 8);
		System.out.println(array.connected(2, 7));
	}

}
