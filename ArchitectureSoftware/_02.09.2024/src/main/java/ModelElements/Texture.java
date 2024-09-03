package ModelElements;

public class Texture {
    private int id;
    {
        id++;
    }
    private String name;

    public Texture(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
