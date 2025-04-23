package lecture.exception.section2.exception;

public class PriceNegativeException extends RuntimeException {
    public PriceNegativeException(String message) {
        super(message);
    }
}
