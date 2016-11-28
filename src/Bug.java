/**
 * Created by Михаил on 28.11.2016.
 */
public class Bug {

    private int Position;
    private boolean direction;

    public Bug(int initialPosition) {
        Position = initialPosition;
        direction = false;
    }

    public void turn() {
        direction = true;
    }

    public void move() {
        if (direction = false) {
            Position++;
        }else {
            Position--;
        }
    }

    public int getPosition() {
        return Position;
    }
}
