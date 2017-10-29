import java.util.Scanner;

class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("PILIH MENU:");
			System.out.println("1. perkalian");
			System.out.println("2. penjumlahan");
			System.out.println("3. pembagian");
			System.out.println("4. pengurangan");
			int pilih = sc.nextInt();

			System.out.println("Masukkan angka pertama");
			int a = sc.nextInt();

			System.out.println("Masukkan angka kedua");
			int b = sc.nextInt();

			switch (pilih) {
				case 1 : perkalian(a,b);	break;
				case 2 : penjumlahan(a,b);	break;
				case 3 : pembagian(a,b);	break;
				case 4 : pengurangan(a,b);	break;
				default: System.out.println("Pilihan tidak tersedia");				
			}
	}
	public static void perkalian (int a, int b) {
		System.out.println("Hasilnya : "+ (a*b));
	}
	public static void penjumlahan (int a, int b) {
		System.out.println("Hasilnya : "+ (a+b));
	}	
	public static void pembagian (int a, int b) {
		System.out.println("Hasilnya : "+ (a/b));
	}
	public static void pengurangan (int a, int b) {
		System.out.println("Hasilnya : " + (a-b));
	}
}