//by Ilham Bintang

import java.util.Scanner;

class Utama {
	public static void main(String[] args) {
		int a = 0, b = 0, pilih;

		Scanner s = new Scanner(System.in);

		System.out.println("Masukkan angka pertama : ");
		a = s.nextInt();

		System.out.println("Masukkan angka kedua : ");
		b = s.nextInt();

		System.out.println("Pilih operasi : ");
		System.out.println("1. tambah");
		System.out.println("2. kali");
		System.out.println("3. bagi");
		pilih = s.nextInt();

		//System.out.println(pilih);
		Kalkulator k = new Kalkulator();

		k.setNilai(a,b);
		k.proses(pilih);
		System.out.println("Hasilnya : "+k.getNilai());
	}
}