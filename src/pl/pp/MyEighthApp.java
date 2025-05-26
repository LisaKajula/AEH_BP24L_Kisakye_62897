package pl.pp;

public class MyEighthApp {
    public static void main(String[] args) {
        Account myAccount = new Account("123456", 1000.0, "John Doe", "john@example.com", "123-456-789");

        myAccount.withdraw(900.0);
        myAccount.deposit(250.0);
        myAccount.withdraw(50.0);
        myAccount.withdraw(500.0);
    }
}
