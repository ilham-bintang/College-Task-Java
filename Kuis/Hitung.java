class Hitung {
	private double totalPembelian = 0;
	private boolean vip = false;
	private double diskon = 0;
	private double totalPembayaran = 0;

	public void setTotalPembelian (double beli) {
		totalPembelian += beli;
	}
	public void setJenisMember (boolean member) {
		vip = member;
	}
	public double getTotal() {
		return totalPembelian;
	}
	public double getDiskon() {
		return diskon;
	}	
	public void hitDiskon() {
		if (totalPembelian > 1000000) diskon = totalPembelian*0.1;
		else if (totalPembelian >= 500000 && totalPembelian < 1000000) diskon = totalPembelian*0.05;
		else if (totalPembelian >= 100000 && totalPembelian < 500000) diskon = totalPembelian*0.025;
		else diskon = 0;

		if ((vip && totalPembelian >= 50000) || (!vip && totalPembelian >= 100000)) 
			diskon = diskon + (totalPembelian*0.01);
	}
	public double getTotalPembayaran() {
		totalPembayaran = totalPembelian - diskon;
		return totalPembayaran;
	}
}