public class Negara {
    private String nama;
    private String presiden;
    private int jumlahPasukan;
    private Ibukota ibukota; 


    public Negara() {
        this.nama = "Amerika";
        this.presiden = "Donald Trump";
        this.jumlahPasukan = 25000;
        this.ibukota = new Ibukota("Washington, D.C.", 7000000); 
    }

    public Negara(String nama, String presiden, int jumlahPasukan, Ibukota ibukota) {
        this.nama = nama;
        this.presiden = presiden;
        this.jumlahPasukan = jumlahPasukan;
        this.ibukota = ibukota;
    }

    public int getJumlahPasukan() {
        return jumlahPasukan;
    }

    public String getNama() {
        return nama;
    }

    public String getPresiden() {
        return presiden;
    }

    public Ibukota getIbukota() {
        return ibukota;
    }

    public void tampilkanStatus() {
        System.out.println("Negara: " + nama);
        System.out.println("Presiden: " + presiden);
        System.out.println("Jumlah Pasukan: " + jumlahPasukan);
    }
}