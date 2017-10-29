import java.util.Scanner;

class ArrayListNamaNIM {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Jumlah mhs : ");
		int ukuran = sc.nextInt();
		String[][] mhs = new String[ukuran][2];
		
		
		for (int i=0;i<ukuran;i++) {
			System.out.println("Masukkan nama mahasiswa");
			mhs[i][0] = sc.next();

			System.out.println("Masukkan nim mahasiswa");
			mhs[i][1] = sc.next();

		}
		System.out.println("Data mahasiswa : ");
		for (int i=0;i<ukuran;i++) {
			System.out.println("Nama : " + mhs[i][0]);
			System.out.println("NIM : " + mhs[i][1]);
			System.out.println();
		}
	}
}