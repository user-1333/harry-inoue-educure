public class Main5 {

    public static void main(String[] args) {

        // 普通預金口座を作成
        BankAccount account = new SavingsAccount("山田太郎", 10000);

        // 入金・出金
        account.deposit(5000);
        account.withdraw(3000);

        // 口座情報表示
        account.displayAccountInfo();
    }
}
