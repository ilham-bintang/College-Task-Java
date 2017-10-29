//by Ilham Bintang

class Kalkulator {
	public float a = 0,b = 0, hasil;
	public int operasi;

	public void proses (int operasi) {
		switch (operasi) {
			case 1 : hasil = a+b; break;
			case 2 : hasil = a*b; break;
			case 3 : hasil = a/b; break;
			default: break;
		}
	}
	public void setNilai(float a, float b) {
		this.a = a;
		this.b = b;
	}
	public float getNilai() { return hasil;	}
}