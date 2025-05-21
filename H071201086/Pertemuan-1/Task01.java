package TugasPraktikum;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Judul Film: ");
        String input = scanner.nextLine();
        
        String result = capitalizeEachWord(input);
        System.out.println(result);
        
        scanner.close();
    }

    public static String capitalizeEachWord(String str) { 
        StringBuilder result = new StringBuilder();
        for (String word : str.split(" ")) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))) 
                      .append(word.substring(1).toLowerCase())   
                      .append(" ");
            }
        }
        return result.toString().trim();
    }
}
