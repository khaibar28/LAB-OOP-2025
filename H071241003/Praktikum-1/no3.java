import java.util.Scanner;
public class no3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Masukkan tanggal");
        String[] calender = n.nextLine().split("-");

        int tanggal = Integer.parseInt(calender[0]);
        int bulan = Integer.parseInt(calender[1]);
        int tahun = Integer.parseInt(calender[2]);

        String namaBulan;
        switch (bulan) {
            case 1 -> namaBulan = "Januari";
            case 2 -> namaBulan = "Februari";
            case 3 -> namaBulan = "Maret";
            case 4 -> namaBulan = "April";
            case 5 -> namaBulan = "Mei";
            case 6 -> namaBulan = "Juni";
            case 7 -> namaBulan = "Juli";
            case 8 -> namaBulan = "Agustus";
            case 9 -> namaBulan = "September";
            case 10 -> namaBulan = "Oktober";
            case 11 -> namaBulan = "November";
            case 12 -> namaBulan = "Desember";
            default -> {
                System.out.println("Bulan tidak valid!");
                return;
            }
      
            
        }if(tahun >= 0 && tahun <= 26){
            tahun = tahun + 2000;
        }
        else if(tahun >= 27 && tahun <= 99){
            tahun = tahun + 1900;
        }
        System.out.println(tanggal + " " + namaBulan + " " + tahun);
        n.close();
    }
}
