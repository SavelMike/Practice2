/**
 * Created by Михаил on 28.11.2016.
 */
public class Bug {

    private int Position;
    private boolean movingLeft;

    public Bug(int initialPosition) {
        Position = initialPosition;
        movingLeft = false;
    }

    public void turn() {
        if (movingLeft) {
            movingLeft = false;
        } else {
            movingLeft = true;
        }
    }

    public void move() {
        if (movingLeft) {
            Position--;
        }else {
            Position++;
        }
    }

    public int getPosition() {
        return Position;
    }
}
