package model.exceptions;

/**
 * Created by thodoris on 18/11/2018.
 */
public class TooManyBeansException extends BeansAmountException {
    public TooManyBeansException(double beans) {
        super(beans, " are too many beans");
    }
}
