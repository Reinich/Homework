package Task_3_Pair;

/**
 * Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь методы
 * getFirst(), getSecond() для получения значений каждого из составляющих пары, а также переопределение метода
 * toString(), возвращающее строковое представление пары.
 */
public class Pair <T, U>{
    private T t;
    private U u;

    public Pair(T t, U u) {
        this.t = t;
        this.u = u;
    }

    private T getFirst(){ return t;}
    private U getSecond(){
        return u;
    }


    @Override
    public String toString() {
        return String.format("First: %s, Second: %s", getFirst(), getSecond());
    }
}
