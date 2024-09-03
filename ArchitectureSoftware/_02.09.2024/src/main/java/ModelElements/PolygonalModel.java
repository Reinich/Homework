package ModelElements;

import java.util.List;

public class PolygonalModel {
    private List<Texture> textures;
    private List<Polygon> polygons;

    public PolygonalModel(List<Texture> textures, List<Polygon> polygons) {
        this.textures = textures;
        this.polygons = polygons;
    }

    public PolygonalModel(List<Polygon> polygons) {
        this.polygons = polygons;
    }

    public List<Texture> getTextures() {
        return textures;
    }

    public List<Polygon> getPolygons() {
        return polygons;
    }
}
