package C9_Exception._throw;

import java.io.Serial;

public class BelowZeroException extends RuntimeException{

    @java.io.Serial
    private static final long serialVersionUID = -7190745766941L; //
    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public BelowZeroException(Throwable cause) {
        super(cause);
    }

    public BelowZeroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
