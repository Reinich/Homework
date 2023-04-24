package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Task2_Min_Max_Average {
    /*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.*/
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(3, 10);
        List<Integer> ArrayList = createList(size);
        System.out.println(ArrayList);
        System.out.printf("min - %d\n", Collections.min(ArrayList));
        System.out.printf("max - %d\n", Collections.max(ArrayList));
        System.out.printf("average - %d\n", AverageList(ArrayList));

    }
    static List<Integer> createList(int capacity){
        List<Integer> list = new ArrayList<>(capacity);
        Random random = new Random();
        for (int i = 0; i < capacity; i++) {list.add(random.nextInt(0,10));}
        return list;
    }
    static int AverageList(List<Integer> list){
        int average = 0;
        for (int i = 0; i < list.size(); i++) {
            average += list.get(i);
        }
        average = average / list.size();
        return average;
    }
}
