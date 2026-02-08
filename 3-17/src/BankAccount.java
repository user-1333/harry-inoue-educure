public class BankAccount {
    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }
    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("入金額は正の数でなければなりません。");
            return;
        }
        System.out.printf("残高: %d円\n", balance);
        balance += amount;
        System.out.printf("%d円入金しました。\n", amount);
    }
    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("引き出しに失敗しました。残高が不足しています。");
            return;
        }
        System.out.printf("残高: %d円\n", balance);
        balance -= amount;
        System.out.printf("%d円引き出しました。\n", amount);
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
