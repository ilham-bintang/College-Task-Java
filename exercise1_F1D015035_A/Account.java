class Account {
	protected double saldo;

	public Account(double sal) {
		saldo = sal;
	}
	public double cekSaldo() {
		return saldo;
	}
	public boolean tabung(double jumlah) {
		if (jumlah>0) {
			saldo = saldo + jumlah;
			return true;
		} else
			return false;
	}
	public boolean tarikTunai(double jumlah) {
		if ( saldo >= jumlah ) {
		saldo = saldo - jumlah;
		return true;
		} else
		return false;
	}
}