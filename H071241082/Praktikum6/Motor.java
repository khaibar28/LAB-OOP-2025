import java.util.Calendar;
import java.util.Date;

public class Motor extends Kendaraan implements IBergerak, IServiceable {
    private String jenisMotor;
    private double kapasitasTangki;
    private String tipeSuspensi;
    private double kecepatan = 0;
    private boolean berjalan = false;

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

    public void setKapasitasTangki(double kapasitas) {
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
        return kapasitasTangki * 50000;
    }

    @Override
    public String getTipeKendaraan() {
        return "Motor";
    }

    @Override
    public boolean mulai() {
        berjalan = true;
        return berjalan;
    }

    @Override
    public boolean berhenti() {
        berjalan = false;
        return !berjalan;
    }

    @Override
    public double getKecepatan() {
        return kecepatan;
    }

    @Override
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    @Override
    public boolean periksaKondisi() {
        return true; // Asumsikan kondisi baik
    }

    @Override
    public void lakukanServis() {
        System.out.println("Motor diservis.");
    }

    @Override
    public Date getWaktuServisBerikutnya() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 3); // Misal servis setiap 3 bulan
        return cal.getTime();
    }

    @Override
    public double hitungBiayaServis() {
        return 250000; // Nilai estimasi servis
    }
}
