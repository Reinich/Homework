package InMemoryModel;

public interface IModelChanger {
    void notifyChange();
    void removeObserver(IModelChangedObserver observer);
    void registrationObserver(IModelChangedObserver observer);
}
