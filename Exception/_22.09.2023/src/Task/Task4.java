package Task;


public class Task4 {

    public static void task4() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            // option 1
            int[] abc = new int[]{1, 2, 0, 0};                                  // исправили IndexOutOfBoundsException
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль невозможно!");                  // добавили ArithmeticException
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null!");
        } catch (Throwable ex) {                                                // поменяли местами - высшая по иерархии
            System.out.println("Что-то пошло не так...");                       // Throwable, потому ниже остальных
        }

    }

    public static void printSum(Integer a, Integer b) {                          // убрали ненужный в данном контексте
        System.out.println(a + b);                                              // throws FileNotFoundException
    }


}
