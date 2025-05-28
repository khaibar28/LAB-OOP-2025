package h071241012;
public class SapuTerbang extends Kendaraan implements IBergerak {
    private String jenisKayu;
    private double panjangSapu;
    private int kapasitasPenumpang;
    private double kecepatan;
    private double ketinggianMaksimal;

    public SapuTerbang(String merek, String model){
        super(merek,model);
    }
    public String getJenisKayu() {
        return jenisKayu;
    }

    public void setJenisKayu(String jenisKayu) {
        this.jenisKayu = jenisKayu;
    }
    public double getPanjangSapu() {
        return panjangSapu;
    }

    public void setPanjangSapu(double panjangSapu) {
        this.panjangSapu = panjangSapu;
    }
    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }
    public double getKetinggianMaksimal() {
        return ketinggianMaksimal;
    }

    public void setKetinggianMaksimal(double ketinggianMaksimal) {
        this.ketinggianMaksimal = ketinggianMaksimal;
    }

    public double HitungPajak(){
        System.out.println("Sapu terbang tidak dikenakan pajak.");
        return 0;
    }
    @Override
    public String getTipeKendaraan(){
        if (ketinggianMaksimal>5000){
            return "sapu terbang kelas tinggi";
        }else if(ketinggianMaksimal>2000){
            return "aSpu terbang kelas menengah";
        }else{
            return "Sapu terbang pemula";
        }
    }
    @Override
    public boolean mulai(){
        System.out.println("Sapu terbang mulai terbang ke atas!");
        return true;
    }
    @Override
    public boolean berhenti(){
        System.out.println("Sapu terbang mendarat.");
        return true;
    }
    @Override
    public double getKecepatan(){
        return kecepatan;
    }
    @Override
    public void setKecepatan(double kecepatan){
        this.kecepatan=kecepatan;
        System.out.println("Kecepatan sapu terbang diatur ke "+kecepatan+" km/jam.");
    }

    
    
}
