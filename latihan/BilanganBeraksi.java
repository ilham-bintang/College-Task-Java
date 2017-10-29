class Bilangan {
	static int pencacah = 0;
	int nilai;

	public Bilangan(int nilai) {
		this.nilai = nilai;
		pencacah++;
	}
	public void info() {
		System.out.println("Nilai \t\t: " + nilai);
		System.out.println("Pencacah \t: " + pencacah);
		System.out.println("");
	}
}
public class BilanganBeraksi {
	public static void main(String[] args) {
		Bilangan b1 = new Bilangan(50);
		b1.info();

		Bilangan b2 = new Bilangan(15);
		b2.info();

		Bilangan b3 = new Bilangan(30);
		b3.info();
	}
}