package TugasPraktikum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String inputDate = scanner.nextLine();
        
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yy");
            
            SimpleDateFormat outputFormat = new SimpleDateFormat("d MMMM yyyy");
            
            Date date = inputFormat.parse(inputDate);
            
            String formattedDate = outputFormat.format(date);
            
            System.out.println("Output: " + formattedDate);
        } catch (ParseException e) {
            System.out.println("Format tanggal tidak valid! Gunakan format dd-mm-yy.");
        } finally {
            scanner.close();
        }
    }
}
