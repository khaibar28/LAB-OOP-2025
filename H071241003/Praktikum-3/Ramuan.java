public class Ramuan {
    private String nama;
    private int kekuatan;

    public Ramuan() {
        this.nama = "Ramuan Default";
        this.kekuatan = 10;
    }
    
    public Ramuan(String nama, int kekuatan) {
        this.nama = nama;
        this.kekuatan = kekuatan;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getKekuatan() {
        return kekuatan;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setKekuatan(int kekuatan) {
        this.kekuatan = kekuatan;
    }
} 