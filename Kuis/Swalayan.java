class Swalayan {
	public static void main(String[] args) {
		Hitung pel1 = new Hitung();
		pel1.setTotalPembelian(550000);
		pel1.setTotalPembelian(200000);
		pel1.setTotalPembelian(100000);
		System.out.println("Total beli = "+ pel1.getTotal());;
		pel1.setJenisMember(false);
		pel1.hitDiskon();
		System.out.println("Total diskon = "+ pel1.getDiskon());;

		System.out.println("Total bayar = "+ pel1.getTotalPembayaran());
	}
}