import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Main {
    static final CountDownLatch COUNT_PHILOSOPHERS = new CountDownLatch(5);

    public static void main(String[] args) {
        List<Philosopher> philosophers = new ArrayList<>(List.of(
                new Philosopher("Ницше", COUNT_PHILOSOPHERS),
                new Philosopher("Платон", COUNT_PHILOSOPHERS),
                new Philosopher("Сократ", COUNT_PHILOSOPHERS),
                new Philosopher("Аристотель", COUNT_PHILOSOPHERS),
                new Philosopher("Гегель", COUNT_PHILOSOPHERS))
        );
        List<Fork> forks = new ArrayList<>(List.of(
                new Fork(),
                new Fork(),
                new Fork(),
                new Fork(),
                new Fork()
        ));
        Table table = new Table(philosophers, forks);
        for (Philosopher philosopher : philosophers) {
            philosopher.setTable(table);
        }
        table.startLunch();
    }

}
