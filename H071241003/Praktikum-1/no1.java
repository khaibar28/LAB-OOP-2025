import java.util.Scanner;

public class no1 {

    public static void main(String[] args) {
        String judul;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul Film: ");
        judul = input.nextLine();
        String ubahkalimat = Ubahkatakapital(judul);
        System.out.println(ubahkalimat);
        input.close();
    }
    public static String Ubahkatakapital(String kalimat) {
        String[] kata = kalimat.split(" ");
        StringBuilder hasil = new StringBuilder();
        for (String kata1 : kata) {
            String kapital = kata1.substring(0, 1).toUpperCase() + kata1.substring(1).toLowerCase();
            hasil.append(kapital).append(" ");
        }
        String hasilakhir = hasil.toString().trim();
        return hasilakhir;
    }
}