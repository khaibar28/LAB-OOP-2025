public class Pembuat {
    // Atribut
    private String nama;
    private int skillLevel;
    private Ramuan ramuanAndalan;  // Atribut objek dari class lain
    
    // Constructor default
    public Pembuat() {
        this.nama = "Pembuat Default";
        this.skillLevel = 1;
        this.ramuanAndalan = new Ramuan("Ramuan Dasar", 10);
    }
    
    // Constructor dengan parameter
    public Pembuat(String nama, int skillLevel, Ramuan ramuanAndalan) {
        this.nama = nama;
        this.skillLevel = skillLevel;
        this.ramuanAndalan = ramuanAndalan;
    }
    
    // Method 1: Membuat ramuan baru (berinteraksi dengan atribut objek)
    public Ramuan buatRamuan(String namaRamuan) {
        int kekuatan = skillLevel * ramuanAndalan.getKekuatan() / 2;
        System.out.println(nama + " membuat " + namaRamuan + " dengan kekuatan " + kekuatan);
        return new Ramuan(namaRamuan, kekuatan);
    }
    
    // Method 2: Duel antar pembuat (interaksi dengan objek class yang sama)
    public void duel(Pembuat lawan) {
        System.out.println(nama + " menantang " + lawan.nama + " untuk duel!");
        
        int skorSaya = skillLevel * ramuanAndalan.getKekuatan();
        int skorLawan = lawan.skillLevel * lawan.ramuanAndalan.getKekuatan();
        
        if (skorSaya > skorLawan) {
            System.out.println(nama + " menang duel!");
            this.skillLevel++;
        } else if (skorSaya < skorLawan) {
            System.out.println(lawan.nama + " menang duel!");
            lawan.skillLevel++;
        } else {
            System.out.println("Dual berakhir seri!");
        }
    }
    
    // Getter dan setter
    public String getNama() {
        return nama;
    }
    
    public int getSkillLevel() {
        return skillLevel;
    }
    
    public Ramuan getRamuanAndalan() {
        return ramuanAndalan;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }
    
    public void setRamuanAndalan(Ramuan ramuanAndalan) {
        this.ramuanAndalan = ramuanAndalan;
    }
}