package ModelElements;

import java.awt.*;

public class Flash {
    private Color color;
    private Point3D location;
    private Float power;
    private Angle3D angle;

    public Flash(Color color, Point3D location, Float power, Angle3D angle) {
        this.color = color;
        this.location = location;
        this.power = power;
        this.angle = angle;
    }
    public Flash(){

    }

    public void move(Point3D location, Float where){
        if (where > 0){
            location.setX(where);

        }else {
            location.setY(where);
        }
    }
    public void rotate(Angle3D angle, Float where){
        if (where > 0){
            angle.turnRight(where);
        }else {
            angle.turnLeft(where);
        }
    }

}
