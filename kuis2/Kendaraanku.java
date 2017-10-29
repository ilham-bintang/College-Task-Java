class Kendaraanku {
	public static void main(String[] args) {
		Motor a = new Motor("merah", "yamaha");
		Motor b = new Motor("biru", "honda");
		Mobil c = new Mobil("Abu","Daihatsu");

		System.out.println("Ini adalah Motor, motor ini berwarna "+a.getWarna());
		System.out.println("motor ini bermerk "+a.getMerk());
		System.out.println("motor ini memiliki "+a.getRoda()+ " roda");
		a.caraBerkendara();
		System.out.println();

		System.out.println("Ini adalah Motor, motor ini berwarna "+b.getWarna());
		System.out.println("motor ini bermerk "+b.getMerk());
		System.out.println("motor ini memiliki "+b.getRoda()+ " roda");
		b.caraBerkendara();
		System.out.println();
		
		System.out.println("Ini adalah Mobil, Mobil ini berwarna "+c.getWarna());
		System.out.println("Mobil ini bermerk "+c.getMerk());
		System.out.println("Mobil ini memiliki "+c.getRoda()+ " roda");
		c.caraBerkendara();
		System.out.println();
	}
}
