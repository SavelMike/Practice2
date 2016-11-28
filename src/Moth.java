import javax.swing.text.Position;

/**
 * Created by Михаил on 28.11.2016.
 */
public class Moth {

    private double Position;

    public Moth(double initialPosition) {
         Position = initialPosition;
    }

    public void moveToLight(double lightPosition) {
        Position = (Position + lightPosition) / 2;
    }

    public double getPosition() {
        return Position;
    }
}
