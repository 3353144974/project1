package operation.day14.zy2.gk_2.test1;

public class ToothPainException extends PainExecption{
    public ToothPainException() {
    }

    public ToothPainException(String message) {
        super(message);
    }

    public ToothPainException(String message, Throwable cause) {
        super(message, cause);
    }

    public ToothPainException(Throwable cause) {
        super(cause);
    }

    public ToothPainException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
