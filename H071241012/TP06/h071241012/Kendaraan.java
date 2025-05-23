package h071241012;

abstract public class Kendaraan{
    protected String id;
    protected String merek;
    protected String model;
    protected int tahunProduksi;
    protected String warna;

    public Kendaraan(String merek, String model){
        this.merek=merek;
        this.model=model;
    }
    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getMerek() {
        return merek;
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
    abstract public double HitungPajak();

    abstract public String getTipeKendaraan();
}