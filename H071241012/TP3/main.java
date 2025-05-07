public class main {
    public static void main(String[] args) {
        Cangkul c1 = new Cangkul("Cangkul Baja", 3.5);
        Petani p1 = new Petani("Pak Tani", 80, c1);
        Petani p2 = new Petani("Bu Tani", 85, new Cangkul("Cangkul Ringan", 2.0));

        p1.bertani();
        p2.bertani();

        p1.aduTenaga(p2);
    }
}
