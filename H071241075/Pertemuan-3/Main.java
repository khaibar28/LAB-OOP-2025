
public class Main {
    public static void main(String[] args) {
        // Membuat objek TerminalBus
        TerminalBus terminal1 = new TerminalBus("Terminal Lebak Bulus", "Jakarta Selatan", 50);
        TerminalBus terminal2 = new TerminalBus("Terminal Pulo Gadung", "Jakarta Timur", 30);

        // Membuat objek Unit
        Unit unit1 = new Unit("B-1234-CD", "Bandung", 30);
        Unit unit2 = new Unit("B-5678-EF", "Surabaya", 40);

        // Membuat objek Penumpang
        Penumpang penumpang1 = new Penumpang("Andi", "12A", "Bandung");
        Penumpang penumpang2 = new Penumpang("Budi", "12B", "Bandung");
        Penumpang penumpang3 = new Penumpang("Cici", "15C", "Surabaya");

        // Testing interaksi antar objek
        terminal1.parkirUnit(unit1);
        terminal1.parkirUnit(unit2); // Harusnya gagal karena unit1 sudah terparkir

        unit1.naikkanPenumpang(penumpang1);
        unit2.naikkanPenumpang(penumpang3);

        penumpang1.setTemanSebangku(penumpang2);

        // Testing method yang melibatkan interaksi antar objek class yang sama
        terminal1.bandingkanKapasitas(terminal2);
        unit1.bandingkanKapasitas(unit2);
        penumpang1.cekKesamaanTujuan(penumpang2);
        penumpang1.cekKesamaanTujuan(penumpang3);
    }
}