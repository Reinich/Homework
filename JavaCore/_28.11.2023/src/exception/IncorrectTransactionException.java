package exception;

public class IncorrectTransactionException extends CustomAccountsExceptions{
    int startBankAccount;

    public IncorrectTransactionException(String message) {
        super(message);
    }

    public IncorrectTransactionException(String message, int startBankAccount) {
        this(String.format("%s на счету: %d", message, startBankAccount));
        this.startBankAccount = startBankAccount;
    }
}
