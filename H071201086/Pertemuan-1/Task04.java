package TugasPraktikum;

import java.util.Scanner;

public class Task04 {
    public static long hitungFaktorial(int n) {
        if (n == 0 || n == 1) { 
            return 1; 
        }
        return n * hitungFaktorial(n - 1); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Input: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Faktorial tidak terdefinisi untuk bilangan negatif.");
            } else {
                long hasil = hitungFaktorial(n);
                System.out.println("Output: " + hasil);
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid! Masukkan bilangan bulat.");
        } finally {
            scanner.close();
        }
    }
}
