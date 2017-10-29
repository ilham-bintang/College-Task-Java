public class Pesawat {
	public static void main(String[] args) {
		Vertex [] A = new Vertex[10];
		Edge [] B = new Edge[10];

		Vertex xi;
		Vertex xj;

		for (int i=0;i<10 ;i++ ) {
			A[i] = new Vertex("V"+Integer.toString(i),"contoh");
		}
		
		for (int i=0;i<9 ;i++ ) {
			B[i]=new Edge(A[i],A[i+1]);	
		}

		for (int i=0;i<9 ;i++ ) {
			System.out.println(B[i].getDari()+" "+B[i].getKe());
		}

		for (int i=0;i<9 ;i++ ) {
			System.out.println(A[i].alamat);
		}
		
	}
}