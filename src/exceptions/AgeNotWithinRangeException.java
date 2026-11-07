package exceptions;

public class AgeNotWithinRangeException extends RuntimeException {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}
