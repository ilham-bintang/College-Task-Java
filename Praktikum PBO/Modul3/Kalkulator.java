class Kalkulator {
	public static float hasil = 0;	

	public float getHasil() {
		return hasil;
	}
}
class Tambah extends Kalkulator {	
	public void hitung(int x) {
		Kalkulator.hasil = Kalkulator.hasil+x;
	}
}
class Kurang extends Kalkulator {	
	public void hitung(int x) {
		Kalkulator.hasil = Kalkulator.hasil-x;
	}
}
class Kali extends Kalkulator {	
	public void hitung(int x) {
		Kalkulator.hasil = Kalkulator.hasil*x;
	}
}
class Bagi extends Kalkulator {	
	public void hitung(int x) {
		Kalkulator.hasil = Kalkulator.hasil/x;
	}
}
class Drive {
	public static void main(String[] args) {
		Tambah tambahan = new Tambah();
		tambahan.hitung(2);
		tambahan.hitung(3);

		Kalkulator k = new Kalkulator();
		System.out.println("Hasil = " + k.getHasil());
	}
}