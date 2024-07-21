package oops.encapsulation;


public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

//    public void withdraw(double amount) {
//        if (amount > 0 && balance >= amount) {
//            balance -= amount;
//        }
//    }
    
   //  the external code that uses the BankAccount class does not need to be aware of these internal changes.
    public void withdraw(double amount) {
        double fee = 0.5; // Assume a withdrawal fee of $0.5
        if (amount > 0 && balance >= amount + fee) {
            balance -= (amount + fee);
        }
    }
}
