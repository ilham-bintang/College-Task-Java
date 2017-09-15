public class UjiWaktu 
{
	public static void main(String[] args) 
	{
		Waktu waktu = new Waktu();

		System.out.print("Waktu sebelum inisialisasi dalam simbol : ");
		System.out.println(waktu.simbol());

		System.out.print("Waktu sebelum inisialisasi dalam AM PM : ");
		System.out.println(waktu.keAmPm());		

		System.out.println();

//========================SET WAKTU=============================
		waktu.setWaktu (13, 27, 6);

		System.out.print("Waktu setelah inisialisasi dalam simbol : ");
		System.out.println(waktu.simbol());

		System.out.print("Waktu setelah inisialisasi dalam AM PM : ");
		System.out.println(waktu.keAmPm());		

		System.out.println();		


		try
		{
			waktu.setWaktu(99,99,99); //uji error
		}
		catch (IllegalArgumentException e) {
			System.out.printf("Error : %s", e.getMessage());					
		}

	}	
}