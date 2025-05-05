package bank.user;

import bank.core.BankAccount;

public class Customer {
    public static void viewAccount() {
        BankAccount account = new BankAccount(151102, 1000000.0, "password123"); // TODO: buat objek BankAccount dengan nilai awal
        System.out.println(account.getBalance()); // TODO: print balance, access modifier balance harus sesuai dengan
                                             // ketentuan pada BankAccount

        System.out.println(account.getPassword()); // TODO: print password, access modifier password harus sesuai dengan
                                              // ketentuan pada BankAccount

        account.wrapperInterest(); // TODO: Soal bonus: Buat method calculateInterest pada BankAccount. Apabila
                                     // tidak dapat diakses pada class ini buat method baru pada BankAccount sebagai
                                     // wrapper
    }
}
