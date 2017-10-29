class Mobil 
{
	private String nama;
	private int ukuran;

	public void setNama(String nama) {	this.nama = nama; }
	public void setUkuran(int ukuran){	this.ukuran = ukuran; }

	public String getNama()	{	return this.nama;	}
	public int getUkuran()	{	return this.ukuran; }
}

public class Hello 
{
	public static void main(String[] args) 
	{
		Mobil mobilan = new Mobil();
		
		mobilan.setNama("Avanza");
		mobilan.setUkuran(15);

		System.out.println("Nama mobil 	: " + mobilan.getNama());
		System.out.println("Ukuran 		: " + mobilan.getUkuran());
		
	}

}