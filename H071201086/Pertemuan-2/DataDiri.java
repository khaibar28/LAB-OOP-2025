package TugasPraktikum02;

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

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getAlamat() {
        return alamat.toString();
    }
}


public class DataDiri {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Daya";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Wiwit";
        mahasiswa.nim = "H071201086";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}
