import java.util.ArrayList;

class Tumbuhan {

	public Tumbuhan(String x) {
		System.out.println("Tumbuhan berhasil dibuat dengan nama " + x);
	}
	public Tumbuhan() {
		System.out.print("ini super dan di buat objek ... ");
	}
	public void print() {	

		for (int i =0;i<Paku.pk.size() ;i++ ) {
			System.out.print("Paku bernafas dengan "+Paku.pk.get(i).getNapas());		
			System.out.println(", berkembang biak dengan "+Paku.pk.get(i).getBiak());						
		}
		for (int i =0;i<Mangga.mg.size() ;i++ ) {
			System.out.print("Mangga bernafas dengan "+Mangga.mg.get(i).getNapas());		
			System.out.println(", berkembang biak dengan "+Mangga.mg.get(i).getBiak());						
		}

	}
	public void layu() {
		System.out.println("Tumbuahn layu ");
	}
	public void tumbuh() {
		System.out.println("Tumbuahn tumbuh ");	
	}
	public void berbuah() {
		System.out.println("Tumbuahn berbuah ");
	}
}
class Paku extends Tumbuhan {
	public static ArrayList <Paku> pk = new ArrayList<>();

	public String nafas;
	public String biak;

	public Paku() {
		System.out.println("Paku");		
	}
	public void setNapas(String p) {
		nafas=p;
	}
	public String getNapas() {
		return nafas;
	}	
	public void setBiak(String b) {
		biak=b;
	}
	public String getBiak() {
		return biak;
	}		
	public static void addPaku(Paku p) {		
		pk.add(p);
	}
}
class Mangga extends Tumbuhan {
	public static ArrayList <Mangga> mg = new ArrayList<>();

	public String nafas;
	public String biak;

	public Mangga() {
		System.out.println("Mangga");		
	}
	public void setNapas(String p) {
		nafas=p;
	}
	public String getNapas() {
		return nafas;
	}	
	public void setBiak(String b) {
		biak=b;
	}
	public String getBiak() {
		return biak;
	}		
	public static void addMangga(Mangga m) {		
		mg.add(m);
	}
}
class Utama {
	public static void main(String[] args) {
		Paku p1 = new Paku();
		p1.setNapas("Daun");
		p1.setBiak("Siram");
		Paku.addPaku(p1);

		Mangga m1 = new Mangga();
		m1.setNapas("Daun");
		m1.setBiak("Siram");
		Mangga.addMangga(m1);

		Tumbuhan t = new Tumbuhan("tanamanku");
		t.print();
		t.layu();
	}
}