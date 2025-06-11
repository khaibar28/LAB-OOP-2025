import java.text.SimpleDateFormat;

import kendaraan.*;

public class Main {

    public static void main(String[] args) {

        Mobil mobil = new Mobil("Toyota", "Fortuner");
        mobil.setTahunProduksi(2018);
        mobil.setWarna("hitam");
        mobil.setJumlahPintu(4);
        mobil.setKapasitasMesin(2755);
        mobil.setJumlahKursi(6);
        mobil.setBahanBakar("Bensin");
        mobil.setKecepatan(60.0);

        System.out.println("=== Informasi Mobil ===");
        System.out.println("Tipe: " + mobil.getTipeKendaraan());
        System.out.println("Merek: " + mobil.getMerek());
        System.out.println("Model: " + mobil.getModel());
        System.out.println("Tahun Produksi: " + mobil.getTahunProduksi());
        System.out.println("Warna: " + mobil.getWarna());
        System.out.println("Jumlah Pintu: " + mobil.getJumlahPintu());
        System.out.println("Kapasitas Mesin: " + mobil.getKapasitasMesin() + " cc");
        System.out.println("Jumlah Kursi: " + mobil.getJumlahKursi());
        System.out.println("Bahan Bakar: " + mobil.getBahanBakar());
        System.out.println("Kecepatan: " + mobil.getKecepatan() + " km/h");
        System.out.println("Pajak : " + mobil.hitungPajak());

        System.out.println("\n");

        Motor motor = new Motor("Yamaha", "Nmax");
        motor.setTahunProduksi(2017);
        motor.setWarna("Merah");
        motor.setJenisMotor("Matic");
        motor.setKapasitasTangki(7);
        motor.setTipeSuspensi("Nmax 155 Standard");
        motor.setKecepatan(30.0);

        System.out.println("=== Informasi Motor ===");
        System.out.println("Tipe: " + motor.getTipeKendaraan());
        System.out.println("Merek: " + motor.getMerek());
        System.out.println("Model: " + motor.getModel());
        System.out.println("Tahun Produksi: " + motor.getTahunProduksi());
        System.out.println("Warna: " + motor.getWarna());
        System.out.println("Jenis motor: " + motor.getJenisMotor());
        System.out.println("Kapasitas tangki: " + motor.getKapasitasTangki() + " L");
        System.out.println("Tipe Suspensi: " + motor.getTipeSuspensi());
        System.out.println("Kecepatan: " + motor.getKecepatan() + " km/h");
        System.out.println("Pajak : " + motor.hitungPajak());

        System.out.println("\n");

        Sepeda sepeda = new Sepeda("Polygon", "Premier 5");
        sepeda.setTahunProduksi(2022);
        sepeda.setJenisSepeda("MTB");
        sepeda.setJumlahGear(2);
        sepeda.setKecepatan(18);
        sepeda.setUkuranRoda(29);
        sepeda.setWarna("hitam");

        System.out.println("=== Informasi Sepeda ===");
        System.out.println("Tipe: " + sepeda.getTipeKendaraan());
        System.out.println("Merek: " + sepeda.getMerek());
        System.out.println("Model: " + sepeda.getModel());
        System.out.println("Tahun Produksi: " + sepeda.getTahunProduksi());
        System.out.println("Warna: " + sepeda.getWarna());
        System.out.println("Jenis sepeda: " + sepeda.getJenisSepeda());
        System.out.println("Jumlah gear: " + sepeda.getJumlahGear());
        System.out.println("Ukuran roda: " + sepeda.getUkuranRoda());
        System.out.println("Kecepatan: " + sepeda.getKecepatan() + " km/h");

        System.out.println("\n");

        Bus bus = new Bus("Toyota", "Normal Deck");
        bus.setJenisBus("Bus Normal Deck");
        bus.setJumlahPenumpang(60);
        bus.setKapasitasBagasi(30);
        bus.setKecepatan(80);
        bus.setTahunProduksi(2010);
        bus.setWarna("Silver");
        
        System.out.println("=== Informasi Bus ===");
        System.out.println("Tipe: " + bus.getTipeKendaraan());
        System.out.println("Merek: " + bus.getMerek());
        System.out.println("Model: " + bus.getModel());
        System.out.println("Tahun Produksi: " + bus.getTahunProduksi());
        System.out.println("Warna: " + bus.getWarna());
        System.out.println("Jenis bus: " + bus.getJenisBus());
        System.out.println("Kapasitas Bagasi: " + bus.getKapasitasBagasi() + " kg");
        System.out.println("Jumlah Penumpang: " + bus.getJumlahPenumpang() + " org");
        System.out.println("Kecepatan: " + bus.getKecepatan() + " km/h");

    }
}
