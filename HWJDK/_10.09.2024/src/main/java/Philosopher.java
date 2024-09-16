import java.util.concurrent.CountDownLatch;

public class Philosopher extends Thread {

    private final String name;
    private boolean hungryStatus = true;
    private volatile Fork leftFork;
    private volatile Fork rightFork;
    private final CountDownLatch cdlPhilosopher;
    private CountDownLatch count;
    private Table table;

    public Philosopher(String name, CountDownLatch count) {
        this.name = name;
        this.cdlPhilosopher = new CountDownLatch(3);
        this.count = count;
    }

    public CountDownLatch getCount() {
        return count;
    }

    public void setLeftFork(Fork leftFork) {
        this.leftFork = leftFork;
    }

    public void setRightFork(Fork rightFork) {
        this.rightFork = rightFork;
    }

    public void takeLeftFork() {
        this.leftFork.setOccupationStatus(true);
    }

    public void takeRightFork() {
        this.rightFork.setOccupationStatus(true);
    }

    public void putLeftForkOnTable() {
        this.leftFork.setOccupationStatus(false);
    }

    public void putRightForkOnTable() {
        this.rightFork.setOccupationStatus(false);
    }

    public void eat() {
        synchronized (leftFork) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            takeLeftFork();
            if(!rightFork.isOccupationStatus()) {
                synchronized (rightFork) {
                    takeRightFork();
                    cdlPhilosopher.countDown();
                }
            } else {
                leftFork.setOccupationStatus(false);
                meditate();
                System.out.println();
                return;
            }
        }

        System.out.println(this.name + " кушает");
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        putLeftForkOnTable();
        putRightForkOnTable();
        this.hungryStatus = false;
    }

    public void meditate() {
        System.out.println(this.name + " думает...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.hungryStatus = true;
    }

    @Override
    public void run() {
        while (cdlPhilosopher.getCount() > 0) {

            if (!leftFork.isOccupationStatus()
                    && !rightFork.isOccupationStatus()
                    && this.hungryStatus) {
                eat();
            } else {
                meditate();
            }
            if (cdlPhilosopher.getCount() == 0) {
                System.out.println(this.name + " наконец-то закончил обедать.");
                count.countDown();
            }
        }
    }

    public void setTable(Table table) {
        this.table = table;
    }
}