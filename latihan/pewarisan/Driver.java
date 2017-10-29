class Driver {
	public static void main(String[] args) {
		Pegawai p1 = new Pegawai("Ali", 100000);

		System.out.println("data pegawai 1 : " + p1.getNama()+ " \tgajinya : " + p1.getGaji());

		Staf s1 = new Staf("Ari", 100000);
		s1.setLembur(10000);

		System.out.println("data staff 1   : " + s1.getNama()+ " \tgajinya : " + s1.getGaji());		

		Manajer m1 = new Manajer("Aji", 100000);
		m1.setTunjangan(5000);
		m1.setBonus(10000);

		System.out.println("data manajer 1 : " + m1.getNama()+ " \tgajinya : " + m1.getGaji());		
	}
}