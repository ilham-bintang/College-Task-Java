//by Ilham Bintang

import java.util.Scanner;

class Implementasi {
	public static void main(String[] args) {

		String nama, kelas;
		int jumlah = 8, index = 0, tinggi;
		float total = 0, rata = 0;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Jumlah mahasiswa ");		
		jumlah = s.nextInt();

		Mahasiswa [] mhs = new Mahasiswa [jumlah];


		for (int i=0;i<jumlah;i++ ) {
			System.out.println("Nama mahasiswa ke "+(i+1));		
			nama = s.next();

			System.out.println("Kelas mahasiswa ke "+(i+1));		
			kelas = s.next();

			System.out.println("Tinggi mahasiswa ke "+(i+1));		
			tinggi = s.nextInt();

			mhs[i] = new Mahasiswa(nama, kelas, tinggi);
		}

	
		for (int i=0;i<jumlah;i++ ) {
			total = total + mhs[i].getNilai();
		}
		rata = total/jumlah;
		System.out.println("Rata rata tinggi mahasiswa = : " + rata);
	}
}