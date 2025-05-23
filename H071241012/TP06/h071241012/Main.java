package h071241012;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        System.out.print("Masukkan merek mobil: ");
        String merek=sc.nextLine();

        System.out.print("Masukkan model mobil: ");
        String model=sc.nextLine();
        Mobil mobil = new Mobil(merek, model);

        System.out.print("Masukkan jumlah pintu: ");
        int JumlahPintu=sc.nextInt();
        mobil.setJumlahPintu(JumlahPintu);

        System.out.print("Masukkan kapasitas mobil: ");
        double kapasitasMesin=sc.nextDouble();
        mobil.setKapasitasMesin(kapasitasMesin);

        System.out.print("Masukkan jumlah kursi: ");
        int jumlahKursi=sc.nextInt();
        mobil.setJumlahKursi(jumlahKursi);

        System.out.print("Masukkan jenis bahan bakar: ");
        String bahanBakar=sc.nextLine();
        mobil.setBahanBakar(bahanBakar);
        sc.nextLine();

        System.out.print("Masukkan tahun produksi: ");
        int tahunProduksi=sc.nextInt();
        mobil.setTahunProduksi(tahunProduksi);
        sc.nextLine();
        // Membuat objek Motor
        System.out.println();


        System.out.print("Masukkan merek motor: ");
        sc.nextLine();

        System.out.print("Masukkan model motor: ");
        sc.nextLine();
        Motor motor = new Motor(merek, model);

        System.out.print("Masukkan jenis motor:");
        String jenisMotor=sc.nextLine();
        motor.setJenisMotor(jenisMotor);

        System.out.print("Masukkan kapasitas tangki: ");
        int kapasitasTangki=sc.nextInt();
        motor.setKapasitasTangki(kapasitasTangki);

        System.out.print("Masukkan tipe suspensi: ");
        String tipeSuspensi=sc.nextLine();
        motor.setTipeSuspensi(tipeSuspensi);
        sc.nextLine();

        System.out.println();

        // Membuat objek Sepeda
        System.out.print("Masukkan merek sepeda: ");
        sc.nextLine();

        System.out.print("Masukkan model sepeda: ");
        sc.nextLine();
        Sepeda sepeda = new Sepeda(merek,model);

        System.out.print("Masukkan jenis sepeda: ");
        String jenisSepeda=sc.nextLine();
        sepeda.setJenisSepeda(jenisSepeda);

        System.out.print("Masukkan jumlah gear: ");
        int JumlahGear=sc.nextInt();
        sepeda.setJumlahGear(JumlahGear);

        System.out.print("Masukkan ukuran roda: ");
        int UkuranRoda=sc.nextInt();
        sepeda.setUkuranRoda(UkuranRoda);


        System.out.println();
       // Membuat objek SapuTerbang
        System.out.print("Masukkan merek sapu terbang: ");
        sc.nextLine();
        System.out.println();

        System.out.print("Masukkan model sapu terbang: ");
        sc.nextLine();
        SapuTerbang sapu = new SapuTerbang(merek,model);

        System.out.print("Masukkan jenis kayu: ");
        String JenisKayu=sc.nextLine();
        sapu.setJenisKayu(JenisKayu);

        System.out.print("Masukkan panjang sapu terbang:");
        int PanjangSapu=sc.nextInt();
        sapu.setPanjangSapu(PanjangSapu);

        System.out.print("Masukkan kapasitas penumpang sapu terbang: ");
        int KapasitasPenumpang=sc.nextInt();
        sapu.setKapasitasPenumpang(KapasitasPenumpang);

        System.out.print("Masukkan ketinggian maksimal sapu terbang: ");
        double KetinggianMaksimal=sc.nextDouble();
        sapu.setKetinggianMaksimal(KetinggianMaksimal); // Kelas menengah
        // sapu.setWarna("Emas"); 
        System.out.println();   

        // Menampilkan informasi Mobil
        System.out.println("===== INFORMASI MOBIL =====");
        System.out.println("Merek: " + mobil.getMerek());
        System.out.println("Model: " + mobil.getModel());
        System.out.println("Jumlah Pintu: " + mobil.getJumlahPintu());
        System.out.println("Kapasitas Mesin: " + mobil.getKapasitasMesin() + " liter");
        System.out.println("Jumlah Kursi: " + mobil.getJumlahKursi());
        System.out.println("Bahan Bakar: " + mobil.getBahanBakar());
        System.out.println("Tipe Kendaraan: " + mobil.getTipeKendaraan());
        System.out.println("Warna: " + mobil.getWarna());
        System.out.println("Pajak: Rp " + mobil.HitungPajak());
        mobil.mulai();
        mobil.setKecepatan(80);
        mobil.berhenti();
        mobil.periksaKondisi();
        mobil.lakukanService();
        System.out.println("Waktu Service Berikutnya: " + mobil.getWaktuServiceBerikutnya());
        System.out.println("Biaya Service: Rp" + mobil.hitungBiayaService());

        // Menampilkan informasi Motor
        System.out.println("\n===== INFORMASI MOTOR =====");
        System.out.println("Merek: " + motor.getMerek());
        System.out.println("Model: " + motor.getModel());
        System.out.println("Jenis: " + motor.getJenisMotor());
        System.out.println("Kapasitas Tangki: " + motor.getKapasitasTangki() + " liter");
        System.out.println("Tipe Suspensi: " + motor.getTipeSuspensi());
        System.out.println("Tipe Kendaraan: " + motor.getTipeKendaraan());
        System.out.println("Warna: " + motor.getWarna());
        System.out.println("Pajak: Rp" + motor.HitungPajak());
        motor.mulai();
        motor.setKecepatan(100);
        motor.berhenti();
        motor.periksaKondisi();
        motor.lakukanService();
        System.out.println("Waktu Service Berikutnya: " + motor.getWaktuServiceBerikutnya());
        System.out.println("Biaya Service: Rp" + motor.hitungBiayaService());

        // Menampilkan informasi Sepeda
        System.out.println("\n===== INFORMASI SEPEDA =====");
        System.out.println("Merek: " + sepeda.getMerek());
        System.out.println("Model: " + sepeda.getModel());
        System.out.println("Jenis: " + sepeda.getJenisSepeda());
        System.out.println("Jumlah Gear: " + sepeda.getJumlahGear());
        System.out.println("Ukuran Roda: " + sepeda.getUkuranRoda() + " inci");
        System.out.println("Tipe Kendaraan: " + sepeda.getTipeKendaraan());
        System.out.println("Warna: " + sepeda.getWarna());
        System.out.println("Pajak: Rp" + sepeda.HitungPajak());
        sepeda.mulai();
        sepeda.setKecepatan(20);
        sepeda.berhenti();
        sepeda.periksaKondisi();
        sepeda.lakukanService();
        System.out.println("Waktu Service Berikutnya: " + sepeda.getWaktuServiceBerikutnya());
        System.out.println("Biaya Service: Rp" + sepeda.hitungBiayaService());

        // Menampilkan informasi SapuTerbang
        System.out.println("\n===== INFORMASI SAPU TERBANG =====");
        System.out.println("Merek: " + sapu.getMerek());
        System.out.println("Model: " + sapu.getModel());
        System.out.println("Jenis Kayu: " + sapu.getJenisKayu());
        System.out.println("Panjang Sapu: " + sapu.getPanjangSapu() + " meter");
        System.out.println("Kapasitas Penumpang: " + sapu.getKapasitasPenumpang());
        System.out.println("Ketinggian Maksimal: " + sapu.getKetinggianMaksimal() + " meter");
        System.out.println("Tipe Kendaraan: " + sapu.getTipeKendaraan());
        System.out.println("Warna: " + sapu.getWarna());
        System.out.println("Pajak: Rp" + sapu.HitungPajak());
        
        sapu.mulai();
        sapu.setKecepatan(120);
        System.out.println("Kecepatan Sekarang: " + sapu.getKecepatan() + " km/jam");
        sapu.berhenti();
    }
}