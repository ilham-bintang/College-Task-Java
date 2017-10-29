import java.util.Scanner;
import java.util.ArrayList;

class Toko_Alat_Tulis 
{	private static int jum =0;
	private static double harga = 0, diskon;
	private static String status;
	private static ArrayList kode = new ArrayList();
	private static String kd;

	public static void input() {
		Scanner sc = new Scanner(System.in);
		
		do {
			jum++;
			kd = sc.nextLine();
			kode.add(kd);
			status = sc.nextLine();
		} while(!status.equals("T"));
	}
	public static void bayar() {
		for (int i=0;i<jum ;i++ ) {
			if(kode.get(i).equals("A")) harga+=3500;
			if(kode.get(i).equals("B")) harga+=3500;
			if(kode.get(i).equals("C")) harga+=3500;
			if(kode.get(i).equals("D")) harga+=3500;
			if(kode.get(i).equals("E")) harga+=3500;
			if(kode.get(i).equals("F")) harga+=3500;
				case "A" : harga+=3500;
				case "B" : harga+=8000;
				case "C" : harga+=6000;
				case "D" : harga+=12000;
				case "E" : harga+=2000;
				case "F" : harga+=3000;
				case "G" : harga+=9000;
				case "H" : harga+=15000;
				case "I" : harga+=2000;
				case "J" : harga+=2500;
				default  : harga=0;
			}
		}
	}
	public static void hitDiskon() {
		if (harga >= 500000) diskon = 0.2;
		else if (harga >= 100000) diskon = 0.1;
		else if (harga >= 50000) diskon = 0.075;
		else if (harga >= 35000) diskon = 0.05;
		else diskon = 0;
	}
	public static void cetak() {
		System.out.println("Total belanja : " + harga);
		System.out.println("Diskon 		  : " + diskon);
		System.out.println("Total bayar : " + (harga-diskon));
	}

	public static void main(String[] args) { 
		input();
		bayar();
		hitDiskon();
		cetak();
	}	
}