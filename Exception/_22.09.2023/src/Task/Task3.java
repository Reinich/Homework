package Task;

public class Task3 {
    public static void task3() {
        try {
            int[] intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // создали отсутствующий массив
            int d = 3;                                                // не делим на ноль
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
