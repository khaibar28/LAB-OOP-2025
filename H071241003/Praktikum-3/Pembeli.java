public class Pembeli {
    // Atribut
    private String nama;
    private int uang;
    private Penjual penjualFavorit;  // Atribut objek dari class lain
    
    // Constructor default
    public Pembeli() {
        this.nama = "Pembeli Default";
        this.uang = 50;
        this.penjualFavorit = new Penjual();
    }
    
    // Constructor dengan parameter
    public Pembeli(String nama, int uang, Penjual penjualFavorit) {
        this.nama = nama;
        this.uang = uang;
        this.penjualFavorit = penjualFavorit;
    }
    
    // Method 1: Membeli ramuan (berinteraksi dengan atribut objek)
    public void beliRamuan(Ramuan ramuan, int harga) {
        if (uang >= harga) {
            uang -= harga;
            System.out.println(nama + " membeli " + ramuan.getNama() + " dari " + penjualFavorit.getNamaToko());
        } else {
            System.out.println("Uang tidak cukup!");
        }
    }
    
    // Method 2: Rekomendasi pembeli lain (interaksi dengan objek class yang sama)
    public void rekomendasikan(Pembeli teman, Ramuan ramuan) {
        System.out.println(nama + " merekomendasikan " + ramuan.getNama() + " ke " + teman.nama);
        
        if (teman.uang >= 30) {
            teman.beliRamuan(ramuan, 30);
        } else {
            System.out.println(teman.nama + " tidak punya cukup uang");
        }
    }
    
    // Getter dan setter
    public String getNama() {
        return nama;
    }
    
    public int getUang() {
        return uang;
    }
    
    public Penjual getPenjualFavorit() {
        return penjualFavorit;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setUang(int uang) {
        this.uang = uang;
    }
    
    public void setPenjualFavorit(Penjual penjualFavorit) {
        this.penjualFavorit = penjualFavorit;
    }
} 
