package InMemoryModel;

public class Observer1 implements IModelChangedObserver{
    @Override
    public void applyUpdateModel() {
        System.out.println("что-то изменилось");
    }
}
