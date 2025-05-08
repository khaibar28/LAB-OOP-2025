public class Unit {
    private String nomorUnit;
    private String tujuan;
    private int kapasitasPenumpang;
    private Penumpang penumpangTerakhir; // Atribut objek dari class lain (Penumpang)


    public Unit() {
        this.nomorUnit = "UNKNOWN";
        this.tujuan = "Belum ditentukan";
        this.kapasitasPenumpang = 0;
        this.penumpangTerakhir = null;
    }


    public Unit(String nomorUnit, String tujuan, int kapasitasPenumpang) {
        this.nomorUnit = nomorUnit;
        this.tujuan = tujuan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.penumpangTerakhir = null;
    }


    public void naikkanPenumpang(Penumpang penumpang) {
        this.penumpangTerakhir = penumpang;
        System.out.println(penumpang.getNama() + " naik ke unit " + this.nomorUnit);
    }

    public void bandingkanKapasitas(Unit unitLain) {
        if (this.kapasitasPenumpang > unitLain.kapasitasPenumpang) {
            System.out.println(this.nomorUnit + " memiliki kapasitas lebih besar dari " + unitLain.nomorUnit);
        } else if (this.kapasitasPenumpang < unitLain.kapasitasPenumpang) {
            System.out.println(this.nomorUnit + " memiliki kapasitas lebih kecil dari " + unitLain.nomorUnit);
        } else {
            System.out.println("Kedua unit memiliki kapasitas yang sama");
        }
    }

    public String getNomorUnit() {
        return nomorUnit;
    }

    public void setNomorUnit(String nomorUnit) {
        this.nomorUnit = nomorUnit;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public Penumpang getPenumpangTerakhir() {
        return penumpangTerakhir;
    }

    public void setPenumpangTerakhir(Penumpang penumpangTerakhir) {
        this.penumpangTerakhir = penumpangTerakhir;
    }
}