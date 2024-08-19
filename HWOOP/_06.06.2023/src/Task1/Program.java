package Task1;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     //
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     */
    public static void main(String[] args) {
        Box<Apple> boxApple = new Box<>();
        Box<Orange> boxOrange = new Box<>();
        Apple apple = new Apple();
        Orange orange = new Orange();
        boxApple.addFruit(apple, 12);
        boxApple.addFruit(apple, 12);
//        boxApple.addFruit(orange, 12);
        boxOrange.addFruit(orange, 4);
        boxOrange.addFruit(orange, 4);
        boxOrange.addFruit(orange, 4);
        boxOrange.addFruit(orange, 4);

        System.out.println(boxOrange.getSizeBox());
        System.out.println(boxApple.getSizeBox());


        System.out.println(boxOrange.getWeight());
        System.out.println(boxApple.getWeight());

        System.out.println(boxApple.equals(boxOrange));
        boxOrange.addFruit(orange, 4);
        System.out.println(boxApple.equals(boxOrange));

    }

}
