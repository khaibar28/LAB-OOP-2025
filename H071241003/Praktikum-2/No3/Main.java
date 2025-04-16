package No3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuboid cbd = new Cuboid();
        System.out.print("Masukkan tinggi : ");
        cbd.height = sc.nextDouble();
        System.out.print("Masukkan lebar : ");
        cbd.width = sc.nextDouble();
        System.out.print("Masukkan panjang : ");
        cbd.length = sc.nextDouble();
        // cbd.height = 15;
        // cbd.width = 10;
        // cbd.length = 30;
        System.out.printf("Volume = %.2f", cbd.getVolume());
    }   
}
