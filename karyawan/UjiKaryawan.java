public class UjiKaryawan 
{
	public static void main(String[] args) {
		Tanggal lahir = new Tanggal(4,10,1996);
		Tanggal kerja = new Tanggal(5,7,2016);
		Karyawan karyawan = new Karyawan("Ilham Bintang", lahir, kerja);

		System.out.println(karyawan.toString);
	}	
}