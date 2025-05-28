package h071241012;
import java.util.Calendar;
import java.util.Date;

public class Sepeda extends Kendaraan implements IBergerak,IServiceable{
    private String jenisSepeda;
    private int jumlahGear;
    private int ukuranRoda;
    private double kecepatan;;

    public Sepeda(String merek, String model){
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
    public double HitungPajak(){
        System.out.println("Sepeda tidak dikenakan pajak.");
        return 0;

    }
    @Override
    public String getTipeKendaraan(){
        if("Balap".equals(jenisSepeda)){
            return "Sepeda balap";
        }else if("gunung".equals(jenisSepeda)){
            return "Sepeda gunung";
        }else{
            return "Sepeda biasa";
        }
    }
    @Override
    public boolean mulai(){
        System.out.println("Sepeda di jalankan.");
        return true;
    }
    @Override
    public boolean berhenti(){
        System.out.println("Sepeda dihentikan.");
        return true;
    }
    @Override
    public double getKecepatan(){
        return kecepatan;
        
    }
    @Override
    public void setKecepatan(double kecepatan){
        this.kecepatan=kecepatan;
        System.out.println("Kecepatan sepeda diatur ke "+kecepatan);
    }
    @Override
    public boolean periksaKondisi(){
        System.out.println("Memeriksa kondisi sepeda");
        return true;
    }
    @Override
    public void lakukanService(){
        System.out.println("Sepeda di service.");
    }
    @Override
    public Date getWaktuServiceBerikutnya(){
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.MONTH, 3);
        return calendar.getTime();
    }
    @Override
    public double hitungBiayaService(){
        double biayaservice=100000;
        System.out.println("Biaya service sepeda: "+biayaservice);
        return biayaservice;
    }
    
    
}
