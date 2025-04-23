import java.util.*;

public class nomor05 {

    public static String validasiPassword(String password) {
        if (password.length() < 8) {
            return "Password harus minimal 8 karakter";
        }

        boolean hasLower = false, hasUpper = false, hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        if (!hasLower) {
            return "Password harus mengandung huruf kecil";
        }
        else if (!hasUpper) {
            return "Password harus mengandung huruf besar";
        }
        else if (!hasDigit) {
            return "Password harus mengandung angka";
        }

        return "Password valid";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        System.out.println(validasiPassword(password));

        scanner.close();
    }
}
