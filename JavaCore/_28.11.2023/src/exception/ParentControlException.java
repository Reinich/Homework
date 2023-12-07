package exception;

public class ParentControlException extends CustomAccountsExceptions{
    int maxMoneyControl;

    public ParentControlException(String message) {
        super(message);
    }

    public ParentControlException(String message, int maxMoneyControl) {
        this(String.format("%s %d ", message, maxMoneyControl));
        this.maxMoneyControl = maxMoneyControl;
    }

}
