package quickfind;

public class QuickFindUF {
	private int[] id;
	
	
	public QuickFindUF(int N) {
	// set id of each object to itself (N array access)
		id = new int[N];
	
	for (int i = 0; i <N; i++) {
		
		id[i] = i;
	}
		
	}
	public boolean connected(int p, int q) {
		//check whether p and q are in the same component
		//(2 array accesses)
		return id[p] == id[q];
	}
	public void union(int p, int q) {
		// change all entries with id[p] to id[q] (at most 2N + 2 array accesses)
		int pid = id[p];
		int qid = id[q];
		
		for(int i = 0;i<id.length; i++)
			if(id[i] == pid)
				id[i] = qid;
		
	}
	public static void main(String[] args) {
	QuickFindUF uf = new QuickFindUF(4);
	uf.union(0, 3);
	uf.union(1, 2);
	uf.union(2, 3);
	/// tree relationship in terms of p and q.
	/// 0-3		1-2 1st two unions only pairs are 0-3 and 1-2
	///		\----/     after 3 unions 0 is not directly connected to 2 but since 2 and 3 unions after 0-3 were connected then they are connected but not union. 
	System.out.println(uf.connected(0, 3));
	System.out.println(uf.connected(1, 2));
	System.out.println(uf.connected(0, 2));
	System.out.println(uf.connected(1, 3));
	
	
		
		
	}
	
}
