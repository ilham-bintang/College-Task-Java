	public class HandphoneBeraksi {
		public static void main(String[] args) {
			Handphone nokia = new Handphone();
			nokia.hidupkan();
			nokia.lakukanPanggilan();
			nokia.kirimSMS();
			nokia.matikan();
		}	
	}

	class Handphone {
		public void hidupkan()
		{
			System.out.println("nyala");
		}
		public void lakukanPanggilan()
		{
			System.out.println("memanggil");
		}
		public void kirimSMS()
		{
			System.out.println("mengirim sms");
		}
		public void matikan()
		{
			System.out.println("byebye");
		}
	}
