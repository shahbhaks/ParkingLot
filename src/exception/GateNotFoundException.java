package exception;

public class GateNotFoundException extends RuntimeException {
    public GateNotFoundException(String s) {
    }

    public GateNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public GateNotFoundException(Throwable cause) {
        super(cause);
    }

    public GateNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public GateNotFoundException() {
    }
}
