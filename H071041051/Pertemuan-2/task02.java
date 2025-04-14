public class task02 {
    public static class Produk {
        private int id;
        private String nama;
        private int stok;
        private int harga;
    
        public Produk(int id, String nama, int stok, int harga) {
            this.id = id;
            this.nama = nama;
            this.stok = stok;
            this.harga = harga;
        }
    
        public void tampilkanInformasi() {
            System.out.println("ID : " + id);
            System.out.println("Nama : " + nama);
            System.out.println("Stok : " + stok);
            System.out.println("Harga : " + harga);
            System.out.println("Status : " + (stok > 0 ? "Tersedia" : "Tidak Tersedia"));
        }
    }
    public static void main(String[] args) {
        Produk produk = new Produk(1, "Produk A", 10, 10000);
        produk.tampilkanInformasi();
        Produk produk2 = new Produk(1, "Produk B", 0, 10000);
        produk2.tampilkanInformasi();
    }
}

