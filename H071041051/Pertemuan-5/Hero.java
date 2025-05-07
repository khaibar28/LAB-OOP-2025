import java.util.Scanner;

public class Hero {
    String name;
    int health;
    int attackPower;

    public Hero(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void attack() {
        System.out.println(name + " menyerang dengan kekuatan " + attackPower + "!");
    }
}

class Fighter extends Hero {
    public Fighter() {
        super("Petarung", 150, 18);
    }
}

class Wizard extends Hero {
    public Wizard() {
        super("Penyihir", 100, 20);
    }
}

class Archer extends Hero {
    public Archer() {
        super("Pemanah", 120, 15);
    }
}

class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runGame();
    }

    private static void runGame() {
        Hero karakter = null;

        while (true) {
            System.out.println("Pilih karakter");
            System.out.println("1. Archer");
            System.out.println("2. Wizard");
            System.out.println("3. Fighter");
            System.out.print("Masukkan pilihan: ");

            int pilihanKarakter = sc.nextInt();

            switch (pilihanKarakter) {
                case 1:
                    karakter = new Archer();
                    break;
                case 2:
                    karakter = new Wizard();
                    break;
                case 3:
                    karakter = new Fighter();
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    continue;
            }

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Serang");
                System.out.println("2. Keluar");
                System.out.print("Pilih aksi: ");
                int menu = sc.nextInt();

                if (menu == 1) {
                    karakter.attack();
                } else if (menu == 2) {
                    System.out.println("Keluar dari permainan. Sampai jumpa!");
                    return;
                } else {
                    System.out.println("Opsi tidak valid!");
                }
            }
        }
    }
}