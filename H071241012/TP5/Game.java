import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hero hero = null;

        int pilihan = 0;
        try {
            System.out.println("Pilih Karakter: ");
            System.out.println("1. Archer");
            System.out.println("2. Wizard");
            System.out.println("3. Fighter");
            System.out.print("Masukkan Pilihan: ");
            pilihan = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka!");
            System.exit(0);
        }

        switch (pilihan) {
            case 1:
                hero = new Archer("Archer", 100, 15);
                break;
            case 2:
                hero = new Wizard("Wizard", 80, 20);
                break;
            case 3:
                hero = new Fighter("Fighter");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }

        int menu = 0;
        do {
            try {
                System.out.println("\nMenu");
                System.out.println("1. Serang");
                System.out.println("2. Keluar");
                System.out.print("Pilih aksi: ");
                menu = input.nextInt();

                switch (menu) {
                    case 1:
                        hero.attack();
                        break;
                    case 2:
                        System.out.println("Game selesai!");
                        break;
                    default:
                        System.out.println("Menu tidak valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.next(); // buang input yang salah
            }
        } while (menu != 2);

        input.close();
    }
}
