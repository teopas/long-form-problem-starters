package model.exceptions;

/**
 * Created by thodoris on 18/11/2018.
 */
public class NoCupsRemainingException extends Exception {

    public NoCupsRemainingException(){
        super("No cups remaining to pour!");
    }
}
