public class Rekening {
    // No. 1 -> memiliki 3 attribute
    Pemilik pemilik;
    String nomorRekening;
    double saldo;

    public Rekening() {
        // No.2 -> memiliki 2 constructor : Constructor Default
        this.pemilik = new Pemilik();
        this.nomorRekening = "000000";
        this.saldo = 0.0;
    }

    public Rekening(Pemilik pemilik, String nomorRekening, double saldo) {
        // No.2 -> memiliki 2 constructor : Constructor dengan parameter
        this.pemilik = pemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public void tampilkanInfo() {
        // No.1 -> Memiliki 2 behavior (method) : method 1
        System.out.println("Nama Pemilik     : " + pemilik.getNama());
        System.out.println("Bank Pemilik   : " + pemilik.getJenisBank());
        System.out.println("Nomor Rekening   : " + nomorRekening);
        System.out.println("Saldo            : Rp " + saldo);
    }

    public void bandingkanSaldo(Rekening lain) {
        // No.1 -> Memiliki 2 behaviior (method) : method 2
        if (this.saldo > lain.saldo) {
            System.out.println(this.pemilik.getNama() + " memiliki saldo lebih banyak dari " + lain.pemilik.getNama());
        } else if (this.saldo < lain.saldo) {
            System.out.println(this.pemilik.getNama() + " memiliki saldo lebih sedikit dari " + lain.pemilik.getNama());
        } else {
            System.out.println("Keduanya memiliki saldo yang sama.");
        }
    }

    public void transferSaldo(Rekening penerima, double jumlah) {
        // No.3 -> method : interaksi dua objek dari Class Rekening
        if (jumlah <= this.saldo && jumlah > 0) {
            this.saldo -= jumlah;
            penerima.saldo += jumlah;
            System.out.println("Transfer berhasil! Rp " + jumlah + " telah ditransfer dari " 
                + this.pemilik.getNama() + " ke " + penerima.pemilik.getNama());
        } else {
            System.out.println("Transfer gagal! Saldo tidak cukup atau jumlah tidak valid.");
        }
    }
}

