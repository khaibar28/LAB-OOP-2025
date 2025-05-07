public class ComutterLine extends Kendaraan implements IBergerak{
    private String jenisComutterLine;
    private int kapasitasBaterai; 
    private int beratBaterai; 
    private double kecepatanSaatIni = 0;

    public ComutterLine(String merek, String model) {
        super(merek, model);
    }

    public String getJenisComutterLine() {
        return jenisComutterLine;
    }

    public void setJenisComutterLine(String jenisComutterLine) {
        this.jenisComutterLine = jenisComutterLine;
    }

    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public int getBeratBaterai() {
        return beratBaterai;
    }

    public void setBeratBaterai(int beratBaterai) {
        this.beratBaterai = beratBaterai;
    }

    @Override
    public double hitungPajak() {
        double pajakDasar = 0;
        return pajakDasar;
    }

    @Override
    public String getTipeKendaraan() {
        return "Comutter Line";
    }

    @Override
    public boolean mulai() {
        System.out.println("Comutter Line " + getMerek() + " " + getModel() + " mulai bergerak.");
        this.kecepatanSaatIni = 5; 
        return true;
    }

    @Override
    public boolean berhenti() {
        System.out.println("Comutter Line " + getMerek() + " " + getModel() + " berhenti.");
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
        System.out.println("Kecepatan Comutter Line diatur menjadi " + kecepatanSaatIni + " km/jam.");
    }
}