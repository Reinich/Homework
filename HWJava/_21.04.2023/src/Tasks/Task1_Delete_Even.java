package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1_Delete_Even {
    /*Пусть дан произвольный список целых чисел, удалить из него чётные числа*/
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(3,15);
        List<Integer> array = createList(size);
        System.out.println(array);
        removeEven(array);
        System.out.println(array);

    }
    static List<Integer> createList(int capacity){
        List<Integer> list = new ArrayList<>(capacity);
        Random random = new Random();
        for (int i = 0; i < capacity; i++) {list.add(random.nextInt(0,50));}
        return list;
    }
    static void removeEven(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
    }
}
