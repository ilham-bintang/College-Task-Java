class Matematika {
	public static int pertambahan(int a, int b) {	return a+b;	}
	public static int pengurangan(int a, int b) {	return a-b;	}
	public static int perkalian(int a, int b) 	{	return a*b;	}	
	public static int pembagian(int a, int b) 	{	return a/b;	}	
}

class MatematikaBeraksi {
	public static void main(String[] args) {
		System.out.println("Hasil pertambahan : 20+20 = " + Matematika.pertambahan(20,20));
		System.out.println("Hasil pengurangan : 10-5  = " + Matematika.pengurangan(10,5));
		System.out.println("Hasil perkalian   : 10*20 = " + Matematika.perkalian(10,20));
		System.out.println("Hasil pembagian   : 21/2  = " + Matematika.pembagian(21,2));
	}
}