package bank.core;

public class SampleBankAccount {
    // Hanya ubah baris dengan komentar
    public static void viewAccount() {
        BankAccount account = new BankAccount(1521102, 1000000.0, "password123"); // TODO: buat objek BankAccount dengan nilai awal

        System.out.println(account.accountNumber); // TODO: tampilkan accountNumber, access modifier accountNumber harus
                                                   // sesuai dengan ketentuan pada BankAccount

        System.out.println(account.balance); // TODO: tampilkan balance, access modifier balance harus sesuai dengan
                                             // ketentuan pada BankAccount

        System.out.println(account.password); // TODO: tampilkan password, access modifier password harus sesuai dengan
                                              // ketentuan pada BankAccount

        account.deposit(1000); // TODO: buat method deposit pada BankAccount, access modifier deposit harus
                               // sesuai dengan ketentuan pada BankAccount

        account.calculateInterest(); // TODO: Soal bonus: Buat method calculateInterest pada BankAccount. Apabila
                                     // tidak dapat diakses pada class ini buat method baru pada BankAccount sebagai
                                     // wrapper
    }
}
