import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.print("Masukan Judul Film = ");
        Scanner input = new Scanner(System.in);
        String[] judul = input.nextLine().split("\\s");
        input.close();
        
        for (int i = 0; i < judul.length; i++) {
            judul[i] = judul[i].substring(0, 1).toUpperCase() + judul[i].substring(1).toLowerCase();
        }
        System.out.println(String.join(" ", judul));
    }
}