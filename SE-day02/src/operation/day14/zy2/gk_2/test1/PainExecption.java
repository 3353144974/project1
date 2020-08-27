package operation.day14.zy2.gk_2.test1;

public class PainExecption extends Exception{
    public PainExecption() {
    }

    public PainExecption(String message) {
        super(message);
    }

    public PainExecption(String message, Throwable cause) {
        super(message, cause);
    }

    public PainExecption(Throwable cause) {
        super(cause);
    }

    public PainExecption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
