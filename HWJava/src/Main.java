import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        class task1{
                    System.out.println("Hello world!");
            Scanner readTerminal = new Scanner(System.in);
        System.out.print("n: ");
            int n = readTerminal.nextInt();
            int res = (n*(n+1))/2;
        System.out.print(res);

        readTerminal.close();
        }

        class task2{
            Scanner readConsole = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int x = readConsole.nextInt();
            System.out.print("Введите второе число: ");
            int y = readConsole.nextInt();
            System.out.print("Действие(+,-,*,/): ");
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