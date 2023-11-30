package exception;

public class CustomAccountsExceptions extends Exception {

    public CustomAccountsExceptions(){
        super("Ошибка операции");
    }

    public CustomAccountsExceptions(String message){
        super(message);
    }

}
