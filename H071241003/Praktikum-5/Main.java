import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membuat objek karakter
        Hero archer = new Archer("Archer1", 100, 15);
        Hero wizard = new Wizard("Wizard1", 80, 20);
        Hero fighter = new Fighter("Fighter1", 120, 25);

        // Pilih karakter
        System.out.println("Pilih Karakter:");
        System.out.println("1. Archer");
        System.out.println("2. Wizard");
        System.out.println("3. Fighter");
        System.out.print("Masukkan pilihan: ");
        int karakter = sc.nextInt();
        sc.nextLine(); // Consume newline

        Hero heroPilihan = null;

        // Pilih karakter berdasarkan input
        switch (karakter) {
            case 1:
                heroPilihan = archer;
                break;
            case 2:
                heroPilihan = wizard;
                break;
            case 3:
                heroPilihan = fighter;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }
        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Serang");
            System.out.println("2. Keluar");
            System.out.print("Pilih aksi: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    heroPilihan.serang();
                    break;
                case 2:
                    // Keluar dari program
                    System.out.println("Program selesai.");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        sc.close();
    }
}