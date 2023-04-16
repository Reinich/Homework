import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // Дан список. Выведите те его элементы, которые встречаются в списке только
        // один раз.
        // Элементы нужно выводить в том порядке, в котором они встречаются в списке.
        Scanner readConsole = new Scanner(System.in);
        System.out.printf("Введите кол-во эл-ов: ");
        int n = readConsole.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите %d эл-т: ", i + 1);
            array[i] = readConsole.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 1; j < array.length; j++) {
                if (array[i] == array[j])
                    count++;
            }
            if (count == 0)
                System.out.println(array[i]);
        }

    }
}
