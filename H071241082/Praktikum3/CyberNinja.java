
public class CyberNinja {
    private String kodeNama;
    private int energi;
    private SenjataRahasia senjata;

    public CyberNinja() {
        this.kodeNama = "Unit-X";
        this.energi = 100;
        this.senjata = new SenjataRahasia();
    }

    public CyberNinja(String kodeNama, int energi, SenjataRahasia senjata) {
        this.kodeNama = kodeNama;
        this.energi = energi;
        this.senjata = senjata;
    }

    public void serang(CyberNinja musuh) {
        int damage = this.senjata.getDamage();
        musuh.energi -= damage;
        if (musuh.energi < 0) musuh.energi = 0;
        System.out.println(this.kodeNama + " menyerang " + musuh.kodeNama + " dengan " + senjata.getNama()
                           + " dan mengurangi " + damage + " energi.");
    }

    public void tampilkanStatus() {
        System.out.println("CyberNinja " + kodeNama + " | Energi: " + energi
                           + " | Senjata: " + senjata.getNama() + " (Damage: " + senjata.getDamage() + ")");
    }

    public int getEnergi() {
        return energi;
    }

    public String getKodeNama() {
        return kodeNama;
    }
}
