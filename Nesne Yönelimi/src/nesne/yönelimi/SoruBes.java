package nesne.yönelimi;

import java.util.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate; 
    private Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date(); 
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Gecersiz cekim tutari veya yetersiz bakiye.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Yatirilacak tutar pozitif olmalidir.");
        }
    }
}

public class SoruBes {
    public static void main(String[] args) {
        Account hesap = new Account(1122, 20000);

        hesap.setAnnualInterestRate(4.5);

      
        hesap.withdraw(2500);

        hesap.deposit(3000);

       
        System.out.println("--- Hesap Ozeti ---");
        System.out.println("Hesap ID          : " + hesap.getId());
        System.out.printf("Guncel Bakiye     : $%.2f%n", hesap.getBalance());
        System.out.printf("Aylik Faiz Getirisi: $%.2f%n", hesap.getMonthlyInterest());
        System.out.println("Hesap Acilis Tarihi: " + hesap.getDateCreated());
    }
}