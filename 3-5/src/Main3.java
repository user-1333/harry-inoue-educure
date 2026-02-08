public class Main3 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = account1;
        account1.setBalance(1000);
        account2.setBalance(2000);
        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance());

    }
}
