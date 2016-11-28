/**
 * Created by Михаил on 28.11.2016.
 */
public class Bug {

    private int Position;
    private boolean movingLeft;

    public Bug(int initialPosition) {
        Position = initialPosition;
        movingLeft = true;
    }

    public void turn() {
        if (movingLeft == false) {
            movingLeft = true;
        } else {
            movingLeft = false;
        }
    }

    public void move() {
        if (movingLeft == false) {
            Position++;
        }else {
            Position--;
        }
    }

    public int getPosition() {
        return Position;
    }
}
