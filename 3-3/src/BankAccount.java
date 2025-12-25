public class BankAccount {
    private int balance;
    public int getBalance() {
        return this.balance;
    }
    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
    public void withdraw(int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return;
        }
        System.out.println("残高不足または無効な金額です。");
    }

}
