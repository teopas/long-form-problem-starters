package model.exceptions;

/**
 * Created by thodoris on 18/11/2018.
 */
public class NotEnoughBeansException extends BeansAmountException {
    public NotEnoughBeansException(double beans) {
        super(beans, " are not enough beans!");
    }
}
