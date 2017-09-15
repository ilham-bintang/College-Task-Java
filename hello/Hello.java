public class Hello 
{
	public static void main(String[] args) {
		Mobil mobilan = new Mobil();
		
		mobilan.setNama("Avanza");
		mobilan.setUkuran(15);

		System.out.println("nama mobil 	: " + mobilan.getNama());
		System.out.println("ukuran 		: " + mobilan.getUkuran());
		
	}

}