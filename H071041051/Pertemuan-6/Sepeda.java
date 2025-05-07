import java.util.Date;
import java.util.Calendar;

public class Sepeda extends Kendaraan implements IBergerak, IServiceable {
    private String jenisSepeda;
    private int jumlahGear;
    private int ukuranRoda;
    private double kecepatanSaatIni = 0;

    public Sepeda(String merek, String model) {
        super(merek, model);
    }

    public String getJenisSepeda() {
        return jenisSepeda;
    }

    public void setJenisSepeda(String jenisSepeda) {
        this.jenisSepeda = jenisSepeda;
    }

    public int getJumlahGear() {
        return jumlahGear;
    }

    public void setJumlahGear(int jumlahGear) {
        this.jumlahGear = jumlahGear;
    }

    public int getUkuranRoda() {
        return ukuranRoda;
    }

    public void setUkuranRoda(int ukuranRoda) {
        this.ukuranRoda = ukuranRoda;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public String getTipeKendaraan() {
        return "Sepeda";
    }

    @Override
    public boolean mulai() {
        System.out.println("Sepeda " + getMerek() + " " + getModel() + " mulai bergerak.");
        this.kecepatanSaatIni = 8; 
        return true;
    }

    @Override
    public boolean berhenti() {
        System.out.println("Sepeda " + getMerek() + " " + getModel() + " berhenti.");
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
        System.out.println("Kecepatan sepeda diatur menjadi " + kecepatanSaatIni + " km/jam.");
    }

    @Override
    public boolean periksaKondisi() {
        System.out.println("Memeriksa kondisi sepeda...");
        return true; 
    }

    @Override
    public void lakukanServis() {
        System.out.println("Melakukan servis sepeda " + getMerek() + " " + getModel() + ".");
    }

    @Override
    public Date getWaktuServisBerikutnya() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1); 
        return calendar.getTime();
    }

    @Override
    public double hitungBiayaServis() {
        return 50000 + (jumlahGear * 1000);
    }
}