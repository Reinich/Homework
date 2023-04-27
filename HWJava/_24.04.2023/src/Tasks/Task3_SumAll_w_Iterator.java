package Tasks;

import java.util.Deque;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Task3_SumAll_w_Iterator {
    /*Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор*/
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(10);
        LinkedList<Integer> list = createList(size);
        print(list);
        System.out.println(sumList(list));


    }
    static int sumList(LinkedList<Integer> list){
        int sum = 0;
        ListIterator<Integer> sumNum = list.listIterator();
        while (sumNum.hasNext()){
            sum += sumNum.next();
        }
        return sum;
    }
    static void print(LinkedList<Integer> list){
        ListIterator<Integer> iterNext = (ListIterator<Integer>) list.iterator();
        while (iterNext.hasNext()){
            System.out.printf("%d ", iterNext.next());
        }
        System.out.println();
    }
    static LinkedList<Integer> createList(int size){
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(2, 10));
        }
        return list;
    }
}
