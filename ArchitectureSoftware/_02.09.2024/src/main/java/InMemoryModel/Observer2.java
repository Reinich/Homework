package InMemoryModel;

public class Observer2 implements IModelChangedObserver{
    @Override
    public void applyUpdateModel() {
        System.out.println("что-то изменилось");
    }
}
