package Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
/*1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды,
а кот пытается покушать 15-20).
2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды),
сытость = true. Считаем, что если коту мало еды в тарелке, то он её просто не трогает.
3. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о
сытости котов в консоль.
4. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку. */

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 10);
        Cat cat2 = new Cat("Mashka", 6);
        Cat cat3 = new Cat("Anfisa", 3);
        Cat cat4 = new Cat("Persik", 8);
        Cat cat5 = new Cat("Goroh", 7);
        Cat cat6 = new Cat("Krugliy", 11);
        Cat cat7 = new Cat("Puhlya", 5);
        Cat cat8 = new Cat("Kuzya", 12);
        Cat cat9 = new Cat("Motya", 6);
        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);
        cats.add(cat7);
        cats.add(cat8);
        cats.add(cat9);
        Plate plate1 = new Plate(4);
        plate1.info();
        cat1.getHugry(cat1);
        cat1.eat(cat1 ,plate1);

        System.out.println();

        plate1.addFood(plate1, 50);
        cat1.eat(cat1, plate1);

        System.out.println();

        for (Cat cat: cats){
            cat.eat(cat ,plate1);
        }

        System.out.println();

        for (Cat cat: cats){
            cat.getHugry(cat);
        }
    }
}