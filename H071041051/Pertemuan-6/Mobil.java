import java.util.Date;
import java.util.Calendar;

public class Mobil extends Kendaraan implements IBergerak, IServiceable {
    private int jumlahPintu;
    private double kapasitasMesin;
    private int jumlahKursi;
    private String bahanBakar;
    private double kecepatanSaatIni = 0;

    public Mobil(String merek, String model) {
        super(merek, model);
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public double getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(double kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Override
    public double hitungPajak() {
        double pajakDasar = 1000000;
        double pajakKapasitasMesin = kapasitasMesin * 1000;
        return pajakDasar + pajakKapasitasMesin;
    }

    @Override
    public String getTipeKendaraan() {
        return "Mobil";
    }

    @Override
    public boolean mulai() {
        System.out.println("Mobil " + getMerek() + " " + getModel() + " mulai bergerak.");
        this.kecepatanSaatIni = 100;
        return true;
    }

    @Override
    public boolean berhenti() {
        System.out.println("Mobil " + getMerek() + " " + getModel() + " berhenti.");
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
        System.out.println("Kecepatan mobil diatur menjadi " + kecepatanSaatIni + " km/jam.");
    }

    @Override
    public boolean periksaKondisi() {
        System.out.println("Memeriksa kondisi mobil...");
        return true; 
    }

    @Override
    public void lakukanServis() {
        System.out.println("Melakukan servis mobil " + getMerek() + " " + getModel() + ".");
    }

    @Override
    public Date getWaktuServisBerikutnya() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 6);
        return calendar.getTime();
    }

    @Override
    public double hitungBiayaServis() {
        return 500000 + (kapasitasMesin * 50);
    }
}