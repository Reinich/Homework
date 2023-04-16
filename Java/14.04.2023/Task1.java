import java.util.Scanner;
public class Task1 {
    /*Вычислить n-ое треугольного число (сумма чисел от 1 до n),
      n! (произведение чисел от 1 до n)*/
    public static void main(String[] args) {
        Scanner readTerminal = new Scanner(System.in);
        System.out.printf("n: ");
        int n = readTerminal.nextInt();
        System.out.println((n*(n+1))/2);
        readTerminal.close();
    }
}
