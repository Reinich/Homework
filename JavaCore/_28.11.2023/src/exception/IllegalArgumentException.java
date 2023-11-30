package exception;

public class IllegalArgumentException extends CustomAccountsExceptions {
    int account;

    public IllegalArgumentException(String message) {
        super(message);
    }

    public IllegalArgumentException(String message, int account) {
        this(String.format("%s %d ", message, account));
        this.account = account;
    }

}
