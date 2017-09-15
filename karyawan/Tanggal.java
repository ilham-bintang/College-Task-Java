public class Tanggal 
{
	private int hari;
	private int bulan;	
	private int tahun;

	private static final int[] hariPerbulan = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public Tanggal (int hari, int bulan, int tahun)
	{
		this.bulan = cekBulan(bulan);
		this.hari = cekHari(hari);
		this.tahun = tahun;
	}


	private int cekBulan(int cek)
	{
		if (cek > 0 && cek <= 12) 
		{
			return cek;
		}
		else
			throw new IllegalArgumentException("bulan diluar rentang yang valid");
	}	

	private int cekHari(int cek)
	{
		if (cek > 0 && cek <= hariPerbulan[this.bulan]) 
		{
			return cek;
		}
		else
			throw new IllegalArgumentException("hari diluar rentang yang valid");
	}

	public String toString()
	{
		return String.format("%d/%d/%d", this.hari, this.bulan, this.tahun);
	}
}