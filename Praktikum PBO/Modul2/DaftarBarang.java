//by Ilham Bintang

import java.util.*;

class DaftarBarang {
	public static void main(String[] args) {
		int total=0;
		Barang b1 = new Barang(1,"Oreo",2000);
		Barang b2 = new Barang(2,"Beng-beng",2500);
		Barang b3 = new Barang(3,"Biskuat",1000);

		ArrayList<Barang> obj = new ArrayList<Barang>();

		obj.add(b1);
		obj.add(b2);
		obj.add(b3);

		//System.out.println("Objeknya : "+obj); 							
		System.out.println("========Data barang========"); 		
		System.out.println("Kode\tNama\t\t\tHarga\t\t"); 		
		for (int i =0;i<3 ;i++ ) {
			System.out.println(obj.get(i).getKode()+"\t"+obj.get(i).getNama()+"\t\t\t"+obj.get(i).getHarga());
		}
		for (int i =0;i<3 ;i++ ) {
			total=total+obj.get(i).getHarga();
		}
		System.out.println("total harga : "+total);
	 	

   }
}