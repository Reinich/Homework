package Tasks;
import java.util.Scanner;
// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
public class Task1_Jewels_Stones {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Камни: ");
        String stones = s.nextLine();
        String[] stonessarr = stones.split("");
        System.out.print("Драгоценность: ");
        String a = s.nextLine();
        System.out.print("Драгоценность: ");
        String B = s.nextLine();
        int counta = 0;
        int countB = 0;
        for (int i = 0; i < stonessarr.length; i++) {
            if (stonessarr[i].equals(a)){
                counta++;
            }
            if (stonessarr[i].equals(B)){
                countB++;
            }
        }
        System.out.printf("a"+counta+"B"+countB);
        s.close();

    }
}
