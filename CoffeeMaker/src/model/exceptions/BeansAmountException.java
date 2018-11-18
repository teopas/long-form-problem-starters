package model.exceptions;

/**
 * Created by thodoris on 18/11/2018.
 */
public class BeansAmountException extends Exception {

    private double beans;

    public BeansAmountException(double beans){
        super(String.format("%s is not the right amount of beans", beans));
        this.beans = beans;
    }

    protected BeansAmountException(double beans, String message) {
        super(String.format(String.valueOf(beans)).concat(message));
    }

    public double getBeans(){
        return beans;
    }
}
