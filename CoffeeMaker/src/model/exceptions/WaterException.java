package model.exceptions;

/**
 * Created by thodoris on 18/11/2018.
 */
public class WaterException extends Exception {
    private double cups;

    public WaterException(double cups) {
        super(String.format("%s are not enough cups!", cups));
        this.cups = cups;
    }

    public double getCups() {
        return cups;
    }
}
