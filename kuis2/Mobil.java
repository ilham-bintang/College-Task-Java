class Mobil extends Kendaraan {
	public Mobil(String w, String m) {
		super(4,w,m);
	}
	//override
	public void caraBerkendara() {
		System.out.println("Di tarik gas pada kaki kanan dan gerakkan stir");
	}
	
}