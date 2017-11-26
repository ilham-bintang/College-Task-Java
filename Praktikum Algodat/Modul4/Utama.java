class Node {
	int usia;
	String nama, pekerjaan, jk;
	Node kanan, kiri;

	public Node (int u, String n, String p, String j) {
		usia = (2017-u); nama = n; pekerjaan = p; jk = j;
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
		System.out.println("Pre order");
		cetakPre(root);
		System.out.println("In order");
		cetakIn(root);
		System.out.println("Pos order");
		cetakPos(root);
	}
	public void cetakPre(Node induk) {		
		if(induk!=null) {
			System.out.println(induk.usia + " \t" + induk.nama + " \t\t\t" + induk.jk + " \t\t\t" + induk.pekerjaan);
			cetakPre(induk.kiri);
			cetakPre(induk.kanan);
		}
	}
	public void cetakIn(Node induk) {		
		if(induk!=null) {
			cetakIn(induk.kiri);
			System.out.println(induk.usia + " \t" + induk.nama + " \t\t\t" + induk.jk + " \t\t\t" + induk.pekerjaan);
			cetakIn(induk.kanan);
		}
	}
	public void cetakPos(Node induk) {		
		if(induk!=null) {
			cetakPos(induk.kiri);
			cetakPos(induk.kanan);
			System.out.println(induk.usia + " \t" + induk.nama + " \t\t\t" + induk.jk + " \t\t\t" + induk.pekerjaan);
		}
	}
}

class Utama {
	public static void main(String[] args) {
		Tree t = new Tree();
		t.tambah(1917,"kakek buyut", "peternak", "laki-laki");
		t.tambah(1942,"lisa ", "penjahit", "perempuan");
		t.tambah(1947,"kakek ", "petani", "laki-laki");
		t.tambah(1964,"ani ", "pengrajin", "perempuan");
		t.tambah(1967,"anto ", "nelayan", "laki-laki");
		t.tambah(1969,"rudi ", "dokter", "laki-laki");
		t.tambah(1972,"ayah ", "SE", "laki-laki");
		t.tambah(1992,"husein ", "dokter", "laki-laki");
		t.tambah(1993,"hasan ", "dokter", "laki-laki");
		t.tambah(1994,"santi ", "spg", "perempuan");
		t.tambah(1995,"ida ", "guru tk", "perempuan");
		t.tambah(2012,"tatan ", "anak tk", "laki-laki");
		t.cetak();
	}
}

