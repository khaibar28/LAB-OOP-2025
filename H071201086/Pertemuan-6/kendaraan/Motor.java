package kendaraan;

import java.util.Date;

import aktivitas.iBergerak;
import aktivitas.iServiceable;

public class Motor extends Kendaraan implements iBergerak, iServiceable{
    
    private String jenisMotor, tipeSuspensi;
    private double kapasitasTangki, kecepatan;
    private Date waktuServisBerikutnya;

    public Motor(String merek, String model) {
        super(merek, model);
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenis) {
        this.jenisMotor = jenis;
    }

    public double getKapasitasTangki() {
        return kapasitasTangki;
    }

    public void setKapasitasTangki(int kapasitas) {
        this.kapasitasTangki = kapasitas;
    }

    public String getTipeSuspensi() {
        return tipeSuspensi;
    }

    public void setTipeSuspensi(String tipe) {
        this.tipeSuspensi = tipe;
    }

    @Override
    public double hitungPajak() {
        if (jenisMotor.equalsIgnoreCase("Matic")) {
            return 200000;
        } else if (jenisMotor.equalsIgnoreCase("Sport")) {
            return 300000;
        } else if (jenisMotor.equalsIgnoreCase("Moge")) {
            return 500000;
        } else {
            return 250000;
        }
    }
    
    @Override
    public String getTipeKendaraan() {
        return "Motor";
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
        return 250000;
    }
    
}
