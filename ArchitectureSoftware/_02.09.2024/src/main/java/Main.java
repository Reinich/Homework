import InMemoryModel.*;
import ModelElements.*;
import ModelElements.Polygon;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();

        Point3D point3D = new Point3D(1.1, 2.0, 3.2);
        List<Point3D> point3DList = List.of(point3D);

        Angle3D angle3D = new Angle3D();

        Polygon polygon = new Polygon(point3DList);
        List<Polygon> polygons = List.of(polygon);

        PolygonalModel polygonalModel = new PolygonalModel(polygons);
        List<PolygonalModel> polygonalModelList = new ArrayList<>();
        polygonalModelList.add(polygonalModel);

        Camera camera = new Camera();
        List<Camera> cameraList = List.of(camera);

        Flash flash = new Flash(Color.GRAY, point3D, 3.0F, angle3D);
        List<Flash> flashList = List.of(flash);

        Scene scene = new Scene(polygonalModel, camera);
        List<Scene> sceneList = List.of(scene);

        ModelStore store = new ModelStore(polygonalModelList, sceneList, flashList, cameraList);
        store.registrationObserver(observer1);
        store.registrationObserver(observer2);

        PolygonalModel polygonalModel1 = new PolygonalModel(polygons);

        store.addPolygonalModel(polygonalModel1);

    }
}
