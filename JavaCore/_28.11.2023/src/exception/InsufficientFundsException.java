package exception;

public class InsufficientFundsException extends CustomAccountsExceptions {
    int startBankAccount;

    public InsufficientFundsException(String message) {
        super(message);
    }

    public InsufficientFundsException(String message, int startBankAccount) {
        this(String.format("%s на счету: %d", message, startBankAccount));
        this.startBankAccount = startBankAccount;
    }

}
