import java.util.Scanner;

public class Jurnal2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan batas awal: ");
		int awal = sc.nextInt();
		System.out.println("Masukkan batas akhir: ");
		int akhir = sc.nextInt();
		System.out.println("Bilangan prima antara "+awal+ " dan " +akhir + " :");

		int a,b;
		boolean cek;

		for (a = awal; a<=akhir; a++){
			cek = true;
            
            for (b = 2; b < a; b++) {
            	if (a % b == 0) {
            		cek = false;
            	}
            }
            if (cek) {
            	System.out.println(a+ " ");
            }
        }
	}
}