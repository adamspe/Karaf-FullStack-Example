package com.notio.example.fse;

public class FseException extends RuntimeException {
    private static final long serialVersionUID = -6755575772184973089L;

    public FseException() {
        super();
    }

    public FseException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public FseException(String message, Throwable cause) {
        super(message, cause);
    }

    public FseException(String message) {
        super(message);
    }

    public FseException(Throwable cause) {
        super(cause);
    }
}
