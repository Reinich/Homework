package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    private List<IModelChangedObserver> observers = new ArrayList<>();

    private List<PolygonalModel> polygonalModels;
    private List<Scene> scenes;
    private List<Flash> flashes;
    private List<Camera> cameras;

    public ModelStore(List<PolygonalModel> polygonalModels, List<Scene> scenes, List<Flash> flashes, List<Camera> cameras) {
        this.polygonalModels = polygonalModels;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public void addPolygonalModel(PolygonalModel polygonalModel) {
        this.polygonalModels.add(polygonalModel);
        notifyChange();
    }

    public void addScene(Scene scene) {
        scenes.add(scene);
        notifyChange();
    }

    public void addFlash(Flash flash) {
        flashes.add(flash);
        notifyChange();
    }

    public void addCamera(Camera camera) {
        cameras.add(camera);
        notifyChange();
    }

    @Override
    public void registrationObserver(IModelChangedObserver observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(IModelChangedObserver observer){
        observers.remove(observer);
    }

    @Override
    public void notifyChange() {
        for (IModelChangedObserver observer : observers) {
            observer.applyUpdateModel();
        }
    }
}
