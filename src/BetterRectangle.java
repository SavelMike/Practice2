import java.awt.*;


public class BetterRectangle extends Rectangle {

    public BetterRectangle(int width, int height, int x, int y) {
        setLocation(x, y);
        setSize(width, height);
    }

    public double getPerimeter() {
        return (getHeight() + getWidth()) * 2;
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

}


