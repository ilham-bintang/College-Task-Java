public class Karyawan 
{
	private String nama;
	private Tanggal lahir;	
	private Tanggal kerja;

	public Karyawan (String nama, Tanggal lahir, Tanggal kerja)
	{
		this.nama	= nama;
		this.lahir	= lahir;
		this.kerja	= kerja;
	}

	public String toString()
	{
		return String.format("%s Dipekerjakan : %s. Tanggal lahir : %s",
			nama, kerja, lahir);
	}
}