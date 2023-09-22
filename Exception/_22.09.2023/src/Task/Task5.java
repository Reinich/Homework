package Task;

import java.util.Scanner;

public class Task5 {
    public static void task5() throws IllegalArgumentException{
        Scanner sc = new Scanner(System.in);
        try {
            String text = sc.nextLine();
            if (text.isEmpty() || (text.strip().equals(""))){
                throw new IllegalArgumentException();
            }
            System.out.println(text);
        } catch (IllegalArgumentException e){
            System.out.println("Пустые строки вводить нельзя!");
        }
    }
}
