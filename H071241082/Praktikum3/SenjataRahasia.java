
public class SenjataRahasia {
    private String nama;
    private int damage;

    public SenjataRahasia() {
        this.nama = "Shuriken";
        this.damage = 15;
    }

    public SenjataRahasia(String nama, int damage) {
        this.nama = nama;
        this.damage = damage;
    }

    public String getNama() {
        return nama;
    }

    public int getDamage() {
        return damage;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
