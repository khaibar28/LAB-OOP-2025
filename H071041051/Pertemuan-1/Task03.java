import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("tanggal = ");
        String[] tanggal = input.nextLine().split("-");
        input.close();
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        
        int hari = Integer.parseInt(tanggal[0]);
        int bulan = Integer.parseInt(tanggal[1]);
        int tahun = Integer.parseInt(tanggal[2]);

        if (tahun <= 25) {
            tahun = 2000 + tahun;
        } else {
            tahun = 1900 + tahun;
        }

        if (bulan > 12){
            System.out.println("Hanya ada 12 Bulan");
        }else{
            System.out.println(hari + " " + namaBulan[bulan-1] + " " + tahun);
        } 
    }
}