package Tasks;

import java.util.*;

public class Task4_Task2_w_Array {
    /*Реализуйте очередь с помощью LinkedList со следующими методами:
    enqueue() - помещает элемент в конец очереди,
    dequeue() - возвращает первый элемент из очереди и удаляет его,
    first() - возвращает первый элемент из очереди, не удаляя.
    Реализовать задачу через собственный класс используя в основе массив*/
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(10);
        Deque<Integer> queue = createList(size);
        print(queue);
        System.out.println();
        enqueue(queue);
        print(queue);
        System.out.println();
        int removedNum = dequeue(queue);
        System.out.println(removedNum);
        print(queue);
        System.out.println();
        int peekNum = first(queue);
        System.out.println(peekNum);
        print(queue);
    }
    static void enqueue(Deque<Integer> list){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение: ");
        list.addLast(sc.nextInt());
    }
    static int dequeue(Deque<Integer> list){
        int removedFirst = list.removeFirst();
        return removedFirst;
    }
    static int first(Deque<Integer> list){
        int peekFirst = list.peekFirst();
        return peekFirst;
    }
    static void print(Deque<Integer> list){
        ListIterator<Integer> iterNext = (ListIterator<Integer>) list.iterator();
        while (iterNext.hasNext()){
            System.out.printf("%d ", iterNext.next());
        }
        System.out.println();
    }
    static Deque<Integer> createList(int size){
        Random random = new Random();
        Deque<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(3, 10));
        }
        return list;
    }
}
