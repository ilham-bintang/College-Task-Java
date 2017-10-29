import java.lang.Math;

class Lingkaran {
	private final double PI = 3.141592;
	private double r = 0;

	public Lingkaran (double r) {
		this.r = r;
	}
	public double hitungLuas() {
		return PI*r*r;
	}
}

class LingkaranBeraksi {
	public static void main(String[] args) {
		Lingkaran l1 = new Lingkaran(11.78);

		System.out.println("Pecahan : " + l1.hitungLuas());

		int x = (int) l1.hitungLuas();
		System.out.println("Casting : " + x);

		double y = Math.round(l1.hitungLuas());
		System.out.println("Rounding : " + y);
	}
}