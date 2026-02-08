public class Main1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        account.deposit(2000);

        account.withdraw(3000);
//        System.out.println("出金後の残高: " + account.getBalance());

        account.withdraw(1500); // 残高不足のケース
//        System.out.println("最終残高: " + account.getBalance());
    }
}