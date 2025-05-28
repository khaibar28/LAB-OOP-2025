package h071241012;
import java.util.Calendar;
import java.util.Date;

public class Motor extends Kendaraan implements IBergerak,IServiceable{
    private String jenisMotor;
    private double kapasitasTangki;
    private String tipeSuspensi;
    private double kecepatan;

    public Motor(String merek, String model){
        super(merek,model);
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
    public double HitungPajak(){
        double pajakTahunan=1000000;
        System.out.println("Pajak tahunan motor: "+pajakTahunan);
        return pajakTahunan;
    }
    @Override
    public String getTipeKendaraan(){
        return "mewah";
    }
    @Override
    public boolean mulai(){
        System.out.println("motor dinyalakan");
        return true;
    }
    @Override
    public boolean berhenti(){
        System.out.println("hentikan motor");
        return true;
    }
    @Override
    public double getKecepatan(){
        return kecepatan;
    }
    @Override
    public void setKecepatan(double kecepatan){
        this.kecepatan=kecepatan;
        System.out.println("Kecepatan motor diatur ke: "+kecepatan+" km/jam.");
    }
    @Override
    public boolean periksaKondisi(){
        System.out.println("Memeriksa kondisi motor.");
        return true;
    }
    @Override
    public void lakukanService(){
        System.out.println("Service dilakukan pada motor");
    }
    @Override
    public Date getWaktuServiceBerikutnya(){
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.MONTH, 3);
        return calendar.getTime();
    }
    @Override
    public double hitungBiayaService(){
        double biayaservice=250000;
        System.out.println("Biaya service motor: "+biayaservice);
        return biayaservice;
    }




    
}
