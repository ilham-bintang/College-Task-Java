abstract class Kendaraan {
	int roda;
	String warna;
	String merk;

	//overloading
	public Kendaraan(int r, String w, String m) {
		roda=r;
		warna=w;
		merk=m;
	}
	//overloading
	public Kendaraan(int r) {
		roda=r;
	}
	//overloading	
	public Kendaraan(String w, String m) {		
		warna=w;
		merk=m;
	}
	
	public int getRoda() {
		return roda;
	}
	public String getWarna() {
		return warna;
	}	
	public String getMerk() {
		return merk;
	}		
	//abstrak
	public abstract void caraBerkendara();
	
}
