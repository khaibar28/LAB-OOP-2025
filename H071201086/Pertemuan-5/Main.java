import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hero hero = null;

        System.out.println("Pilih Karakter");
        System.out.println("1. Archer");
        System.out.println("2. Wizard");
        System.out.println("3. Fighter");
        System.out.print("Masukkan pilihan : ");
        int pilihanKarakter = scanner.nextInt();
        scanner.nextLine(); 
        switch (pilihanKarakter) {
            case 1:
                hero = new Archer("Pemanah", 100, 15, "panah");
                break;
            case 2:
                hero = new Wizard("Penyihir", 80, 20, "sihir");
                break;
            case 3:
                hero = new Fighter("Petarung", 150, 18, "kapak");
                break;
            default:
                System.out.println("Pilihan tidak valid. Program berhenti.");
                System.exit(0);
        }

        int pilihan;
        do {
            System.out.println("\nMenu : ");
            System.out.println("1. Serang");
            System.out.println("2. Keluar");
            System.out.print("Pilih aksi: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hero.attack();
                    break;
                case 2:
                    System.out.println("Game Selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 2);

        scanner.close();
    }
}