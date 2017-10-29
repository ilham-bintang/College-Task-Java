class Customer {
	private String namaDepan;
	private String namaBelakang;
	private Account[] accounts = new Account[5];
	private int jumlahAkun = 0;

	public Customer(String f, String l) {
		namaDepan = f;
		namaBelakang = l;
	}

	public String getNamaDepan() {
		return namaDepan;
	}
	public String getNamaBelakang() {
		return namaBelakang;
	}
	public void setAccount(Account acct) {
		if (jumlahAkun<5)
			accounts[jumlahAkun++] = acct;
		else 
			System.out.println("Maaf anda maksimal memiliki 5 akun");
	}
	public Account getAccount(int account_index) {
		return accounts[account_index];
	}
	public int getNumOfAccounts() {
		return jumlahAkun;
	}	
}