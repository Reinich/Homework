package Task1.View;

import Task1.Model.Order;
import java.util.Scanner;

public class ConsoleView {
    public Order inputFromConsole() {
        System.out.println("������� �����:");
        String clientName = prompt("��� �������: ");
        String product = prompt("�������: ");
        int quantity = Integer.parseInt(prompt("����������: "));
        int price = Integer.parseInt(prompt("����: "));
        return new Order(clientName, product, quantity, price);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
