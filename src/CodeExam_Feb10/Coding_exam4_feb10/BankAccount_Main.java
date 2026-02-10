package CodeExam_Feb10.Coding_exam4_feb10;

public class BankAccount_Main {
    public static void main(String[] args) {
        // Create a bank account with initial balance
        BankAccount account = new BankAccount(1000);

        // Perform operations
        account.deposit(500);    // Valid deposit
        account.withdraw(200);   // Valid withdrawal

        // Display final balance
        System.out.println("Final Balance: " + account.getBalance());
    }

}
