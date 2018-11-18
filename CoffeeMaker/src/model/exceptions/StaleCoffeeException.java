package model.exceptions;

/**
 * Created by thodoris on 18/11/2018.
 */
public class StaleCoffeeException extends Exception {
    private int time;

    public StaleCoffeeException(int time) {
        super(String.format("%s time since brew is too much!"));
        this.time = time;
    }

    public int getTime() {
        return time;
    }
}
