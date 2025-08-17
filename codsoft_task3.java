package projects;

import java.util.*;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("✅ Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("✅ Withdrawn: " + amount);
        } else {
            System.out.println("❌ Insufficient balance!");
        }
    }

    public void checkBalance() {
        System.out.println("💰 Current Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);

        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount: ");
                    account.deposit(sc.nextDouble());
                }
                case 2 -> {
                    System.out.print("Enter amount: ");
                    account.withdraw(sc.nextDouble());
                }
                case 3 -> account.checkBalance();
                case 4 -> {
                    System.out.println("👋 Thank you for using ATM!");
                    sc.close();
                    return;
                }
                default -> System.out.println("❌ Invalid choice!");
            }
        }
    }
}
