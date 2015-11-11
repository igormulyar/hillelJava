package Exceptions.myExceptions;

/**
 * Created by TRUST on 11.11.2015.
 */
public class WrongIndexException extends Exception {

    public WrongIndexException() {
    }

    public WrongIndexException(String message) {
        super(message);
    }
}
