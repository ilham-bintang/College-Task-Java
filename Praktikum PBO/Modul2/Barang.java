//by Ilham Bintang

class Barang {
	int kode;
	String nama;
	int harga;

	public Barang(int k, String n, int h) {
		kode = k;
		nama = n;
		harga = h;
	}
	public int getKode() {
		return kode;
	}
	public int getHarga() {
		return harga;
	}
	public String getNama() {
		return nama;
	}
}