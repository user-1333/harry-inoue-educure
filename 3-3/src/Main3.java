public class Main3 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(10000);
        System.out.println("現在の残高: " + myAccount.getBalance() + "円");

        myAccount.withdraw(3000);
        System.out.println("3000円引き出しました。\n現在の残高: " + myAccount.getBalance() + "円");

        myAccount.withdraw(10000); // 残高不足を試みる
    }
}
