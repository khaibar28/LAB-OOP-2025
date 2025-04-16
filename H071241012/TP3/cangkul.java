// Class Cangkul
class Cangkul {
    String merk;
    double berat;

    public Cangkul() {
        this.merk = "Tanpa Merk";
        this.berat = 2.0;
    }

    public Cangkul(String merk, double berat) {
        this.merk = merk;
        this.berat = berat;
    }

    public void gunakan() {
        System.out.println("Cangkul " + merk + " sedang digunakan. Berat: " + berat + " kg.");
    }
}
