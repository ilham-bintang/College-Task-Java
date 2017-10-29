class Ayah {	
	public Ayah (String nama, int tipeRumah, double hargaRumah) {
		Pbb.nama = nama;
		Pbb.tipeRumah = tipeRumah;
		Pbb.hargaRumah = hargaRumah;
		Pbb.hitungPajak();
	}
	public double getPajakAyah() { 	return Pbb.pajak;	}
	public String getNamaAyah() { 	return Pbb.nama;	}
	public double getTipeRumah() { return Pbb.tipeRumah;	}
	public double getHargaRumah() { return Pbb.hargaRumah;	}
}