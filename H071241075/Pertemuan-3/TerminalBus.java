

public class TerminalBus {
    private String namaTerminal;
    private String lokasi;
    private Unit unitTerparkir;  // Atribut objek dari class lain (Unit)
    private int kapasitasTotal;
    
    public TerminalBus() {
        this.namaTerminal = "Terminal Pusat";
        this.lokasi = "Kota";
        this.unitTerparkir = null;
        this.kapasitasTotal = 0;
        
    }

   
    public TerminalBus(String namaTerminal, String lokasi, int kapasitasTotal) {
        this.namaTerminal = namaTerminal;
        this.lokasi = lokasi;
        this.kapasitasTotal = kapasitasTotal;
        this.unitTerparkir = null;
    }

    public void parkirUnit(Unit unit) {
        if (this.unitTerparkir == null) {
            this.unitTerparkir = unit;
            System.out.println("Unit " + unit.getNomorUnit() + " berhasil diparkir di " + this.namaTerminal);
        } else {
            System.out.println("Area parkir penuh, unit " + this.unitTerparkir.getNomorUnit() + " sudah terparkir");
        }
    }

    public void bandingkanKapasitas(TerminalBus terminalLain) {
        if (this.kapasitasTotal > terminalLain.kapasitasTotal) {
            System.out.println(this.namaTerminal + " memiliki kapasitas lebih besar dari " + terminalLain.namaTerminal);
        } else if (this.kapasitasTotal < terminalLain.kapasitasTotal) {
            System.out.println(this.namaTerminal + " memiliki kapasitas lebih kecil dari " + terminalLain.namaTerminal);
        } else {
            System.out.println("Kedua terminal memiliki kapasitas yang sama");
        }
    }

 
    public String getNamaTerminal() {
        return namaTerminal;
    }

    public void setNamaTerminal(String namaTerminal) {
        this.namaTerminal = namaTerminal;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public Unit getUnitTerparkir() {
        return unitTerparkir;
    }

    public void setUnitTerparkir(Unit unitTerparkir) {
        this.unitTerparkir = unitTerparkir;
    }

    public int getKapasitasTotal() {
        return kapasitasTotal;
    }

    public void setKapasitasTotal(int kapasitasTotal) {
        this.kapasitasTotal = kapasitasTotal;
    }
}