package kendaraan;

import java.util.Date;

import aktivitas.iBergerak;
import aktivitas.iServiceable;

public class Sepeda extends Kendaraan implements iBergerak, iServiceable{
    
    private String jenisSepeda;
    private int jumlahGear, ukuranRoda;
    private Date waktuServisBerikutnya;

    public Sepeda(String merek, String model) {
        super(merek, model);
    }

    public String getJenisSepeda() {
        return jenisSepeda;
    }

    public void setJenisSepeda(String jenis) {
        this.jenisSepeda = jenis;
    }

    public int getJumlahGear() {
        return jumlahGear;
    }

    public void setJumlahGear(int jumlah) {
        this.jumlahGear = jumlah;
    }

    public int getUkuranRoda() {
        return ukuranRoda;
    }

    public void setUkuranRoda(int ukuran) {
        this.ukuranRoda = ukuran;
    }

    @Override
    public String getTipeKendaraan() {
        return "Sepeda";
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
        return 40.0; 
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
        return 100000;
    }
}
