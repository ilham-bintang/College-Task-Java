class Motor extends Kendaraan {

	public Motor(String w, String m) {
		super(2,w,m);
	}
	
	@override
	public void caraBerkendara() {
		System.out.println("Tarik gas tangan dan gerakkan stang ke arah yang dikehendaki");
	}	
}