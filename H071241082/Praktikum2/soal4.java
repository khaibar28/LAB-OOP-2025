class Alamat {
	String jalan;
	String kota;

	public String toString() {
		return jalan + ", " + kota;
	}
}

class Mahasiswa {
	String nama;
	String nim;
	Alamat alamat;
}

public class soal4 {
	public static void main(String[] args) {
		Alamat alamat = new Alamat();
		Mahasiswa mahasiswa = new Mahasiswa();

		alamat.jalan		= "Tamalanrea Indah";
		alamat.kota			= "Makassar";
		mahasiswa.nama		= "Ryan firmansyah";
		mahasiswa.nim		= "H071241082";
		mahasiswa.alamat	= alamat;

		System.out.println("Nama: " + mahasiswa.nama);
		System.out.println("NIM: " + mahasiswa.nim);
		System.out.println("Alamat: " + mahasiswa.alamat);
	}

}