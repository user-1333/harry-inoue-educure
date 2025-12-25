public class Main6 {
    public static void main(String[] args) {
        Account account = new Account(12345);
        account.deposit(1000);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());
        account.withdraw(500);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}
