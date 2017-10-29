class Manajer extends Pegawai {

	protected double tunjangan;
	protected double bonus;

	public Manajer(String n, double g) {
		super(n,g);
	}
	public void setTunjangan(double t) { tunjangan = t; }
	public void setBonus(double b) { bonus = b; }
	public double getGaji() { return super.getGaji()+tunjangan+bonus; }
}