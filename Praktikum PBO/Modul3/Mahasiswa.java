import java.util.ArrayList;

class Mahasiswa{
	String nama;
	String nim;

	public void print() {
		for (int i =0;i<MahasiswaKRS.mhs.size() ;i++ ) {
			System.out.println("Nama "+MahasiswaKRS.mhs.get(i).nama);		
			System.out.println("NIM "+MahasiswaKRS.mhs.get(i).nim);						
		}
	}
}
class MahasiswaKRS extends Mahasiswa {
	public static ArrayList<MahasiswaKRS> mhs = new ArrayList<>();
	String makul;

	public MahasiswaKRS(String n, String ni, String ma) {
		super.nama = n;
		super.nim = ni;
		makul=ma;
	}
	public static void tambahMhs(MahasiswaKRS m) {
		mhs.add(m);
	}

}
class Baru {
	public static void main(String[] args) {
		MahasiswaKRS m = new MahasiswaKRS("bintang","F1D015035","SBD");
		
		MahasiswaKRS.tambahMhs(m);

		Mahasiswa mh = new Mahasiswa();
		mh.print();
		// System.out.println("Nama : " + m.getNama());
	}
}