public class Pemilik {
    String nama;
    String jenisBank;

    public Pemilik() {
        this.nama = "Tidak diketahui";
        this.jenisBank = "Tidak diketahui";
    }

    public Pemilik(String nama, String jenisBank) {
        this.nama = nama;
        this.jenisBank = jenisBank;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisBank() {
        return jenisBank;
    }
}
