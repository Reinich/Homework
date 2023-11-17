package app.sample;

import app.regular.Decorator;
import app.regular.OtherClass;

/**
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 */
public class Main {
    /**
     * Точка входа в программу. С неё всегда всё начинается.
     *
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        int result = OtherClass.add(5, 5);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(5, 5);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(5, 5);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(5, 5);
        System.out.println(Decorator.decorate(result));
    }
}
