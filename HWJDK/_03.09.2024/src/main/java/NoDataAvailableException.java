public class NoDataAvailableException extends NullPointerException{

    public NoDataAvailableException() {
        super("Unknown exception");
    }
    public NoDataAvailableException(String msg){
        super(msg);
    }

    public NoDataAvailableException(String msg, int number){
        this(String.format(msg + number));
    }

    public NoDataAvailableException(String msg, String name){
        this(String.format(msg + name));
    }
}
