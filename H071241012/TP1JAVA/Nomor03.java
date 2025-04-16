import java.util.Scanner;

public class Nomor03 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan tanggal (dd-mm-yy): ");
        String inputTanggal = x.nextLine();

        String tanggalTerformat = konversiTanggal(inputTanggal);
        System.out.println("hasil: " + tanggalTerformat);

        x.close();
    }

    public static String konversiTanggal(String tanggal) {
        String[] bagianTanggal = tanggal.split("-");

        int hari = Integer.parseInt(bagianTanggal[0]);
        int bulan = Integer.parseInt(bagianTanggal[1]);
        int tahun = Integer.parseInt(bagianTanggal[2]);

        if(tahun>=0 && tahun<=25){
            tahun += 2000;
        }else if(tahun>=26){
            tahun +=1900;
        }
        

        String[] bulanNama = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        String namaBulan = bulanNama[bulan - 1];

        return hari + " " + namaBulan + " " + tahun;
    }
}
