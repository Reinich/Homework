package ModelElements;

import java.util.List;

public class Polygon {
    private List<Point3D> points;

    public Polygon(List<Point3D> points) {
        this.points = points;
    }

    public List<Point3D> getPoints() {
        return points;
    }
}
