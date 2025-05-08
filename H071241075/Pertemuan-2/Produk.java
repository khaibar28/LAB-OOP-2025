public class Produk {

    String id;
    String nama;
    int stok;
    double harga;

    public void setId(String i) {
        this.id = i;
    }

    public void setNama(String n) {
        this.nama = n;
    }

    public void setStok(int s) {
        this.stok = s;
    }

    public void setHarga(double h) {
        this.harga = h;
    }

    public void tampilkanInfo() {
        System.out.println("ID Produk: " + id);
        System.out.println("Nama Produk: " + nama);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: Rp" + harga);
    }

    public boolean tersedia() {
        return stok > 0;
    }

    public static void main(String[] args) {
        Produk p = new Produk();
        p.setId("BRG123");
        p.setNama("Indomie Goreng");
        p.setStok(5);
        p.setHarga(3000);

        p.tampilkanInfo();

        if (p.tersedia()) {
            System.out.println("Produk tersedia.");
        } else {
            System.out.println("Stok habis.");
        }
    }
}
