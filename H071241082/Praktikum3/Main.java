
public class Main {
    public static void main(String[] args) {
        SenjataRahasia katana = new SenjataRahasia("Katana Plasma", 30);
        SenjataRahasia laser = new SenjataRahasia("Laser Slice", 25);

        CyberNinja ninja1 = new CyberNinja();
        CyberNinja ninja2 = new CyberNinja("Shadow-8", 0, laser);

        ninja1.tampilkanStatus();
        ninja2.tampilkanStatus();

        System.out.println("\n=== PERTARUNGAN DIMULAI ===\n");

        while (ninja1.getEnergi() > 0 && ninja2.getEnergi() > 0) {
            ninja1.serang(ninja2);
            if (ninja2.getEnergi() <= 0) break;

            ninja2.serang(ninja1);
        }

        System.out.println("\n=== PERTARUNGAN SELESAI ===\n");
        ninja1.tampilkanStatus();
        ninja2.tampilkanStatus();

        if (ninja1.getEnergi() > 0) {
            System.out.println("🔥 Pemenang: " + ninja1.getKodeNama());
        } else {
            System.out.println("🔥 Pemenang: " + ninja2.getKodeNama());
        }
    }
}
