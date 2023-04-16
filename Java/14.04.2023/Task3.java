import java.util.Scanner;
/*Реализовать простой калькулятор*/
public class Task3 {
    public static void main(String[] args) {
        Scanner readConsole = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int x = readConsole.nextInt();
        System.out.printf("Введите второе число: ");
        int y = readConsole.nextInt();
        System.out.printf("Действие(+,-,*,/): ");
        String op = readConsole.next();
        switch (op) {
            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            case "/":
                System.out.println(x/y);
                break;
        }
        readConsole.close();
    }
}
