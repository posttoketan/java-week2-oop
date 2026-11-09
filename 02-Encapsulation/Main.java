public class Main {

    static class BankAccount {
        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;

            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                this.balance = 0.0;
            }
        }

        public double getBalance() {
            return this.balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
                System.out.println("Deposited: ₹" + amount
                        + " | Current Balance: ₹" + this.balance);
            } else {
                System.out.println("Invalid deposit amount rejected.");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("SB-78901", 5000.0);

        acc.deposit(1500.0);
        acc.deposit(-200.0);
    }
}
