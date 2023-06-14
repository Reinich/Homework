package Task1;
public class Apple extends Fruit {
    private int count;
    {
        count++;
    }
    public int getCount() {
        return count;
    }

    public Apple() {
        super(1.0f);
    }
}
