class Rumah {
	public static void main(String[] args) {
		// Pbb akbar = new Pbb();
		// akbar.setTipeRumah(36);
		// akbar.setHargaRumah(200000000);
		// System.out.println("Harga rumah pak akbar = 200000000");
		// System.out.println("Pajak rumah pak akbar = " + akbar.getPajak());

		// Pbb bambang = new Pbb();
		// bambang.setTipeRumah(45);
		// bambang.setHargaRumah(350000000);
		// System.out.println("Harga rumah pak bambang = 350000000");
		// System.out.println("Pajak rumah pak bambang = " + bambang.getPajak());

		// Pbb charlie = new Pbb();
		// charlie.setTipeRumah(90);
		// charlie.setHargaRumah(500000000);
		// System.out.println("Harga rumah pak charlie = 500000000");
		// System.out.println("Pajak rumah pak charlie = " + charlie.getPajak());

		Ayah akbar = new Ayah("akbar", 36, 200000000);
		System.out.println("Nama = " + akbar.getNamaAyah());
		System.out.println("Tipe Rumah = " + akbar.getTipeRumah());
		System.out.println("Harga Rumah = " + akbar.getHargaRumah());
		System.out.println("Pajak rumah = " + akbar.getPajakAyah());
		System.out.println();


		Ayah bambang = new Ayah("bambang", 45, 350000000);
		System.out.println("Nama = " + bambang.getNamaAyah());
		System.out.println("Tipe Rumah = " + bambang.getTipeRumah());
		System.out.println("Harga Rumah = " + bambang.getHargaRumah());
		System.out.println("Pajak rumah = " + bambang.getPajakAyah());
		System.out.println();		


		Ayah charlie = new Ayah("charlie", 90, 500000000);

		System.out.println("Nama = " + charlie.getNamaAyah());
		System.out.println("Tipe Rumah = " + charlie.getTipeRumah());
		System.out.println("Harga Rumah = " + charlie.getHargaRumah());
		System.out.println("Pajak rumah = " + charlie.getPajakAyah());
		System.out.println();

		// akbar.setTipeRumah(36);
		// akbar.setHargaRumah(200000000);
		// System.out.println("Harga rumah pak akbar = 200000000");
//		System.out.println("Pajak rumah pak akbar = " + akbar.getPajak());
	}
}