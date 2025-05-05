package bank.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BankAccount {
    // Attribute: Buat attribute di bawah dengan access modifier yang sesuai
    // accountNumber:
    // - Dapat diakses di mana saja.
    public int accountNumber;
    //
    // balance:
    // - Hanya bisa diakses langsung dalam package bank.core
    double balance;
    //
    // password:
    // - Hanya bisa diakses di dalam class BankAccount.
    protected String password;
    
    // Method:
    // deposit(amount):
    // - Dapat dipanggil dari package mana pun.
    // - Log transaksi dengan memanggil logTransaction(String action)
    //
    void deposit (double amount) {
        balance += amount;
        logTransaction("Deposit : " + amount);
    }
    // calculateInterest():
    // - Hitung bunga berdasarkan balance ditambah suku bunga 5% dan simpan di
    // balance
    // - Hanya bisa dipanggil dalam package bank.core
    void calculateInterest(){
        double interest = balance * 0.05;
        balance += interest;
        logTransaction("Interest : " + interest);
    }
    
    public void wrapperInterest() {
        calculateInterest();
    }
    // - Log transaksi dengan memanggil logTransaction(String action)
    // logTransaction(String action):
    // - Hanya bisa dipanggil di dalam class BankAccount.
    // - Print "DD/MM/YYYY: action" ke console.
    private void logTransaction(String action) {
        String date = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        System.out.println(date + " : " + action);
    }
    
    //
    // Constructor:
    // Inisialisasi accountNumber, balance, dan password.
    public BankAccount(int accountNumber, double balance, String password) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.password = password;
    }
    // CATATAN:
    // - Hanya buat method setter dan getter apabila diperlukan oleh class lain.
    public double getBalance() {
        return balance;
    }
    public String getPassword() {
        return password;
    }
}
