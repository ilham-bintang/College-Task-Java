public class Waktu 
{
	private int jam;	
	private int menit;
	private int detik;

	public void setWaktu (int jam, int menit, int detik)
	{
		if ((jam >= 0 && jam <24) && (menit >= 0 && menit <60) && (detik >= 0 && detik <60)) 
		{
			this.jam = jam;
			this.menit = menit;
			this.detik = detik;
		}
		else 		
			throw new IllegalArgumentException("jam, menit atau detik kelebihan :v");		
	}

	public String simbol()
	{
		return String.format("%02d:%02d:%02d", jam,menit,detik);
	}

	public String keAmPm()
	{
		int a = ((jam == 0 || jam == 12) ? 12 : jam % 12); 
				//if jam==0 atau 12, (yes: 12) (no:jam%12)

		String b = (jam < 12 ? "AM" : "PM"); 
				// if jam < 12 maka AM else PM

		return String.format("%d:%02d:%02d %s", a, menit, detik, b);
	}
} 