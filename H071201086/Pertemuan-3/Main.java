public class Main {
    public static void main(String[] args) {
        Pemilik p1 = new Pemilik("Wiwit", "Mandiri");
        Pemilik p2 = new Pemilik("Fiqah", "BNI");

        Rekening r1 = new Rekening(p1, "1520018649828", 1500000);
        Rekening r2 = new Rekening(p2, "654321", 750000);

        System.out.println("=== Info Rekening ===");
        r1.tampilkanInfo();
        System.out.println();
        r2.tampilkanInfo();
        System.out.println();

        System.out.println("=== Perbandingan Saldo ===");
        r1.bandingkanSaldo(r2);
        System.out.println();

        System.out.println("=== Proses Transfer ===");
        r1.transferSaldo(r2, 250000);
        System.out.println();

        System.out.println("=== Info Rekening Setelah Transfer ===");
        r1.tampilkanInfo();
        System.out.println();
        r2.tampilkanInfo();
    }
}

