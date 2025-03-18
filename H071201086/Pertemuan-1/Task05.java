package TugasPraktikum;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        scanner.close();

        if (password.length() < 8) {
            System.out.println("Password harus minimal 8 karakter.");
        } else if (!password.matches(".*[A-Z].*")) {
            System.out.println("Password harus mengandung minimal satu huruf besar.");
        } else if (!password.matches(".*[a-z].*")) {
            System.out.println("Password harus mengandung minimal satu huruf kecil.");
        } else if (!password.matches(".*\\d.*")) {
            System.out.println("Password harus mengandung minimal satu angka.");
        } else {
            System.out.println("Password valid!");
        }
    }
}
