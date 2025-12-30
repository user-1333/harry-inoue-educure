public class BankAccount {
    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }
    public int withdraw(int amount) {
        if (balance < amount) {
            System.out.println("出金不可能です。残高不足");
            return balance;
        }
        balance -= amount;
        return balance;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
