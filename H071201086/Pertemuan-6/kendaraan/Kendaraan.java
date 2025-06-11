package kendaraan;

public abstract class Kendaraan {
    private String id, merek, model, warna;
    private int tahunProduksi;

    public Kendaraan(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }

    public String getId() {
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

    public String getWarna() {
        return warna;
    }

    public void setTahunProduksi(int tahun) {
        this.tahunProduksi = tahun;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double hitungPajak() {
        int usiaKendaraan = 2025 - tahunProduksi;
        return 500000 - (usiaKendaraan * 10000);
    }
    public abstract String getTipeKendaraan();
}
