package Task1;

import Task1.Model.Order;
import Task1.Util.JSONSaver;
import Task1.Util.Saver;
import Task1.View.ConsoleView;

public class Main {
    public static void main(String[] args) {
        ConsoleView consoleView = new ConsoleView();
        Saver orderSaver = new JSONSaver();
        Order order = consoleView.inputFromConsole();
        orderSaver.save(order);
    }
}