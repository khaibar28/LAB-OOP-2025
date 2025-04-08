package No2;

public class Main {
    public static void main(String[] args) {
        Validasi vd = new Validasi();
        vd.id = "B001";
        vd.nama = "Pensil";
        vd.stok = 0;
        vd.harga = 5000;
        System.out.println(vd.getItem());
    }
}
