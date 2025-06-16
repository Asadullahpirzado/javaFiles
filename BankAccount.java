public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        if(balance>=0)
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void transferAmount(BankAccount destination, double amount) {
        if (destination == null) {
            System.out.println("Error: Destination account cannot be null.");
            return;
        }
        if (amount <= 0) {
            System.out.println("Error: Transfer amount must be positive.");
            return;
        }
        if (this.balance < amount) {
            System.out.println("Error: Insufficient balance in " + this.accountHolder + "'s account.");
            return;
        }

        // Perform the transfer
        this.balance -= amount;
        destination.balance += amount;
        System.out.println("Successfully transferred $" + amount + " from " + this.accountHolder + " to " + destination.accountHolder);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1001", "Alice Smith", 5000.0);
        BankAccount account2 = new BankAccount("1002", "Bob Johnson", 3000.0);

        // Display initial balances
        System.out.println("Bank Transactions at 02:21 PM PKT, Tuesday, May 20, 2025:\n");
        System.out.println(account1.getAccountHolder() + "'s Initial Balance: $" + account1.getBalance());
        System.out.println(account2.getAccountHolder() + "'s Initial Balance: $" + account2.getBalance());
        System.out.println();

        // Test the transferAmount method
        account1.transferAmount(account2, 1500.0);

        // Display updated balances
        System.out.println("\nAfter Transfer:");
        System.out.println(account1.getAccountHolder() + "'s Balance: $" + account1.getBalance());
        System.out.println(account2.getAccountHolder() + "'s Balance: $" + account2.getBalance());
        System.out.println();

        // Test with insufficient balance
        account2.transferAmount(account1, 6000.0);
    }
}
