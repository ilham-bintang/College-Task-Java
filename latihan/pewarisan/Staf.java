class Staf extends Pegawai {
	protected double lembur;

	public Staf(String n, double g) { super(n,g); }
	public void setLembur(double l) {
		lembur = l;
	}

	public double getGaji() { return super.getGaji()+lembur; }
}