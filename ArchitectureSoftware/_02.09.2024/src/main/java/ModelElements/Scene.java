package ModelElements;

public class Scene {
    private int id;

    {
        id++;
    }

    private PolygonalModel models;
    private Flash flashes;
    private Camera camera;

    public Scene(PolygonalModel models, Camera camera) {
        this.models = models;
        this.camera = camera;
    }

    public Scene(PolygonalModel models, Flash flashes, Camera camera) {
        this.models = models;
        this.flashes = flashes;
        this.camera = camera;
    }

    public String method1(String text) {
        return text;
    }

    public String method2(String text1, String text2) {
        return text1 + " " + text2;
    }

    public PolygonalModel getModels() {
        return models;
    }

    public void setModels(PolygonalModel models) {
        this.models = models;
    }

    public Flash getFlashes() {
        return flashes;
    }

    public void setFlashes(Flash flashes) {
        this.flashes = flashes;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
