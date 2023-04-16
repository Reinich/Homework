import java.util.Scanner;
public class Task4 {
    /*Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
     Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет. */
    public static void main(String[] args) {
        Scanner readConsole = new Scanner(System.in);
        System.out.println("Введите кол-во десятков первого числа: ");
        int a = readConsole.next();
        
        System.out.println("Введите кол-во единиц второго числа: ");
        int b = readConsole.nextLine();

        System.out.println("Введите сумму чисел: ");
        int sum = readConsole.next();
        
        int c = a + b; 
        if (sum - a < 10){ 
            System.out.printf("%d NO", 0); 
        } 
        else if (a == 0){ 
            System.out.printf("%d NO", 0); 
        } 
        else if (b == 0 & sum - a == 10){ 
            System.out.printf("%d ", a); 
            System.out.printf("%d ", b + 10); 
        } 
        else if (c > sum){ 
            System.out.printf("%d NO", 0); 
        } 
        else{ 
            int tmp_sum = sum - c; 
            int ed_a = tmp_sum % 10 + a; 
            int de_b = (tmp_sum / 10) * 10 + b; 
            System.out.printf("%d ", ed_a); 
            System.out.printf("%d ", de_b); 
        }

        









        readConsole.close();

    }   
}
