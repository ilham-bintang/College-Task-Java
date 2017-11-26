class Node {
	int usia;
	String nama, pekerjaan, jk;
	Node kanan, kiri;

	public Node (int u, String n, String p, String j) {
		usia = u; nama = n; pekerjaan = p; jk = j;
		kanan = kiri = null;
	}
}

class Tree {
	Node root;
	int jumlah;

	public void tambah(int u, String n, String p, String j) {
		Node anak = new Node(u,n,p,j);
		Node tmp2;

		if(jumlah==0) {
			root = anak;
			jumlah++;
		}
		else {
			Node tmp = root;
			tmp2=root;
			//cari posisi
			while (tmp != null ) {
				tmp2=tmp;
				if (anak.usia < tmp.usia) {					
					tmp = tmp.kiri;
				}
				else {
					tmp = tmp.kanan;	
				}
			}
			//nyambung pointer
			if (anak.usia < tmp2.usia) {
				tmp2.kiri = anak;
			}
			else {
				tmp2.kanan = anak;	
			}
		}
	}

	public void cetak() {
		cetakLagi(root);
	}
	public void cetakLagi(Node induk) {		

		while(induk!=null) {
		
			System.out.print(induk.nama + " ");
			cetakLagi(induk.kiri);
			cetakLagi(induk.kanan);
		}
	}
}

public class Utama {
	public static void main(String[] args) {
		Tree t = new Tree();
		t.tambah(100,"kakek buyut", "Petani", "laki-laki");
		t.tambah(70,"kakek ", "peternak", "laki-laki");
		t.tambah(80,"lisa ", "penjahit", "perempuan");
		t.cetak();
	}
}