public class Main {
    public static void main(String[] args) {
        // Membuat objek-objek
        Ramuan ramuanSpesial = new Ramuan("Elixir Legendaris", 20);
        Pembuat pembuat1 = new Pembuat("Alchemist Master", 5, ramuanSpesial);
        Pembuat pembuat2 = new Pembuat("Potion Expert", 4, new Ramuan("Healing Potion", 15));
        
        Penjual penjual1 = new Penjual("Magic Potion Shop", 500, pembuat1);
        Penjual penjual2 = new Penjual("Witch Brew", 300, pembuat2);
        
        Pembeli pembeli1 = new Pembeli("Adventurer", 100, penjual1);
        Pembeli pembeli2 = new Pembeli("Wizard", 80, penjual2);
        
        Penjual penjual3 = new Penjual();
        penjual3.setNamaToko("Khaibar shop");
        penjual3.setModal(600);
        penjual3.setSupplier(pembuat2);

        Pembeli pembeli3 = new Pembeli();
        pembeli3.setNama("Khaibar");
        pembeli3.setUang(100);
        pembeli3.setPenjualFavorit(penjual3);



        // Demonstrasi Pembuat
        Ramuan ramuanBaru = pembuat1.buatRamuan("Mana Potion");
        pembuat1.duel(pembuat2);

        Ramuan ramuanBaru2 = pembuat2.buatRamuan("Healing Potion");
        pembuat2.duel(pembuat1);
        
        // Demonstrasi Penjual
        penjual1.beliDariPembuat(ramuanBaru, 50);
        penjual1.kompetisi(penjual2);
        penjual3.beliDariPembuat(ramuanBaru2, 100);
        
        // Demonstrasi Pembeli
        pembeli1.beliRamuan(ramuanBaru, 30);
        pembeli1.rekomendasikan(pembeli2, ramuanBaru);
        pembeli3.beliRamuan(ramuanBaru2, 30);
        pembeli3.rekomendasikan(pembeli1, ramuanBaru2);

    }
}