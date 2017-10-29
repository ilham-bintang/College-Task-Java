//by Ilham Bintang

class Mahasiswa {
	private String nama = "";
	private String kelas = "";
	private int tinggi = 0;

	public Mahasiswa(String n, String k, int ni) {
		nama = n;
		kelas = k;
		tinggi = ni;	
	}
	public int getNilai() { return tinggi; }
	public String getNama() { return nama; }
	public String getKelas() { return kelas; }
	
}