import java.util.Scanner;

public class nomor01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        
        System.out.println("Hasil: " + capitalizeEachWord(kalimat));
        
        scanner.close();
    }
    public static String capitalizeEachWord(String str) {
        StringBuilder hasil = new StringBuilder();
        for (String word : str.split(" ")) {
            if (!word.isEmpty()) {
                hasil.append(Character.toUpperCase(word.charAt(0)))
                     .append(word.substring(1).toLowerCase())
                     .append(" ");
            }
        }
        return hasil.toString().trim();
    }
}
