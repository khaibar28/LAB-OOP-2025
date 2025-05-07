public class App {
    public static void main(String[] args) {
        // Create instances of Skateboard
        Kendaraan skateboard1 = new Skateboard("Element", "Penny");
        skateboard1.setTahunProduksi(2022);
        skateboard1.setWarna("Merah");
        
        // Start the skateboard
        skateboard1.mulai();
        
        // Set speed and print details
        skateboard1.setKecepatan(15.0);
        System.out.println("Skateboard ID: " + skateboard1.getId());
        System.out.println("Merek: " + skateboard1.getMerek());
        System.out.println("Model: " + skateboard1.getModel());
        System.out.println("Tahun Produksi: " + skateboard1.getTahunProduksi());
        System.out.println("Warna: " + skateboard1.getWarna());
        System.out.println("Kecepatan: " + skateboard1.getKecepatan() + " km/h");
        
        // Stop the skateboard
        skateboard1.berhenti();

        System.out.println("");

        Kendaraan sepeda = new Sepeda("poligon", "Sepeda Gunung");
        sepeda.setTahunProduksi(2020);
        sepeda.setWarna("Merah");

        sepeda.mulai();
        sepeda.setKecepatan(15.0);
        System.out.println("Sepeda ID: " + sepeda.getId());
        System.out.println("Merek: " + sepeda.getMerek());
        System.out.println("Model: " + sepeda.getModel());
        System.out.println("Tahun Produksi: " + sepeda.getTahunProduksi());
        System.out.println("Warna: " + sepeda.getWarna());
        System.out.println("Kecepatan: " + sepeda.getKecepatan() + " km/h");

    }
}
