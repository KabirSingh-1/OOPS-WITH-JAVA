package ExceptionHandling;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message); // pass the message to the parent Exception
    }
}

class BankAccount {
    private int balance = 1000;

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal denied: Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining: " + balance);
        }
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.withdraw(1500); // Trigger custom exception
        } catch (InsufficientBalanceException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
