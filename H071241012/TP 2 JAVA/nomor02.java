public class nomor02
 {
    String id;
    String nama;
    int stok;
    double harga;

    public nomor02(String kode, String name, int jumlah, double hargabarang) {
        id = kode;
        nama = name;
        stok = jumlah;
        harga = hargabarang;
    }
    public void tampilkanDataProduk() {
        System.out.println("ID Produk   : " + id);
        System.out.println("Nama Produk : " + nama);
        System.out.println("Stok        : " + stok);
        System.out.println("Harga       : Rp " + harga);
    }
    public void cekStok() {
        if (stok > 0) {
            System.out.println("Produk tersedia di stok.");
        } else {
            System.out.println("Produk sedang habis.");
        }
    }
    public static void main(String[] args) {
        nomor02 produk1 = new nomor02("123r", "teh", 7, 18000);
        nomor02 produk2= new nomor02("er56", "baju", 8, 8000);

        produk1.tampilkanDataProduk();
        produk1.cekStok();

        produk2.tampilkanDataProduk();
        produk2.cekStok();
    }
}
