import java.util.Scanner;

class TestAsosiasi { 

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);

		Account a1 = new Account(100000);
		Account a2 = new Account(200000);
		Account a3 = new Account(300000);
		Account a4 = new Account(400000);
		Account a5 = new Account(500000);

		System.out.println("Masukkan nama depan : ");
		String namaDepan = sc.next();
		System.out.println("Masukkan nama belakang : ");
		String namaBelakang = sc.next();

		Customer c1 = new Customer(namaDepan,namaBelakang);

		System.out.println("Nama anda : "+c1.getNamaDepan()+ " " + c1.getNamaBelakang());
		System.out.println();

		System.out.println("Misalkan sudah membuat 5 akun ");
		c1.setAccount(a1);
		c1.setAccount(a2);
		c1.setAccount(a3);
		c1.setAccount(a4);
		c1.setAccount(a5);

		System.out.println();
		System.out.println("Saldo awal di a1: " +a1.cekSaldo());
		System.out.println("Saldo awal di a2: " +a2.cekSaldo());
		System.out.println("Saldo awal di a3: " +a3.cekSaldo());
		System.out.println("Saldo awal di a4: " +a4.cekSaldo());
		System.out.println("Saldo awal di a5: " +a5.cekSaldo());

		a1.tabung(10000);
		a2.tabung(10000);
		a3.tabung(10000);
		a4.tabung(10000);
		a5.tabung(10000);

		System.out.println();
		System.out.println("Misalkan di tabung 10.000 ke setiap akun:");
		System.out.println("Saldo setelah di tabung pada a1 : " + a1.cekSaldo());
		System.out.println("Saldo setelah di tabung pada a2 : " + a2.cekSaldo());
		System.out.println("Saldo setelah di tabung pada a3 : " + a3.cekSaldo());
		System.out.println("Saldo setelah di tabung pada a4 : " + a4.cekSaldo());
		System.out.println("Saldo setelah di tabung pada a5 : " + a5.cekSaldo());

		
		a1.tarikTunai(5000);
		a2.tarikTunai(5000);
		a3.tarikTunai(5000);
		a4.tarikTunai(5000);
		a5.tarikTunai(5000);

		System.out.println();
		System.out.println("Misalkan di tarik 5.000 ke setiap akun");
		System.out.println("Saldo setelah penarikan a1: " +a1.cekSaldo());
		System.out.println("Saldo setelah penarikan a2: " +a2.cekSaldo());
		System.out.println("Saldo setelah penarikan a3: " +a3.cekSaldo());
		System.out.println("Saldo setelah penarikan a4: " +a4.cekSaldo());
		System.out.println("Saldo setelah penarikan a5: " +a5.cekSaldo());
	}
}