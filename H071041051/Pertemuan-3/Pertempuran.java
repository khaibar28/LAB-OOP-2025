import java.util.Random;

public class Pertempuran {
    public void serang(Negara penyerang, Negara terserang) {
        System.out.println(penyerang.getNama() + " yang dipimpin oleh " + penyerang.getPresiden() +
                " mengerahkan " + penyerang.getJumlahPasukan() + " pasukan untuk menyerang " +
                terserang.getNama() + ".");

        Random random = new Random();
        int jumlahPasukanTerserang = random.nextInt(20000) + 5000; // Randomisasi jumlah populasi
        System.out.println("Pasukan " + terserang.getNama() + " berjumlah " + jumlahPasukanTerserang);


        if (penyerang.getJumlahPasukan() < jumlahPasukanTerserang) {
            System.out.println("Pasukan " + penyerang.getNama() + " gagal melawan pasukan " + terserang.getNama());
            System.out.println("Presiden " + penyerang.getPresiden() + " gagal menaklukan " + terserang.getNama());

      
            int kekuranganPopulasi = random.nextInt(7000) + 5000; 
            terserang.getIbukota().setPopulasi(terserang.getIbukota().getPopulasi() - kekuranganPopulasi);
            System.out.println(terserang.getIbukota().getNama() + " tidak berhasil dikuasai " + terserang.getNama() +
                    ", kekurangan populasi " + kekuranganPopulasi + ". Populasi sekarang: " + terserang.getIbukota().getPopulasi());
        } else {
            System.out.println("Pasukan " + penyerang.getNama() + " berhasil mengalahkan pasukan " + terserang.getNama());
            System.out.println("Presiden " + penyerang.getPresiden() + " berhasil menaklukan " + terserang.getNama());

        
            int kekuranganPopulasi = random.nextInt(7000) + 5000; 
            terserang.getIbukota().setPopulasi(terserang.getIbukota().getPopulasi() - kekuranganPopulasi);
            System.out.println(terserang.getIbukota().getNama() + " berhasil dikuasai, " + terserang.getNama() +
                    " kekurangan populasi " + kekuranganPopulasi + ". Populasi sekarang: " + terserang.getIbukota().getPopulasi());
        }
    }

}