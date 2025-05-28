public class Penumpang {
    private String nama;
    private String noKursi;
    private String tujuan;
    private Penumpang temanSebangku; // Atribut objek dari class yang sama (self-referencing)

    public Penumpang() {
        this.nama = "Anonim";
        this.noKursi = "0A";
        this.tujuan = "Belum ditentukan";
        this.temanSebangku = null;
    }

    public Penumpang(String nama, String noKursi, String tujuan) {
        this.nama = nama;
        this.noKursi = noKursi;
        this.tujuan = tujuan;
        this.temanSebangku = null;
    }

    public void setTemanSebangku(Penumpang teman) {
        this.temanSebangku = teman;
        System.out.println(this.nama + " sekarang sebangku dengan " + teman.nama);
    }
    public void cekKesamaanTujuan(Penumpang penumpangLain) {
        if (this.tujuan.equalsIgnoreCase(penumpangLain.tujuan)) {
            System.out.println(this.nama + " dan " + penumpangLain.nama + " memiliki tujuan yang sama");
        } else {
            System.out.println(this.nama + " dan " + penumpangLain.nama + " memiliki tujuan berbeda");
        }
    }

  
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoKursi() {
        return noKursi;
    }

    public void setNoKursi(String noKursi) {
        this.noKursi = noKursi;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public Penumpang getTemanSebangku() {
        return temanSebangku;
    }
}