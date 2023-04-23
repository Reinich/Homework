package Tasks;
import java.util.Scanner;
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”
public class Task2_ReplaceArray_LikeIndexArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Строка: ");
        String str = sc.nextLine();
        String[] arrstr = str.split("");
        System.out.print("Индексы: ");
        int[] index = new int[arrstr.length];
        for (int i = 0; i < arrstr.length; i++) {
            index[i] = sc.nextInt();
        }
        String[] resArr = new String[str.length()];

        for (int i = 0; i < index.length; i++) {
            resArr[i] = arrstr[index[i] - 1];
        }

        for (int i = 0; i < resArr.length; i++) {
            System.out.print(resArr[i]);
        }
    }
}
