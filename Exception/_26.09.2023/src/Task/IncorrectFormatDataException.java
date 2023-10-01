package Task;

public class IncorrectFormatDataException extends NumberFormatException {

    int i;

    String[] arr;


    public IncorrectFormatDataException() {
        super("Неверный формат данных.");

    }

    public IncorrectFormatDataException(String message) {
        super(message);
//        this.a = a;
    }

    public IncorrectFormatDataException(String[] arr, int i) {
        this(String.format("Ошибка ввода в: %s", arr[i]));
        this.i = i;
        this.arr = arr;
    }

    public IncorrectFormatDataException(int i) {
        this(String.format("Ошибка ввода на позиции: %s", i));
        this.i = i;
    }

}
