import Decorator.BorderDecorator;
import Decorator.ColorDecorator;
import objects.Component;
import objects.TextView;
import objects.Window;

public class DecoratorRun {
    public static void main(String[] args) {
        Component window = new Window();
        window.draw();

        Component newWindowWithBorder = new BorderDecorator(new Window());
        newWindowWithBorder.draw();

        Component newTextviewWithBorderAndColor = new BorderDecorator(new ColorDecorator(new TextView()));
        newTextviewWithBorderAndColor.draw();
    }
}
