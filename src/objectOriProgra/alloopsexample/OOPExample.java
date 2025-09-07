package objectOriProgra.alloopsexample;

abstract class Account {
    private String accountNumber;   // Encapsulation (private)
    private double balance;

    // Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and Setters (Encapsulation)
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract method (Abstraction)
    public abstract void withdraw(double amount);

    // Normal method (common for all accounts)
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New Balance: " + balance);
    }
}

// 2. Inheritance + Polymorphism (Overriding)
class SavingsAccount extends Account {
    private double withdrawalLimit = 20000;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() && amount <= withdrawalLimit) {
            setBalance(getBalance() - amount);
            System.out.println(amount + " withdrawn from Savings. New Balance: " + getBalance());
        } else {
            System.out.println("Withdrawal failed! Limit exceeded or insufficient balance.");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit = 5000;

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println(amount + " withdrawn from Current. New Balance: " + getBalance());
        } else {
            System.out.println("Withdrawal failed! Overdraft limit exceeded.");
        }
    }
}

// 3. Polymorphism (Overloading Example)
class InterestCalculator {
    // Method Overloading (Compile-time Polymorphism)
    public double calculate(double balance) {
        return balance * 0.05;  // 5% interest
    }

    public double calculate(double balance, double rate) {
        return balance * rate;
    }
}

// 4. Main Class (Test OOP Concepts)
public class OOPExample {
    public static void main(String[] args) {
        // Abstraction + Inheritance + Encapsulation
        Account acc1 = new SavingsAccount("SA123", 50000);
        Account acc2 = new CurrentAccount("CA123", 10000);

        acc1.deposit(5000);
        acc1.withdraw(15000);

//        acc2.deposit(1000);
//        acc2.withdraw(12000);
//
//        // Polymorphism (Overloading)
//        InterestCalculator calc = new InterestCalculator();
//        System.out.println("Interest (default 5%): " + calc.calculate(acc1.getBalance()));
//        System.out.println("Interest (custom 7%): " + calc.calculate(acc1.getBalance(), 0.07));
    }
}

