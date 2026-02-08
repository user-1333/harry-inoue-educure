public class BankAccount {
    private int balance;
    public int getBalance() {
        return this.balance;
    }
    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(amount + "円預けました。");
        }
    }
    public void withdraw(int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println(amount + "円引き出しました。");
            return;
        }
        System.out.println("残高が不足しています");
    }

}
