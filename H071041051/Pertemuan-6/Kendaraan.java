import java.util.UUID;

public abstract class Kendaraan {
    private String id;
    private String merek;
    private String model;
    private int tahunProduksi;
    private String warna;

    public Kendaraan(String merek, String model) {
        this.id = UUID.randomUUID().toString(); 
        this.merek = merek;
        this.model = model;
    }

    public String getID() {
        return id;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public abstract double hitungPajak();

    public abstract String getTipeKendaraan();
}