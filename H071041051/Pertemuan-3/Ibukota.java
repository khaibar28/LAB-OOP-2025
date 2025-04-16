public class Ibukota {
    private String nama;
    private long populasi;

    public Ibukota(String nama, long populasi) {
        this.nama = nama;
        this.populasi = populasi;
    }

    public String getNama() {
        return nama;
    }

    public long getPopulasi() {
        return populasi;
    }

    public void setPopulasi(long populasi) {
        this.populasi = populasi;
    }

    public void tampilkanStatus() {
        System.out.println("Ibu Kota: " + getNama() + "\n"+ "populasi sekarang : " + getPopulasi());
       
    }
}