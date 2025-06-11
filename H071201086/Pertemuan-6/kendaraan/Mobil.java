package kendaraan;

import java.util.Date;
import aktivitas.iBergerak;
import aktivitas.iServiceable;

public class Mobil extends Kendaraan implements iBergerak, iServiceable {
    private int jumlahPintu, jumlahKursi;
    private double kapasitasMesin, kecepatan;
    private String bahanBakar;
    private Date waktuServisBerikutnya;

    public Mobil(String merek, String model) {
        super(merek, model);
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlah) {
        this.jumlahPintu = jumlah;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public double getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(double kapasitas) {
        this.kapasitasMesin = kapasitas;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Override
    public double hitungPajak() {
        if (kapasitasMesin <= 1.5) {
            return 1500000;
        } else if (kapasitasMesin <= 2.0) {
            return 2500000;
        } else {
            return 3500000;
        }
    }

    @Override
    public String getTipeKendaraan() {
        return "Mobil";
    }

    @Override
    public boolean mulai() {
        return true;
    }

    @Override
    public boolean berhenti() {
        return true;
    }

    @Override
    public double getKecepatan() {
        return 80.0; 
    }
    
    @Override
    public void setKecepatan(double kecepatan) {
        return;
    }

    @Override
    public boolean periksaKondisi() {
        return true;
    }

    @Override
    public void lakukanServis() {
        waktuServisBerikutnya = new Date(System.currentTimeMillis() + 6L * 30 * 24 * 60 * 60 * 1000);
    }

    @Override
    public Date getWaktuServisBerikutnya() {
        return waktuServisBerikutnya;
    }

    @Override
    public double hitungBiayaServis() {
        return 821000;
    }
}
