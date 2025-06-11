package kendaraan;

import java.util.Date;
import aktivitas.iBergerak;
import aktivitas.iServiceable;

public class Bus extends Kendaraan implements iBergerak, iServiceable {

    private String jenisBus;
    private int jumlahPenumpang;
    private double kapasitasBagasi;
    private int kecepatan;
    private Date waktuServisBerikutnya;

    public Bus(String merek, String model) {
        super(merek, model);
    }

    public String getJenisBus() {
        return jenisBus;
    }

    public void setJenisBus(String jenisBus) {
        this.jenisBus = jenisBus;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public void setJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public double getKapasitasBagasi() {
        return kapasitasBagasi;
    }

    public void setKapasitasBagasi(double kapasitasBagasi) {
        this.kapasitasBagasi = kapasitasBagasi;
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
    public String getTipeKendaraan() {
        return "Bus";
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
        return 750000;
    }
}
