public interface BankAccount {

    // 入金
    void deposit(int amount);

    // 出金
    void withdraw(int amount);

    // 残高照会
    int getBalance();

    // 口座情報表示
    void displayAccountInfo();
}
