import java.util.ArrayList;
import java.util.List;

public class SavingsAccount implements BankAccount {

    // フィールド
    private final String accountHolder;
    private int balance;
    private final List<String> transactionHistory;

    // コンストラクタ
    public SavingsAccount(String accountHolder, int initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();

        transactionHistory.add("口座作成： 初期残高 = " + initialBalance);
    }

    // 入金
    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("入金： " + amount);
            return;
        }
        System.out.printf("入金額が不正です: %d%n", amount);
    }

    // 出金
    @Override
    public void withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactionHistory.add("出金： " + amount);
            return;
        }
        System.out.printf("出金額が不正です: %d%n", amount);
    }

    // 残高取得
    @Override
    public int getBalance() {
        return balance;
    }

    // 口座情報表示
    @Override
    public void displayAccountInfo() {
        System.out.println("口座名義人： " + accountHolder);
        System.out.println("残高： " + balance);
//        System.out.println("取引履歴：");
//
//        for (String history : transactionHistory) {
//            System.out.println(history);
//        }
    }
}
