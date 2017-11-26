class Node {
	int data;

}
class Jurnal1 {
	public static void main(String[] args) {
		//fibonacci
		// int fib,a=1,b=1,c=1;
		// System.out.println(c);
		
		// for (int i=0;i <20 ;i++) {
			
		// 	if (c >100 && c<150) {
				
		// 		System.out.println(c);
		// 	}	
		// 		c=a+b;
		// 		a=b;
		// 		b=c;	
		// 	//}

			
		//  }

		int a=0; 
		int b,t,c;

		t=2;
		b=t+(t-1);

		while (a<=150) {
			//t=t+(t-1);
			c=b+t;
			t=b;
			b=c;

			if (c>100 && c<=150) {
				System.out.println(c);
			}
			a=c;

		}

	}
}