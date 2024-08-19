package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Box <T extends Fruit>{

    private ArrayList<T> fruits;
    private int sizeBoxFruit;

    @SafeVarargs
    public Box(T... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public int getSizeBox() {
        return sizeBoxFruit;
    }

    public void addFruit(T fruit, int count){
        fruits = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            fruits.add(fruit);
        }
        sizeBoxFruit += count;
    }
    public float getWeight() {
        return fruits.get(0).getWeight() * getSizeBox();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(getWeight(), box.getWeight());
    }

}
