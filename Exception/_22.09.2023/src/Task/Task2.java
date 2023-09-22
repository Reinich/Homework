package Task;

import java.io.*;

public class Task2 {

    public static void task2() {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String string1 = strings[1];
            test();
            int i = 1 / 1;
            inputStream = new FileInputStream("1");
        } catch (StackOverflowError error) {
            System.err.println("Первое правило рекурсии: сначала закрыть, потом запускать!");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Выход за пределы индекса");
        } catch (ArithmeticException e) {
            System.err.println("Делить на ноль нельзя!");
        } catch (FileNotFoundException e) {
            System.err.println("Неверно указан файл / Отсутствует файл");
        } catch (IOException e) {
            System.err.println("В методе указано обработать через IOException");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я все равно жив!");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader fileReader = new FileReader(file);
        fileReader.read();
//        test();
    }
}
