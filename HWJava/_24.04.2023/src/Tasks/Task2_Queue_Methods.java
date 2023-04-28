package Tasks;

import java.util.*;

public class Task2_Queue_Methods {
    /*Реализуйте очередь с помощью LinkedList со следующими методами:
    enqueue() - помещает элемент в конец очереди,
    dequeue() - возвращает первый элемент из очереди и удаляет его,
    first() - возвращает первый элемент из очереди, не удаляя*/
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(3,10);
        Deque<Integer> queue = createList(size);

        print(queue);
        enqueue(queue);
        print(queue);
        int removedNum = dequeue(queue);
        System.out.println(removedNum);
        print(queue);
        int firstNum = first(queue);
        System.out.println(firstNum);
        print(queue);

    }
    static void enqueue(Deque<Integer> list){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение: ");
        list.addLast(sc.nextInt());
    }
    static int dequeue(Deque<Integer> list){
        int removedEl = list.remove();
        return removedEl;
    }
    static int first(Deque<Integer> list){
        int firstPeek = list.peek();
        return firstPeek;
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
            list.add(random.nextInt(2, 10));
        }
        return list;
    }
}
