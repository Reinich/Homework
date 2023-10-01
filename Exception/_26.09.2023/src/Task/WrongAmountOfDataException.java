package Task;

public class WrongAmountOfDataException extends Exception {
    int arrayLength;

    public WrongAmountOfDataException() {
        super("Неверное количество введенных данных.");
    }

    public WrongAmountOfDataException(String message) {
        super(message);
    }

    public WrongAmountOfDataException(int arrayLength) {
        this(String.format("Было введенно %s, вместо 6.", arrayLength));
        this.arrayLength = arrayLength;

    }
}
