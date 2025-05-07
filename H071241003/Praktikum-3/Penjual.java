public class Penjual {
    // Atribut
    private String namaToko;
    private int modal;
    private Pembuat supplier;  // Atribut objek dari class lain
    
    // Constructor default
    public Penjual() {
        this.namaToko = "Toko Default";
        this.modal = 100;
        this.supplier = new Pembuat();
    }
    
    // Constructor dengan parameter
    public Penjual(String namaToko, int modal, Pembuat supplier) {
        this.namaToko = namaToko;
        this.modal = modal;
        this.supplier = supplier;
    }
    
    // Method 1: Membeli ramuan dari pembuat (berinteraksi dengan atribut objek)
    public void beliDariPembuat(Ramuan ramuan, int harga) {
        if (modal >= harga) {
            modal -= harga;
            System.out.println(namaToko + " membeli " + ramuan.getNama() + " dari " + supplier.getNama());
        } else {
            System.out.println("Modal tidak cukup!");
        }
    }
    
    // Method 2: Kompetisi dengan penjual lain (interaksi dengan objek class yang sama)
    public void kompetisi(Penjual kompetitor) {
        System.out.println(namaToko + " bersaing dengan " + kompetitor.namaToko);
        
        if (this.modal > kompetitor.modal) {
            System.out.println(namaToko + " menang kompetisi!");
            this.modal += 50;
        } else if (this.modal < kompetitor.modal) {
            System.out.println(kompetitor.namaToko + " menang kompetisi!" );
            kompetitor.modal += 50;
        } else {
            System.out.println("Kompetisi seri!");
        }
    }
    
    // Getter dan setter
    public String getNamaToko() {
        return namaToko;
    }
    
    public int getModal() {
        return modal;
    }
    
    public Pembuat getSupplier() {
        return supplier;
    }
    
    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }
    
    public void setModal(int modal) {
        this.modal = modal;
    }
    
    public void setSupplier(Pembuat supplier) {
        this.supplier = supplier;
    }
}

