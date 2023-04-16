import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Вводится массив (сначала количество элементов, потом сами элементы).
        // Найдите сумму его элементов с чётными индексами и выведите её. А потом
        // выведите числа, которые суммировались.
        Scanner readConsole = new Scanner(System.in);
        System.out.print("Введите кол-во эл-тов: ");
        int n = readConsole.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите %d эл-т: ", i + 1);
            array[i] = readConsole.nextInt();
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0)
                count++;
        }
        int[] index_arr = new int[count];
        int sum = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
                index_arr[j] += array[i];
                j++;
            }
        }
        System.out.printf("Сумма четных индексов ровна: %d", sum);
        System.out.println();
        for (int i : index_arr) {
            System.out.println(i);
        }
        readConsole.close();
    }
}
