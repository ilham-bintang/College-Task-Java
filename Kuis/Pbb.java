class Pbb {
	public static String nama = "";
	public static int tipeRumah = 0;
	public static double pajak = 0;
	public static double hargaRumah = 0;

	// public void setTipeRumah (int tipe) { tipeRumah = tipe; }

	// public void setHargaRumah (double harga) { hargaRumah = harga; }

	public static void hitungPajak() {
			 if (tipeRumah == 36) pajak = hargaRumah*0.04;
		else if (tipeRumah == 45) pajak = hargaRumah*0.06;
		else if (tipeRumah >= 90) pajak = hargaRumah*0.09;		
	}

}