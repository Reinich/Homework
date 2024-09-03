package ModelElements;

public class Camera {
    private Point3D location;
    private Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }
    public Camera(){

    }

    public void rotate(Angle3D angle, Float where){
        if (where > 0){
            angle.turnRight(where);
        }else {
            angle.turnLeft(where);
        }
    }
    public void move(Point3D point, Float where){
        if (where > 0){
            point.setX(where);
        }else {
            point.setY(where);
        }
    }


}
