package Tasks;

import java.util.*;

public class Task3_Planets {
    /*Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название
    каждой планеты и количество его повторений в списке.*/
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(3, 10);
        List<String> planets = new ArrayList<>(size);
        System.out.printf("Введите %d планет: \n", size);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.printf("%d планета - ",i+1);
            planets.add(sc.next());
        }
        System.out.println(planets);

        Set<String> unicPlanets = new HashSet<>(planets);
        for (String item : unicPlanets){
            System.out.println(item + ": " + Collections.frequency(planets, item));
        }
        sc.close();
    }
}
