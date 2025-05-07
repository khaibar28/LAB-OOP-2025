import java.util.Date;
import java.util.Calendar;

public class Motor extends Kendaraan implements IBergerak, IServiceable {
    private String jenisMotor;
    private double kapasitasTangki;
    private String tipeSuspensi;
    private double kecepatanSaatIni = 0;

    public Motor(String merek, String model) {
        super(merek, model);
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }

    public double getKapasitasTangki() {
        return kapasitasTangki;
    }

    public void setKapasitasTangki(double kapasitasTangki) {
        this.kapasitasTangki = kapasitasTangki;
    }

    public String getTipeSuspensi() {
        return tipeSuspensi;
    }

    public void setTipeSuspensi(String tipeSuspensi) {
        this.tipeSuspensi = tipeSuspensi;
    }

    @Override
    public double hitungPajak() {
        double pajakDasar = 200000;
        double pajakKapasitasTangki = kapasitasTangki * 500;
        return pajakDasar + pajakKapasitasTangki;
    }

    @Override
    public String getTipeKendaraan() {
        return "Motor";
    }

    @Override
    public boolean mulai() {
        System.out.println("Motor " + getMerek() + " " + getModel() + " mulai bergerak.");
        this.kecepatanSaatIni = 15; 
        return true;
    }

    @Override
    public boolean berhenti() {
        System.out.println("Motor " + getMerek() + " " + getModel() + " berhenti.");
        this.kecepatanSaatIni = 0;
        return true;
    }

    @Override
    public double getKecepatan() {
        return kecepatanSaatIni;
    }

    @Override
    public void setKecepatan(double kecepatan) {
        this.kecepatanSaatIni = kecepatan;
        System.out.println("Kecepatan motor diatur menjadi " + kecepatanSaatIni + " km/jam.");
    }

    @Override
    public boolean periksaKondisi() {
        System.out.println("Memeriksa kondisi motor...");
        return true; 
    }

    @Override
    public void lakukanServis() {
        System.out.println("Melakukan servis motor " + getMerek() + " " + getModel() + ".");
    }

    @Override
    public Date getWaktuServisBerikutnya() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 3); 
        return calendar.getTime();
    }

    @Override
    public double hitungBiayaServis() {
        return 200000 + (kapasitasTangki * 20);
    }
}