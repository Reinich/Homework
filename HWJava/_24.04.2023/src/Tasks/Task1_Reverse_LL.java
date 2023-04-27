package Tasks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Task1_Reverse_LL {
    /*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    Постараться не обращаться к листу по индексам.*/
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(10);

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(1, 5));
        }
        ListIterator<Integer> iterNext = list.listIterator();
        while (iterNext.hasNext()){
            System.out.printf("%d ", iterNext.next());
        }
        System.out.println();
        System.out.println("->");
        ListIterator<Integer> iterPrev = list.listIterator(list.size());
        while (iterPrev.hasPrevious()){
            System.out.printf("%d ", iterPrev.previous());
        }
    }
}