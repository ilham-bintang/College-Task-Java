public class Vertex {
	public static String nama;
	public static String alamat;
	
	public Vertex (String x, String y) {
		nama=x;
		alamat = y;
	}

	public boolean cari(String x){
		if (x.equals(nama)){
			return true;
		}
		return false;
	}
}