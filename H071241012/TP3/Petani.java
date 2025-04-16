// Class Petani
public class Petani {
    String nama;
    int tenaga;
    Cangkul alat;

    // Constructor default
    public Petani() {
        this.nama = "kosong";
        this.tenaga = 100;
        this.alat = new Cangkul();
    }

    // Constructor dengan parameter
    public Petani(String nama, int tenaga, Cangkul alat) {
        this.nama = nama;
        this.tenaga = tenaga;
        this.alat = alat;
    }

    // Method menggunakan objek Cangkul
    public void bertani() {
        System.out.println(nama + " sedang bertani dengan semangat!");
        alat.gunakan();
        tenaga -= 10;
    }

    // Method interaksi antar objek dari class yang sama
    public void aduTenaga(Petani lawan) {
        System.out.println(nama + " menantang " + lawan.nama + " adu tenaga!");
        if (this.tenaga > lawan.tenaga) {
            System.out.println(nama + " menang adu tenaga!");
        } else if (this.tenaga < lawan.tenaga) {
            System.out.println(lawan.nama + " menang adu tenaga!");
        } else {
            System.out.println("Keduanya seri!");
        }
    }
}
